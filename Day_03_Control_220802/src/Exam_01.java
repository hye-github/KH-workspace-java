import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 좋아하는 과일을 선택하세요.");
		System.out.println("1. 사과 / 2. 망고 / 3. 포도");
		System.out.println(">> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.println("사과는 영어로 Apple 입니다.");
		}else if(menu == 2) {
			System.out.println("망고는 영어로 Mango 입니다.");			
		}else if(menu == 3) {
			System.out.println("포도는 영어로 Grape 입니다.");			
		}else {
			System.out.println("메뉴를 다시 확인해주세요.");
		}
		
		
//		if(menu == 1) {
//			System.out.println("사과는 영어로 Apple 입니다."); // 이렇게 안하는 이유는 효율성 때문에
//		if(menu == 2) {
//			System.out.println("망고는 영어로 Mango 입니다."); // 실행하게 되면 두 구문 모두 검사하게 됨.
		
		
	}
}
