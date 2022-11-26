import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine(); // 입력
		
		int num = Integer.parseInt(str); // 괄호 안에 들어가는 값을 int형으로 변경. String 에서 int 타입으로 변경해주는 것(문자열을 숫자로 변환/파스인트)

		// int num = 변수 저장을 위한 장소
		
		/*
		int num = Integer.parseInt(sc.nextLine()); // str이란 변수가 필요없기때문에 이렇게도 표현 가능
		*/
		
		System.out.println(num + 10); // 500 + 10 프로모션 되어 문자열로 변경됨. 그래서 int 타입으로 변경해줘야함.
				
	}
}
