import java.util.Scanner;

public class Calc_answer_Method_answer_02 {

	public static int validNum(String msg) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				System.out.print(msg);
				int num = Integer.parseInt(sc.nextLine());
				return num;
			} catch(Exception e){
				System.out.println("숫자를 입력해주세요.");
			}
		}
	}

// 해결책은 되지만 좋은 코드는 아니다. 최소한의 기능만을 가지는게 좋다.
// 주목적은 유효한 인트값을 받는다. 인데 메세지를 출력하고 있다. : 입력창이 그래픽창으로 바뀌면 글자 출력이 필요가 없다.
	
	
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

				num1 = validNum("첫 번째 수 : ");
				num2 = validNum("두 번째 수 : ");

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



