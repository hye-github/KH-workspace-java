import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {

		//		<< Netflix >>
		//		1. 신규 영화 등록
		//		2. 영화 목록 출력
		//		3. 영화 검색 (제목으로 검색 or 장르도 무관)
		//		4. 프로그램 종료
		//		선택 >> 
		//		
		//		1번 선택시
		//		영화의 제목, 장르, 평점을 입력받아 저장소에 저장 (클래스 이름이나 배열 이름 등은 알아서 .. )
		//		
		//		2번 선택시
		//		배열에 저장 되어있는 모든 영화 정보를 제목 / 장르 / 평점 순으로 출력
		//		배열에 한명의 정보도 저장되어 있지 않을 시, "출력할 내용이 없습니다." 라고 안내.
		//		
		//		3번 선택시
		//		검색할 영화를 입력 받아, 검색된 대상의 제목 / 장르 / 평점만 출력

		Scanner sc = new Scanner(System.in);

		Movie[] mov = new Movie[10];

		int count = 0;
		int i = 0;
		int menu;

		menu : while(true) {

			System.out.println("<< Netflix >>");
			System.out.println("1. 신규 영화 등록");
			System.out.println("2. 영화 목록 출력");
			System.out.println("3. 영화 검색");
			System.out.println("4. 프로그램 종료");

			//			try {

			while(true) {
				try {
					System.out.print("선택 >> ");
					menu = Integer.parseInt(sc.nextLine());
					break;

				}catch(Exception e) {
					System.out.println("메뉴를 확인하세요.");
				}
			}



			if(menu == 1){
				while(true) {
					try {
						System.out.println("신규 영화를 등록합니다.");
						System.out.print("영화 제목 입력 : ");
						String title = sc.nextLine();
						System.out.print("영화 장르 입력[romance/comedy/horror/etc] : ");
						String genre = sc.nextLine();
						System.out.print("영화 평점 입력[1~5(점)사이의 숫자만 입력] : ");
						int grade = Integer.parseInt(sc.nextLine());
						mov[count++] = new Movie(title, genre, grade); //대응
						System.out.println("영화 등록이 완료 되었습니다.");
						continue menu;

					} catch(Exception e) {
						System.out.println("옳바른 입력이 아닙니다. 제대로 입력해주세요.");
						continue;
					}
				}

			} else if(menu == 2){

				if(count==0) {
					System.out.println("출력할 내용이 없습니다.");
					continue;
										
				} else { 
					if(count > 0) {
						System.out.println("제목\t장르\t평점");
						}
					for(i = 0;i < count;i++) {
						System.out.println(mov[i].getTitle() + "\t" + mov[i].getGenre() + "\t" + mov[i].getGrade());		
					}
				}

			} else if(menu == 3){

				if(count==0) {
					System.out.println("출력할 내용이 없습니다.");
					continue;

				} else { 

					System.out.println("검색 방식을 선택해주세요.");
					System.out.println("(1) 영화 제목으로 검색");
					System.out.println("(2) 영화 장르로 검색");
					System.out.println("(3) 영화 평점으로 검색");
					System.out.print("선택 >> ");

					int search = Integer.parseInt(sc.nextLine());

					if(search == 1) {
						System.out.println("(1) 영화 제목으로 검색");
						//.contains(title); 아직 구현 안함

					} else if(search == 2) {

						System.out.println("찾고자하는 영화 장르를 입력해주세요.[romance/comedy/horror/etc]");
						System.out.print(">> ");
						String searchgenre = sc.nextLine();

						int countgenre = 0;
						
						if(count > 0) {
						System.out.println("제목\t장르\t평점");
						}
						
						for(i = 0;i < count;i++) {
							if(searchgenre.equals(mov[i].getGenre())) {
								System.out.println(mov[i].getTitle() + "\t" + mov[i].getGenre() + "\t" + mov[i].getGrade());
								countgenre++;
							}
						}

						if(countgenre == 0) {
							System.out.println("출력할 내용이 없습니다.");
						}

					} else if(search == 3) {

						System.out.println("찾고자하는 영화 평점을 입력해주세요.[1~5(점)사이의 숫자만 입력]");
						System.out.print(">> ");
						int searchgrade = Integer.parseInt(sc.nextLine());

						int countgrade = 0;
						
						if(count > 0) {
							System.out.println("제목\t장르\t평점");
							}
						
						for(i = 0;i < count;i++) {
							if(searchgrade == mov[i].getGrade()) {
								System.out.println(mov[i].getTitle() + "\t" + mov[i].getGenre() + "\t" + mov[i].getGrade());
								countgrade++;
							}
						}

						if(countgrade == 0) {
							System.out.println("출력할 내용이 없습니다.");
						}


					} else {
						System.out.println("옳바른 입력이 아닙니다. 제대로 입력해주세요.");
					}
				}


			} else if(menu == 4){
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);

			} else{
				System.out.println("옳바른 메뉴 선택이 아닙니다. 숫자를 다시 입력해주세요.");
				continue;
			}

			//			} catch(Exception e) {
			//				System.out.println("옳바른 메뉴 선택이 아닙니다. 숫자를 다시 입력해주세요.error");
			//				continue;
			//			}


		}

	}
}
