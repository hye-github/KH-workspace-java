import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
			
		while(true) {

			System.out.println("== 가위 바위 보 게임 ==");
			System.out.println("숫자를 선택하세요(1.가위 / 2.바위 / 3.보 / 4.게임종료) : ");
			int select = Integer.parseInt(sc.nextLine());
			
			int game = (int)(Math.random() * 3 + 1);
			
			
			if (select == 4) {
				System.out.println("가위 바위 보 게임을 종료합니다.");	
				System.exit(0);
				
			} else if(select!=1 && select!=2 && select!=3) {
				System.out.println("잘못된 입력입니다. 다시 선택하세요.");	
				continue;
			}
			
			

			// select 1을 가위 / 2를 바위 / 3을 보 로 변경해서 출력하고 싶음
			// 이건 나중에 배운다함 
			// ??:: 연산자로도 가능한데 추천하지않음
				
			
			if(select == game) {
				System.out.println("======= 결과 =======");
				System.out.println("당신은 " + select + "를 냈습니다.");
				System.out.println("컴퓨터는 " + game + "를 냈습니다.");
				System.out.println("===================");
				System.out.println("무승부 입니다.");
				
			} else if((select == 2 && game == 1) || 
				(select == 3 && game == 2) || 
				(select == 1 && game == 3)) {
					
				System.out.println("======= 결과 =======");
				System.out.println("당신은 " + select + "를 냈습니다.");
				System.out.println("컴퓨터는 " + game + "를 냈습니다.");
				System.out.println("===================");
				System.out.println("플레이어가 이겼습니다.");
				
			} else { 
					System.out.println("======= 결과 =======");
					System.out.println("당신은 " + select + "를 냈습니다.");
					System.out.println("컴퓨터는 " + game + "를 냈습니다.");
					System.out.println("===================");
					System.out.println("플레이어가 졌습니다.");
			}
				
		}
					
	}
}
