import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~100 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("=== 결 과 ===");

		
		if(0 < num && num < 101) { // 사용자가 입력한 수가 1~100 사이의 수라면
			if(num % 2 == 1) {
				System.out.println("입력한 수는 홀수 입니다.");
			}else/*if((num % 2) == 0)*/{
				System.out.println("입력한 수는 짝수 입니다.");
			}
		}else{ // 1~100 사이의 수가 아니라면
		System.out.println("입력한 수는 옳바르지 않습니다.");
		}
	}
}
