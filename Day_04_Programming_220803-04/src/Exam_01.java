import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Apple 을 입력하세요. : ");
		String msg = sc.nextLine(); // 참조 자료형임. 문자가 들어가있는게 아니라 주소값이 들어가있다.
		System.out.println("정답입니다.");
		
		if(msg.equals("Apple")) { // 알파벳 하나하나 비교가 필요함 msg.equals("Apple") 이렇게 적어야함
								  // 문자열 비교할 때는 msg == "Apple" 가 아니다.
			System.out.println("정답입니다.");
		} else {
			System.out.println("Apple 을 입력해야 합니다.");
		}
	
		
	}
}
