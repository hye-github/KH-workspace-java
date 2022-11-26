import java.util.Scanner;

public class ATM_answer {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int money = 0; // 잔액 변수

	      while(true) {
	         System.out.println("***ATM 시뮬레이터***");   
	         System.out.println("1. 잔액조회");
	         System.out.println("2. 입금하기");
	         System.out.println("3. 출금하기");
	         System.out.println("4. 종료하기");
	         System.out.print(">> ");
	         int menu = Integer.parseInt(sc.nextLine());

	         if(menu == 1) {
	            
	            System.out.println("현재 잔액은 " + money + " 원 입니다.");
	            
	         }else if(menu == 2) {
	            
	            System.out.print("얼마를 입금하시겠습니까 ? ");
	            int input = Integer.parseInt(sc.nextLine()); // 이번에 입금할 금액
	            money = money + input; // 잔액 + 입금할 금액 -> 새로운 잔액
	            System.out.println("입금이 완료되었습니다.");
	            
	         }else if(menu == 3) {
	            
	            System.out.print("얼마를 출금하시겠습니까 ? ");
	            int output = Integer.parseInt(sc.nextLine()); // 출금할 금액 입력
	            if(output <= money) {
	               money = money - output;
	               System.out.println("출금이 완료되었습니다.");
	            }else {
	               System.out.println("잔액이 부족합니다.");
	            }
	            
	         }else if(menu == 4) {
	            
	            System.out.println("프로그램을 종료합니다.");
	            
	            break;
	         }else {
	            
	            System.out.println("메뉴를 다시 확인해주세요.");
	            
	         }
	      }

	   }
}
