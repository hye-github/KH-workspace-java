import java.util.Scanner;

// up & down game
// 1~99까지 범위의 랜덤한 숫자를 맞추는 게임
// switch-case 문으로 만들 것

public class Quiz_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		//난수설정 1~99
		int com = (int)(Math.random()*100+1);
		int result = 0;
		int count = 0;
		
		System.out.println("== Up & Down Game ==\r\n");
		System.out.println("1. Game Start");
		System.out.println("2. Game Score");
		System.out.println("3. End Game");
		
		System.out.print("\r\n> ");
		//메뉴 선택
		int menu = Integer.parseInt(sc.nextLine());
		
		while(true) {
		
			switch(menu) {
			case 1 :
				//1. Game Start
					
					//숫자 입력
					System.out.print("\r\nInput Number : ");
					int player = Integer.parseInt(sc.nextLine());
					
					if(player == com) {
						count++;
						System.out.println("<< 정 답 >>\r\n");
						
						if (result == 0) { //이런 조건문 만드는게 어려움
							result = count;
						}

						// 메인화면 다시
						com = (int)(Math.random()*100+1);
						System.out.println("== Up & Down Game ==\r\n");
						System.out.println("1. Game Start");
						System.out.println("2. Game Score");
						System.out.println("3. End Game");
						System.out.print("\r\n> ");
						menu = Integer.parseInt(sc.nextLine());
						continue;
						
					} else if (player < com) {
						count++;
						System.out.println("<< U P >>");
						continue;
						
					} else {
						count++;
						System.out.println("<< D O W N >>");
						continue;
					}

				
			case 2 :
				//2. Game Score
				
				System.out.println("<< 당신의 전적 >>");
					if(result==0) {
						System.out.println("입력 횟수가 없습니다.");
					} else {
						System.out.println("맞출 때까지 입력한 횟수 : " + result);
					}
				System.out.println("W I N : ");
				System.out.println("L O S E : ");
				System.out.println("D R A W : ");
				System.exit(0);
				
			case 3 :
				//3. End Game
				System.out.println("게임이 종료 되었습니다.");
				System.exit(0);
				
			default :
				System.out.println("잘못입력하였습니다.");
				// 메인화면 다시
				com = (int)(Math.random()*100+1);
				System.out.println("== Up & Down Game ==\r\n");
				System.out.println("1. Game Start");
				System.out.println("2. Game Score");
				System.out.println("3. End Game");
				System.out.print("\r\n> ");
				menu = Integer.parseInt(sc.nextLine());
				System.exit(0);
			}
		
		}
		


		
	}
	
	
}