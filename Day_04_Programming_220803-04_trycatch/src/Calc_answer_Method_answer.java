import java.util.Scanner;

public class Calc_answer_Method_answer {

	public static int validNum() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				int num = Integer.parseInt(sc.nextLine());
				return num;
			} catch(Exception e){
				System.out.println("숫자를 입력해주세요.");
			}
		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		while(true) {

			System.out.println("=== 계산기 프로그램 ===\r\n");
			System.out.print("연산자 입력 (+,-,*,/,q[종료]) : ");
			String oper = sc.nextLine();

			if (oper.equals("q")) {
				System.out.println("계산기를 종료합니다.");
				System.exit(0); } 

			else if(oper.equals("+") || oper.equals("-") || 
					oper.equals("*") || oper.equals("/")) { 

				System.out.print("첫 번째 수 : ");
				num1 = validNum(); // 인자값이 없어서 파라미터도 없어도 될 것이다. 예상하고 위에도 없이 작성
				System.out.print("두 번째 수 : ");
				num2 = validNum();


				System.out.println("\r\n====== 결  과 ======\r\n");

				if(oper.equals("+")) { // swich 였으면 그냥 + 입력 가능. 단일 문자니까
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				} else if (oper.equals("-")) {
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				} else if (oper.equals("*")) {
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
				} else if (oper.equals("/")) {
					System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2)); 
					//프로모션이나 캐스팅 활용해서 소수자리 표현. 이 상황에선 캐스팅이 편함.
				} 
			} else {		
				System.out.println("연산자를 다시 확인해주세요.");
				continue;
			}


		}


	}
}



