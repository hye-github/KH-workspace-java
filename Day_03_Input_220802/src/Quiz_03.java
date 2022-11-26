import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================");
		
		System.out.print("이 름 : ");
		String name = sc.nextLine();		
		
		System.out.println("==================");
		
		System.out.print("국 어 : ");
		int kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("영 어 : ");
		int eng = Integer.parseInt(sc.nextLine());

		System.out.print("수 학 : ");
		int math = Integer.parseInt(sc.nextLine());
	
		System.out.println("==================");
		
		int result = (kor + eng + math);
		System.out.println("합 계 : " + result);
		System.out.println("평 균 : " + (float)result/3); // ("평 균 : " + result/3.0);
		// ("평 균 : " + String.format("%,2f", result/3.0));
		
		System.out.println("==================");
	}
}
