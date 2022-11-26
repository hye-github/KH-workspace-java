import java.util.Scanner;

public class Quiz_03_GBB_answer {
	
	public static int myRand(int min, int max) {

		return (int)((Math.random()*(max-min)+1) + min);
		
//		int myRandResult = (int)((Math.random()*(max-min)+1) + min);
//		return myRandResult;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("가위바위보 게임");
			System.out.println("선택하세요. 1. 가위/ 2.바위 / 3.보 ");
			
			int player = Integer.parseInt(sc.nextLine());
			int com = myRand(1,3);

			System.out.println("결과");
			
			switch(player) {
			case 1 :
				System.out.println("플레이어는 가위 냄");
				break;
			case 2 :
				System.out.println("플레이어는 바위 냄");
				break;
			case 3 :
				System.out.println("플레이어는 보 냄");
				break;
			}
			
			switch(com) {
			case 1 :
				System.out.println("컴퓨터는 가위 냄");
				break;
			case 2 :
				System.out.println("컴퓨터는 바위 냄");
				break;
			case 3 :
				System.out.println("컴퓨터는 보 냄");
				break;
			}
			
			// 경우의 수가 9가지나 됨
			
			if(player == com) { // 비긴 경우
				System.out.println("비겼다");
				
			} else if((player==1 && com==3) ||
					(player==2 && com==1) ||
					(player==3 && com==2)) { // 플레이어 승리한 경우
				// 1(가위) 3(보)
				// 2(바위) 1(가위)
				// 3(보) 2(가위)
				System.out.println("플레이어가 승리했다");
		
			} else { // 플레이어 패배한 경우
				// 위의 나머지는 진거
				System.out.println("컴퓨터가 승리했다");
			}
			
		}
		
	
	}
}
