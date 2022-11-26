package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;


//* 방명록 프로그램 제작하기
//필요 데이터 : 글 번호 / 작성자 / 글 내용 / 작성날짜 및 시간
//(날짜 값은 java.sql.Date -> Date 인스턴스 .getTime() 메서드는 timestamp )
//			java.sql.Timestamp -> Timestamp 인스턴스 .getTime()메서드는 timestamp
//
//조건0. 프로그램 컨셉에 따른 데이터 저장 테이블을 만들고, sequence를 꼭 만들어 적용할 것
//조건1. MVC 패턴을 적용하며 입력/삭제/수정 기능은 DAO 를 만들어 적용할 것 ( 조회 기능은 아직 안배웠기 때문에 main에 제작 )
//조건2. 기본 CRUD 기능 및 검색 기능까지 만들 것
// 세부 조건0. 출력 기능은 필요데이터 전부를 출력하되 작성 날짜는 MM월dd일 hh시:mm분 형태로 출력할 것  
// 세부 조건1. 삭제와 수정은 글 번호 값을 기반으로 제작
// 세부 조건2. 검색 기능은 작성자 이름을 기반으로 제작
// 세부 조건3. 수정 기능은 글 번호와 작성날짜를 제외한 데이터를 재 입력받는 기능으로 제작
// 세부 조건4. 수정/삭제/검색 기능은 대상 데이터를 찾지 못 할 시, "대상을 찾을 수 없습니다" 출력 하기




public class Guestbook {
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}

		GuestbookDAO dao = new GuestbookDAO();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		
			System.out.println("<< 방명록 게시판 >>");
			System.out.println("1. 방명록 쓰기");
			System.out.println("2. 방명록 읽기");			
			System.out.println("3. 방명록 지우기");
			System.out.println("4. 방명록 수정하기");
			System.out.println("5. 방명록 검색하기");
			System.out.println("0. 프로그램 종료");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				
				System.out.print("작성자 : ");
				String pname = sc.nextLine();
				
				System.out.print("글내용 : ");
				String pcontents = sc.nextLine();
		        
				try {
					int result = dao.insert(pname,pcontents);
					if(result > 0) {
						System.out.println("입력 완료");
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("같은 오류가 반복되면 관리자에게 문의하세요.");
				}
				
			}else if(menu == 2) {
				
				try {
					String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
					String dbID = "gb";
					String dbPW = "gb";

					Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);

					String sql = "select * from guestbook order by 1";

					PreparedStatement pstat = con.prepareStatement(sql);
					ResultSet rs = pstat.executeQuery();

					SimpleDateFormat sdf= new SimpleDateFormat("MM월 dd일 hh시:mm분");

					while(rs.next()) {
						int pid = rs.getInt(1);
						String pname = rs.getString(2);
						String pcontents = rs.getString(3);
						Timestamp pdate = rs.getTimestamp(4);	
						
						System.out.println(pid  + " : " + pname + " : " 
								+ pcontents + " : " + sdf.format(pdate.getTime()));
					}
					
					con.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
//long miliseconds = System.currentTimeMillis();
//Date date = new Date(miliseconds);	        
//SimpleDateFormat sdf= new SimpleDateFormat("MM"+"월 "+"dd"+"일 "+"hh"+"시:"+"mm"+"분");
//String pdate= sdf.format(date.getTime());
//System.out.println("글 등록 시간은 "+ pdate + " 입니다.");

				
			}else if(menu == 3) {
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
				
			}else if(menu == 4) {

				System.out.print("수정할 메뉴 ID 입력 : ");
				int editPID = Integer.parseInt(sc.nextLine());
				
				System.out.print("수정 작성자 입력 : ");
				String editPNAME = sc.nextLine();
				
				System.out.print("수정 글내용 입력 : ");
				String editPCONTENTS = sc.nextLine();
				
				int result;
				try {
					result = dao.edit(editPNAME,editPCONTENTS,editPID);
					if(result > 0) {
						System.out.println("수정 성공");
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("같은 오류가 반복되면 관리자에게 문의하세요.");
				}
				
				
			}else if(menu == 5) {
				System.out.print("작성자 검색 : ");
				String search = sc.nextLine();
				
				try {
					String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
					String dbID = "gb";
					String dbPW = "gb";
					Connection con  = DriverManager.getConnection(dbURL, dbID, dbPW);
					
					String sql = "select * from guestbook where pname = ?";

					PreparedStatement pstat = con.prepareStatement(sql);

					pstat.setString(1, search);
					
					ResultSet rs = pstat.executeQuery();

					SimpleDateFormat sdf= new SimpleDateFormat("MM월 dd일 hh시:mm분");

					while(rs.next()) {
						int pid = rs.getInt(1);
						String pname = rs.getString(2);
						String pcontents = rs.getString(3);
						Timestamp pdate = rs.getTimestamp(4);	
						
						System.out.println(pid  + " : " + pname + " : " 
								+ pcontents + " : " + sdf.format(pdate.getTime()));
					}
					
					con.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
				
			}else if(menu == 0) {
				System.out.println("게시판을 종료합니다.");
				System.exit(0);
			}else {
				System.out.println("메뉴를 다시 확인해주세요.");
			}
		}

	}
}
