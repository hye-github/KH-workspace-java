import java.util.Scanner;

public class LottoSimulator_ver2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0;

		while(true) {

			try {
				while(true) {
					System.out.println("1. 로또 번호 추천");
					System.out.println("2. 로또 수동 구매");
					System.out.println("0. 시뮬레이터 종료");
					System.out.print(">> ");
					int menu = Integer.parseInt(sc.nextLine());

					if(menu == 0) {
						System.out.print("시뮬레이터를 종료합니다.");
						System.exit(0);		

					} else if(menu == 1) {

						int[] lottoauto = new int[44];

						for(i=0;i<lottoauto.length;i++) {
							lottoauto[i] = i + 1;
						}


						for(i=0;i<lottoauto.length*10;i++) {

							int x = (int)(Math.random()*44);
							int y = (int)(Math.random()*44);

							int tmp = lottoauto[x];
							lottoauto[x] = lottoauto[y];
							lottoauto[y] = tmp;
						}

						System.out.println("추천 번호는");
						System.out.println(lottoauto[0] + " " + lottoauto[1] + " " + lottoauto[2] + " " + lottoauto[3] + " " + lottoauto[4] + " " + lottoauto[5]);
						System.out.println("보너스 번호 추천 : " + lottoauto[6]);

						continue;

					} else if(menu == 2) {

						int[] lottomanual = new int[44];

						for(i=0;i<lottomanual.length;i++) {
							lottomanual[i] = i + 1;
						}

						for(i=0;i<lottomanual.length*10;i++) {

							int x = (int)(Math.random()*44);
							int y = (int)(Math.random()*44);

							int tmp = lottomanual[x];
							lottomanual[x] = lottomanual[y];
							lottomanual[y] = tmp;
						}




						System.out.println("당첨번호는 " + lottomanual[0] + " " + lottomanual[1] + " " + lottomanual[2] + " " + lottomanual[3] + " " + lottomanual[4] + " " + lottomanual[5]);

						int[] lottoselect = new int[7];

						System.out.print("1 번째 번호 선택 (1 ~ 45) : ");
						lottoselect[0] = Integer.parseInt(sc.nextLine()); 
						System.out.print("2 번째 번호 선택 (1 ~ 45) : ");
						lottoselect[1] = Integer.parseInt(sc.nextLine()); 
						System.out.print("3 번째 번호 선택 (1 ~ 45) : ");
						lottoselect[2] = Integer.parseInt(sc.nextLine()); 
						System.out.print("4 번째 번호 선택 (1 ~ 45) : ");
						lottoselect[3] = Integer.parseInt(sc.nextLine()); 
						System.out.print("5 번째 번호 선택 (1 ~ 45) : ");
						lottoselect[4] = Integer.parseInt(sc.nextLine()); 
						System.out.print("6 번째 번호 선택 (1 ~ 45) : ");
						lottoselect[5] = Integer.parseInt(sc.nextLine()); 
						System.out.print("보너스 번호 선택 (1 ~ 45) : ");
						lottoselect[6] = Integer.parseInt(sc.nextLine()); 

						System.out.println("당신이 선택한 번호는 " + lottoselect[0] + " " + lottoselect[1] + " " + lottoselect[2] + " " + lottoselect[3] + " " + lottoselect[4] + " " + lottoselect[5] + " 보너스번호 " + lottoselect[6]);				

						/*
					for(i=0;i<lottomanual.length;i++) {
						if(lottomanual[i] == lottoselect[i] && lottomanual[i] == lottoselect[i] && lottomanual[i] == lottoselect[i])
						{ System.out.println("5등 당첨");
						break;}
					}
						 */

						continue;

					} else {
						System.out.println("옳바른 메뉴 숫자를 입력하세요.\r\n");
						continue;
					}

				}

			} catch(Exception E){
				System.out.println("옳바른 메뉴 숫자를 입력하세요.\r\n");        	
			}
		}
	}
}
