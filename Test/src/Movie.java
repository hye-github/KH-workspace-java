import java.util.Scanner;



public class Movie {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		Netflix[] movie = new Netflix[10];



		int count = 0;



		while (true) {

			System.out.println("<< Netflix >>");

			System.out.println("1. 신규 영화 등록");

			System.out.println("2. 영화 목록 출력");

			System.out.println("3. 영화 검색 (제목으로 검색)");

			System.out.println("4. 프로그램 종료");

			System.out.print("선택>>");

			int menu = Integer.parseInt(sc.nextLine());



			switch (menu) {

			case 1:

				System.out.print("영화 제목 : ");

				String name = sc.nextLine();

				System.out.print("영화 장르 : ");

				String genre = sc.nextLine();

				System.out.print("영화 평점 : ");

				Double point = Double.parseDouble(sc.nextLine());

				movie[count] = new Netflix(name, genre, point);

				count++;

				break;



			case 2:

				if (count == 0) {

					System.out.println("출력할 내용이 없습니다.");

				} else {

					System.out.println("제목\t장르\t평점");

					for (int i = 0; i < count; i++) {

						movie[i].getContents();

					}

				}

				break;



			case 3:

				System.out.print("찾는 영화 제목 : ");

				String find = sc.nextLine();



				int counting = 0;



				for (int i = 0; i < count; i++) {

					String str = movie[i].getName();

					if (find.equals(str)) {

						System.out.println("제목\t장르\t평점");

						movie[i].getContents();

						System.out.println("");

						counting++;

					}

				}

				if (counting == 0) {

					System.out.println("찾을 수 없습니다.");



				}

				break;

			case 4:

				System.out.println("프로그램을 종료합니다.");

				System.exit(0);

			default:

				System.out.println("다시 확인해주세요.");

			}



		}

	}


}

