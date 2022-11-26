import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("***ATM 시뮬레이터***");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 종료하기");
			System.out.print(">> ");
			int select = Integer.parseInt(sc.nextLine());
			
			int money = 0;
			int moneyadd;
			int moneyminus;
			
			if(select == 4) {break;}
			
			switch(select) {
									
			case 1:
				System.out.println("현재 보유 잔액은 " + money + "원입니다.\r\n");
				break;
				
			case 2:
				System.out.println("얼마를 입금하시겠습니까?");
				System.out.print(">> ");
				moneyadd = Integer.parseInt(sc.nextLine());
				System.out.println(moneyadd + "원이 입금되었습니다.\r\n");
				money+=moneyadd;
				break;
				
			case 3:
				System.out.println("얼마를 출금하시겠습니까?");
				System.out.print(">> ");
				moneyminus = Integer.parseInt(sc.nextLine());
				System.out.println(moneyminus + "원이 출금되었습니다.\r\n");
				money-=moneyminus;
				break;
				
			default:
				System.out.println("1~4번 중 찾으시는 서비스를 입력하세요.");
				System.out.print(">> ");
				select = Integer.parseInt(sc.nextLine());
				System.out.println("\r\n");
			}
		}
		
	}
}
