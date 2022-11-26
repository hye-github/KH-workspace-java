
//* 방명록 프로그램 제작하기
//필요 데이터 : 글 번호 / 작성자 / 글 내용 / 작성날짜 및 시간
//(날짜 값은 java.sql.Date -> Date 인스턴스 .getTime() 메서드는 timestamp )
//				java.sql.Timestamp -> Timestamp 인스턴스 .getTime()메서드는 timestamp
//
//조건0. 프로그램 컨셉에 따른 데이터 저장 테이블을 만들고, sequence를 꼭 만들어 적용할 것
//조건1. MVC 패턴을 적용하며 입력/삭제/수정 기능은 DAO 를 만들어 적용할 것 ( 조회 기능은 아직 안배웠기 때문에 main에 제작 )
//조건2. 기본 CRUD 기능 및 검색 기능까지 만들 것
// 세부 조건0. 출력 기능은 필요데이터 전부를 출력하되 작성 날짜는 MM월dd일 hh시:mm분 형태로 출력할 것  
// 세부 조건1. 삭제와 수정은 글 번호 값을 기반으로 제작
// 세부 조건2. 검색 기능은 작성자 이름을 기반으로 제작
// 세부 조건3. 수정 기능은 글 번호와 작성날짜를 제외한 데이터를 재 입력받는 기능으로 제작
// 세부 조건4. 수정/삭제/검색 기능은 대상 데이터를 찾지 못 할 시, "대상을 찾을 수 없습니다" 출력 하기


//create table guestbook(
//    seq number primary key,
//    title varchar(300) not null,
//    contents varchar(4000) not null, --한글로 1300자
//    write_date date default sysdate not null
//);
//
//create sequence guestbook_seq 
//start with 1
//increment by 1
//nomaxvalue
//nocache;
//
//alter table guestbook modify (write_date timestamp default sysdate);


package main;

import java.util.List;
import java.util.Scanner;

import dao.GuestbookDAO;
import dto.GuestbookDTO;


public class main {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		GuestbookDAO dao = GuestbookDAO.getInstance();
	
		
		while(true) {

			System.out.println("<< 방명록 프로그램 >>");
			System.out.println("1. 글 남기기");
			System.out.println("2. 글 목록 보기");					
			System.out.println("3. 글 삭제하기 ( 글 번호로 삭제 )");
			System.out.println("4. 글 수정하기 ( 글 번호로 수정 )");
			System.out.println("5. 글 검색하기 ( 작성자로 검색 ) ");
			System.out.println("0. 프로그램 종료");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {

				System.out.print("작성자 : ");
				String writer = sc.nextLine(); // 이 내용을 db에 전달해야함. db작업은 dao에서 하기

				System.out.print("메세지 : ");
				String contents = sc.nextLine(); // 이 내용을 db에 전달해야함. db작업은 dao에서 하기

				//	dao.insert(writer,contents);


				try {
					int result = dao.insert(new GuestbookDTO(0,writer,contents,null));
					if(result > 0) {
						System.out.println("입력 완료");
					}
				} catch (Exception e) {
					e.printStackTrace(); // 배포 단계에선 빼기
					System.out.println("같은 오류가 반복되면 관리자에게 문의하세요.");
				}


			}else if(menu == 2) {


				try {
					List<GuestbookDTO> result = dao.selectALL(); // 저장하는 작업 필요 // ArrayList 라고 안하고 List 라고하는 표현을 많이 쓴다.

					for(GuestbookDTO dto : result) { // Day_12_StudentManager
						System.out.println(dto.getSeq() + "\t" + dto.getWriter() + "\t" + dto.getContents() + "\t" + dto.getFormedDate());
					}

				} catch (Exception e) {
					// TODO: handle exception
				}



				//						while(rs.next()) {
				//						int seq = rs.getInt("seq");
				//						String writer = rs.getString("title");
				//						String contents = rs.getString("contents");
				//						Date write_date = rs.getDate("write_date");	// .getDate 하는 순간에 시간값이 날아감
				//						
				//						SimpleDateFormat sdf= new SimpleDateFormat("MM월dd일 hh시mm분");
				//						String formed_write_date = sdf.format(write_date);
				//						
				//						System.out.println(seq  + "\t" + writer + "\t" 
				//								+ contents + "\t" + formed_write_date);
				//					}



			}else if(menu == 3) {
				System.out.print("삭제할 글의 번호 : ");
				int seq = Integer.parseInt(sc.nextLine());

				//				dao.delete(seq); // dao야, 지워줘.


				int result;
				try {
					result = dao.delete(seq); // 지워라
					if(result > 0) {
						System.out.println("삭제 성공");
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("같은 오류가 반복되면 관리자에게 문의하세요.");
				}





			}else if(menu == 4) {
				System.out.print("수정할 글의 번호 : ");
				int seq = Integer.parseInt(sc.nextLine());

				try {
					if(dao.isSeqExist(seq)) {

						System.out.print("수정할 작성자 : ");
						String writer = sc.nextLine();

						System.out.print("수정할 메세지 : ");
						String contents = sc.nextLine();

						int result = dao.update(new GuestbookDTO(seq,writer,contents,null));

						if(result > 0) {
							System.out.println("변경 완료");
						}
					}else {
						System.out.println("수정할 대상 글이 존재하지 않습니다.");
					}
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("문제가 발생했습니다. 관리자에게 문의하세요.");
					System.out.println("manager@admin.com");
				}



			}else if(menu == 5) {
				System.out.print("검색 할 작성자 입력 : ");
				String pwriter = sc.nextLine();

				//				​​​​​​​​result = str.contains("Wo"); // charSequence 을 String 으로 해석
				//				​​​​​​​​System.out.println("Wo가 포함 ? " +  result);				

				try {
					if(dao.isWriterExist(pwriter)) {

						List<GuestbookDTO> result = dao.searchByWriter(pwriter); // 저장하는 작업 필요 // ArrayList 라고 안하고 List 라고하는 표현을 많이 쓴다.

						for(GuestbookDTO dto : result) { // Day_12_StudentManager
							System.out.println(dto.getSeq() + "\t" + dto.getWriter() + "\t" + dto.getContents() + "\t" + dto.getFormedDate());
						}

					}else {
						System.out.println("검색 대상자가 존재하지 않습니다.");
					}

				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("문제가 발생했습니다. 관리자에게 문의하세요.");
					System.out.println("manager@admin.com");
				}


			}else if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}else {
				System.out.println("메뉴를 다시 확인해주세요.");
			}
		}

	}
}