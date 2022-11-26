import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Exam_05_CRUD {
	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver"); // 얘는 어디서나 사용되는 기능이라 위쪽에 빼놓는게 좋음
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "kh";
		String dbPW = "kh";

		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("<< 카페 메뉴 관리 프로그램 >>");
			System.out.println("1. 신규 메뉴 등록");
			System.out.println("2. 메뉴 목록 출력");
			System.out.println("3. 메뉴 삭제 (상품코드로 삭제)");
			System.out.println("4. 메뉴 수정 (상품코드로 변경)");		
			System.out.println("0. 프로그램 종료");
			System.out.print(">> ");

			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {

				System.out.print("메뉴 이름 : ");
				String pname = sc.nextLine();

				System.out.print("메뉴 가격 : ");
				int pprice = Integer.parseInt(sc.nextLine());

				System.out.print("아이스 가능 (Y,N) ? ");
				String iced = sc.nextLine();

				Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
				Statement stat = con.createStatement();

				String sql = 
						"insert into cafe_menu values(cafe_menu_seq.nextval,'" + pname + "'," + pprice + ",'" + iced + "')";

				int result = stat.executeUpdate(sql);

				if(result > 0) {
					System.out.println("입력 성공");
//					} else {
//					System.out.println("입력 실패");  //실패될리가 없어서 굳이 없어도 됨
				}
				con.commit();
				con.close();

			}else if(menu == 2){ //조회
				Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
				Statement stat = con.createStatement();

				String sql = "select * from cafe_menu order by 1";
				ResultSet rs = stat.executeQuery(sql);

				while(rs.next()) {
					int pid = rs.getInt(1); 
					String pname = rs.getString(2);
					int pprice = rs.getInt(3);
					String iced = rs.getString(4);

					System.out.println(pid + " : " + pname + " : " + pprice + " : " + iced);
				}
				con.close();


			}else if(menu == 3){ //삭제
				
				System.out.print("삭제할 메뉴 ID 입력 : ");
				int delPID = Integer.parseInt(sc.nextLine());
				
				Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
				Statement stat = con.createStatement();
				
				String sql = "delete from cafe_menu where pid = " + delPID;

				int result = stat.executeUpdate(sql);
				
				if(result > 0) {
					System.out.println("삭제 성공");
				}
				con.commit();
				con.close();

			}else if(menu == 4){ //수정
	
				// 이전 Statement
				
				Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
				Statement stat = con.createStatement(); // Statement 객체 사용시 ''""+로 연결해야함. 변수 조립이 불편하다. 보안성이 취약하다.
				
				System.out.print("수정할 메뉴 ID 입력 : ");
				int updPID = Integer.parseInt(sc.nextLine());
				
				System.out.print("수정할 메뉴명: ");
				String pname = sc.nextLine();
				System.out.print("수정할 가격 : ");
				int pprice = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 아이스 여부(Y,N) : ");
				String iced = sc.nextLine();
				
				String sql = "Update cafe_menu set pname ='" + pname + "', pprice =" + pprice + ", iced = '" + iced + "' where pid = " + updPID;

				int result = stat.executeUpdate(sql);
			
				if(result>0) {
					System.out.println("수정 성공");
				}
				
				con.commit();
				con.close();


//				System.out.print("수정할 메뉴 ID 입력 : ");
//				int pid = Integer.parseInt(sc.nextLine());
//
//				System.out.println("<< 수정할 항목 선택 >>");
//				System.out.println("1) 메뉴명 수정하기");
//				System.out.println("2) 메뉴 가격 수정하기");
//				System.out.println("3) 아이스 여부(Y,N) 수정하기");
//				System.out.print(">> ");
//				int selectUD = Integer.parseInt(sc.nextLine());
//
//				if(selectUD==1) {
//					System.out.print("수정할 메뉴명: ");
//					String pnameUD = sc.nextLine();
//					String sql = "Update cafe_menu set pname ='" + pnameUD + "' where pid = " + pid;
//					
//					int reselt = stat.executeUpdate(sql);
//					if(reselt>0) {
//						System.out.println("수정 성공");
//					}
//
//					con.commit();
//					con.close();
//				}else if(selectUD==2){
//					System.out.print("수정할 가격 : ");
//					int ppriceUD = Integer.parseInt(sc.nextLine());
//					String sql = "Update cafe_menu set pprice =" + ppriceUD + "where pid = " + pid;
//
//					int reselt = stat.executeUpdate(sql);
//					if(reselt>0) {
//						System.out.println("수정 성공");
//					}
//
//					con.commit();
//					con.close();
//				}else if(selectUD==3){
//					System.out.print("수정할 아이스 여부(Y,N) : ");
//					int icedUD = Integer.parseInt(sc.nextLine());
//					String sql = "Update cafe_menu set iced = '" + icedUD + "' where pid = " + pid;
//
//					int reselt = stat.executeUpdate(sql);
//					if(reselt>0) {
//						System.out.println("수정 성공");
//					}
//
//					con.commit();
//					con.close();
//				}else{
//					System.out.println("메뉴를 다시 확인해주세요.");
//				}


			}else if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}else {
				System.out.println("메뉴를 다시 확인해주세요.");
			}
		}
	}
}

