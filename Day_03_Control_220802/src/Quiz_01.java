import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("==== 결 과 ====");
		
		if(num1 > num2) { // 첫 번째 수가 더 큰 경우
			System.out.println("첫 번째 입력한 값이 더 크다.");
			}else if(num2 > num1) { // 두 번째 수가 더 큰 경우
				System.out.println("두 번째 입력한 값이 더 크다.");	
			}else{ // 두 수가 같은 경우
				System.out.println("두 수가 같다."); 	
			}
				
		// }else if(num1 == num2) { // 상황에 따라서 다르다. 에러가 날 수도 있고 아닐 수도 있다. 
		//		System.out.println("입력한 값이 같다."); // else 나 else if 거나
		//	}
		
	}
}
