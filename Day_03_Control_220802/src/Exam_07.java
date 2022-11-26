import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 좋아하는 과목을 선택하세요.");
		System.out.println("1.JAVA / 2.음악 / 3.주짓수");
		System.out.println(">> ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1: // 구분점이 없어서 break; 넣어줘야함
			System.out.println("JAVA는 공학입니다."); // break;안적으면 아래 모든 내용 다 나옴
			break;
		case 2:
			System.out.println("음악은 예술입니다.");
			break;
		case 3:
			System.out.println("주짓수는 체육입니다.");
			break;
		default:
			System.out.println("메뉴를 다시 확인해주세요.");
		
		}
		
	}
}
