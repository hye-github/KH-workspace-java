import java.util.Scanner;

public class LottoSimulator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			
			try {
				while(true) {
					System.out.println("1. 로또 번호 추천");
					System.out.println("0. 시뮬레이터 종료");
					System.out.print(">> ");
					int menu = Integer.parseInt(sc.nextLine());

					if(menu == 0) {
						System.out.print("시뮬레이터를 종료합니다.");
						System.exit(0);		

					} else if(menu == 1) {

						int[] lotto = new int[44];
						
						for(int i=0;i<lotto.length;i++) {
						lotto[i] = i + 1;
						}
						
						
						for(int i=0;i<lotto.length*10;i++) {
							
							int x = (int)(Math.random()*44);
							int y = (int)(Math.random()*44);

							int tmp = lotto[x];
							lotto[x] = lotto[y];
							lotto[y] = tmp;
						}

						System.out.println("추천 번호는");
						System.out.println(lotto[0] + " " + lotto[1] + " " + lotto[2] + " " + lotto[3] + " " + lotto[4] + " " + lotto[5]);
						System.out.println("보너스 번호 추천 : " + lotto[6]);

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
