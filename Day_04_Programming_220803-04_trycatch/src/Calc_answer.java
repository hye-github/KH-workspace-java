import java.util.Scanner;

public class Calc_answer {
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

			/*	else if(!oper.equals("+") && !oper.equals("-") && 
						!oper.equals("*") && !oper.equals("/")) { 
				// 연산자가 아닌 다른 무언가를 입력했을 경우
				// oper != "+" / 문자열은 == != 이런거 안됨
				// && 는 ~고 그리고로 해석
				System.out.println("연산자를 다시 확인해주세요.");
				continue; // while 있어야함 -> 46번째 줄로 가버리게 됨 다시 재시작
			}
			 */


			else if(oper.equals("+") || oper.equals("-") || 
					oper.equals("*") || oper.equals("/")) { 

				while(true) {
					try {
						System.out.print("첫 번째 수 : ");
						num1 = Integer.parseInt(sc.nextLine()); // 여기에 문자 넣으면 에러 나서 완전본이 아님
						break;
					} catch(Exception e){
						System.out.println("숫자를 입력해주세요.");
					}
				}

				while(true) {
					try {
						System.out.print("두 번째 수 : ");
						num2 = Integer.parseInt(sc.nextLine()); // 에러 처리문을 넣어야 완성됨 8/7일날 보게됨
						break;
					} catch(Exception e){
						System.out.println("숫자를 입력해주세요.");
					}
				}



				//에러가 생기면 그 즉시 밖으로 튕겨나간다.

				/*	

				c언어때
				String str1 = sc.nextLine();
				if( ) { // 배열이랑 메소드를 배워야 만들 수 있음
					int num1 = Integer.parseInt(str1);
				}

				 */

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



