import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		
		// 두 정수를 입력받아 덧셈한 결과를 출력하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine()); // 엔터를 해서 라인 구분이 된 것. nextliene 자체가 엔터라고 볼 수도 있음.
				
		System.out.print("정수2 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
//		System.out.print("정수3 입력 : ");
//		long num3 = Long.parseLong(sc.nextLine()); // 100억 이상 용도		
		
//		System.out.print("정수4 입력 : ");
//		double num4 = Double.parseDouble(sc.nextLine()); // 3.14 같은 실수 용도		
		
//		char 는 안됨		
		
		System.out.println("정수1과 정수2의 합계 : " + (num1 + num2));
		
	}
}
