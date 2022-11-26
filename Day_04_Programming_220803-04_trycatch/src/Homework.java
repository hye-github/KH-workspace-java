import java.util.Scanner;

// 자판기 시뮬레이터

public class Homework {

	public static void main(String[] args) {
		
		int money = 3000;
		
		int numcola = 0;
		int numcider = 0;
		int numtea = 0;
		
		int sumcola = 1000;
		int sumcider = 800;
		int sumtea = 1500; //변수는 위에 저장되는 것임. 아래 연산작용 후에 여기에 저장되어 값이 변경됨.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=== 자판기 시뮬레이터 ===");
			System.out.println("음료수를 선택하세요.");
			System.out.print("1. 콜라(1000) ");
			System.out.print("2. 사이다(800) ");
			System.out.print("3. 매실차(1500) ");
			System.out.print("[9. 자판기이용종료] ");
			System.out.println("[0. 소지품확인]");
			System.out.print(">> ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				
				if(money >= sumcola) { // 나한테 콜라값보다 큰 돈이 있어야 계산이 된다. 
					                   // money >= 1000; 콜라값은 변수가 아니라서 직접 기재해도 될 듯
					numcola = numcola + 1; // numcola+=1; / numcola++;
					money = money - sumcola; // money = money - 1000; 
					                         // 애초에 1개씩만 구입했던거라 구매 숫자에 의미 없음 
					                         // 산수하고 money에 담아야 변경됨. 결론 > money-=sumcola; 
					
					System.out.println("콜라를 구매했습니다.");
					System.out.println("콜라 + 1개");
					System.out.println("소지금 -" + sumcola + "원\r\n");
				} else {
					System.out.println("잔액이 부족합니다.\r\n");
				}
			
				
			} else if(select == 2) {
				
				if(money >= sumcider) {
					numcider++;
					money-=sumcider;
					System.out.println("사이다를 구매했습니다.");
					System.out.println("사이다 + 1개");
					System.out.println("소지금 -" + sumcider + "원\r\n");
				} else {
					System.out.println("잔액이 부족합니다.\r\n");
				}
				
			} else if(select == 3) {
				
				if(money >= sumtea) {
					numtea++;
					money-=sumtea;
					System.out.println("매실차를 구매했습니다.");
					System.out.println("매실차 + 1개");
					System.out.println("소지금 -" + sumtea + "원\r\n");					
				} else {	
					System.out.println("잔액이 부족합니다.\r\n");
				}
				
			} else if(select == 0) {
				
				System.out.println("=== 소지품 목록 ===");
				System.out.println("소지금 : " + money + "원");
				System.out.println("콜라 : " + numcola + "개");
				System.out.println("사이다 : " + numcider + "개");
				System.out.println("매실차 : " + numtea + "개");
				

			} else if(select == 9) {
				System.out.println("시뮬레이터를 종료합니다.");
				break;		// 구조상 반복문을 나가는 역할을 할 뿐, 프로그램을 종료하게 되는건 아니다.
				            // 아래 구문이 더 있다면 실행 될꺼임. 진짜로 프로그램 끄는건 System.exit(0);
				
			} else {
				
				System.out.println("자판기를 옳바르게 사용해주세요.\r\n");
				
			}
			
		
		}
			
	}
	
}
