import java.util.Scanner;

public class Quiz_06 {
	public static void main(String[] args) {
		
		System.out.println("=== 구구단 출력 프로그램 ===\r\n");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 ~ 9단 중 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			System.out.print("\r\n");
			
			if(0 < num && num < 10) { // num이 2~9 사이의 수일 때
				int i = 0;
			
				while(i < 9) {
					i++;
					System.out.println(num + " * " + i + " = " + (num * i));
				}
				break;
			}else {
				System.out.println("구구단 범위를 벗어났습니다.");
			}	
		}
		
				
	}
}