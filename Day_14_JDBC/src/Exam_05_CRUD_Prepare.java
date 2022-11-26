
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class Exam_05_CRUD_Prepare {
		public static void main(String[] args) {
			
			// DBCP :
			// Singleton Pattern : 특정 클래스들은 new를 자유롭게 사용해서 안되고
			//						단 하나의 인스턴스로만 사용하게끔 제안해야하는데 이때 사용되는 디자인 패턴
			
			
			
			
			

//			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
//			String dbID = "kh";
//			String dbPW = "kh";
			
			
			Scanner sc = new Scanner(System.in);

			
//			CafeMenuDAO dao = new CafeMenuDAO(); 변환시키기
			CafeMenuDAO dao = CafeMenuDAO.getInstance(); // new는 막되 기능 쓸 수 있게, 조건부를 달아서 new를 할 수도 있게 조절가능.
			
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
					
					try {
						int result = dao.insert(new CafeMenuDTO(0,pname,pprice,iced));
						// pid 자리에 아무거나 넣어도 됨. 왜? insert할 때 이 값 안쓰니까.
						// 생성자 pname,pprice,iced 에 넘겨서 insert로 넘기는 것
						// 한개씩 값 넘기는 것은 불편하다. int, String 등 자료형이 매번 다르니까
						
						if(result > 0) {
							System.out.println("입력 완료");
						}
					} catch (Exception e) {
						e.printStackTrace(); // 얘는 error 가 왜 났는지 보여주는 메서드임
											// 개발 단계에는 얘를 넣고, 완성 단계에서는 뺌
						System.out.println("같은 오류가 반복되면 관리자에게 문의하세요.");
					}
					

//					Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
//
//					String sql = 
//							"insert into cafe_menu values(cafe_menu_seq.nextval,?,?,?)";
//					
//					PreparedStatement pstat = con.prepareStatement(sql);
//					pstat.setString(1,pname);
//					pstat.setInt(2, pprice);
//					pstat.setString(3, iced);
//
//					int result = pstat.executeUpdate();
//
//					if(result > 0) {
//						System.out.println("입력 성공");
//					}
//					con.commit();
//					con.close();

				}else if(menu == 2){ //조회
					
									
					
					try {
						List<CafeMenuDTO> result = dao.selectALL(); // 저장하는 작업 필요 // ArrayList 라고 안하고 List 라고하는 표현을 많이 쓴다.

						for(CafeMenuDTO dto : result) { // Day_12_StudentManager
							System.out.println(dto.getPid() + "\t" + dto.getPname() + "\t" + dto.getPprice() + "\t" + dto.getIced());
						}

					} catch (Exception e) {
						// TODO: handle exception
					}

					

					

				}else if(menu == 3){ //삭제
					
					System.out.print("삭제할 메뉴 ID 입력 : ");
					int delPID = Integer.parseInt(sc.nextLine());
					
					int result;
					try {
						result = dao.delete(delPID);
						if(result > 0) {
							System.out.println("삭제 성공");
						}
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("같은 오류가 반복되면 관리자에게 문의하세요.");
					}
					
				
//					System.out.print("삭제할 메뉴 ID 입력 : ");
//					int delPID = Integer.parseInt(sc.nextLine());
//					
//					Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
//					
//					String sql = "delete from cafe_menu where pid = ?";
//					PreparedStatement pstat = con.prepareStatement(sql);
//					pstat.setInt(1,delPID);
//					
//					int result = pstat.executeUpdate();
//					
//					if(result > 0) {
//						System.out.println("삭제 성공");
//					}
//					con.commit();
//					con.close();

				}else if(menu == 4){ //수정
		
					System.out.print("수정할 메뉴 ID 입력 : ");
					int updPID = Integer.parseInt(sc.nextLine());
					
					System.out.print("수정할 메뉴명: ");
					String pname = sc.nextLine();
					System.out.print("수정할 가격 : ");
					int pprice = Integer.parseInt(sc.nextLine());
					System.out.print("수정할 아이스 여부(Y,N) : ");
					String iced = sc.nextLine();
					
					
					
					try {
						int result = dao.update(new CafeMenuDTO(updPID,pname,pprice,iced));

						if(result>0) {
							System.out.println("수정 성공");
						} 
					} catch (Exception e) {
						e.printStackTrace(); // 얘는 error 가 왜 났는지 보여주는 메서드임
						// 개발 단계에는 얘를 넣고, 완성 단계에서는 뺌
						System.out.println("같은 오류가 반복되면 관리자에게 문의하세요.");
					}
					
					
//					System.out.print("수정할 메뉴 ID 입력 : ");
//					int updPID = Integer.parseInt(sc.nextLine());
//					
//					System.out.print("수정할 메뉴명: ");
//					String pname = sc.nextLine();
//					System.out.print("수정할 가격 : ");
//					int pprice = Integer.parseInt(sc.nextLine());
//					System.out.print("수정할 아이스 여부(Y,N) : ");
//					String iced = sc.nextLine();
//					
//					Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
//					String sql = "Update cafe_menu set pname = ?, pprice = ?, iced = ? where pid = ?";
//
//					PreparedStatement pstat = con.prepareStatement(sql);
//					pstat.setString(1, pname);
//					pstat.setInt(2, pprice);
//					pstat.setString(3, iced);
//					pstat.setInt(4, updPID);
//					
//					int result = pstat.executeUpdate();
//				
//					if(result>0) {
//						System.out.println("수정 성공");
//					}
//					
//					con.commit();
//					con.close();

				}else if(menu == 0) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}else {
					System.out.println("메뉴를 다시 확인해주세요.");
				}
			}
		}
	}

