import java.util.Scanner;



public class UpDownGame {



	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		int result = 0;

		

		abc : while(true) {

			

			int trial = 0;

			System.out.println("==UP & DOWN GAME ==");

			System.out.println("");

			System.out.println("1. Game Start");

			System.out.println("2. Game Score");

			System.out.println("3. End Game");

			

			int UserMenuNum = Integer.parseInt(sc.nextLine());

			

			switch(UserMenuNum) {

			case 3:

				System.out.println("게임을 종료합니다");

				System.exit(0);

				break;

			case 1:

				int com = (int)(Math.random()*99+1);

				

				System.out.println("<< Game Start >>");

				System.out.print("Input Number : ");

				

				while(true) {



					int UserInputNum = Integer.parseInt(sc.nextLine());

					

					if(UserInputNum > com) {

						System.out.println("<< DOWN >>");

						trial++;

					}else if(UserInputNum < com) {

						System.out.println("<< UP >>");

						trial++;

					}else {

						System.out.println("정답입니다!");

trial++;

						if (result == 0) {

							result = trial;

						}else {

							if(trial < result) {

								result = trial;

							}

						}

						continue abc;

					}

									

			}

			

			case 2:

				if(result == 0) {

					System.out.println("플레이기록이 없습니다.");

				}else {

					System.out.println("현재 최단기록은 " + result + " 회 입니다.");

				}

				

			break;

			

			default:

				System.out.println("번호를 다시 확인해주세요.");

			}

		}

	}

}