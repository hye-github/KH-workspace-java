/*
public class Exam_01 {
	public static void main(String[] args) throws Exception{
		System.out.print("한 글자를 입력하세요 : ");
		int input1 = System.in.read();
		System.out.println("입력하신 문자는 " + (char)input1 + " 입니다."); // 직접 입력 가능 1차 값
		
		System.out.print("한 글자를 입력하세요 : ");
		int input2 = System.in.read();
		System.out.println("입력하신 문자는 " + input2 + " 입니다."); // \r
		
		System.out.print("한 글자를 입력하세요 : ");
		int input3 = System.in.read();
		System.out.println("입력하신 문자는 " + input3 + " 입니다."); // \n
		
		System.out.print("한 글자를 입력하세요 : ");
		int input4 = System.in.read();
		System.out.println("입력하신 문자는 " + input4 + " 입니다."); // 직접 입력 가능 2차 값
		
		//System.out.println("입력하신 문자의 아스키코드 10진수는 " + input + " 입니다.");
	}
}
*/


public class Exam_01 {
	public static void main(String[] args) throws Exception{
		System.out.print("한 글자를 입력하세요 : ");
		int input1 = System.in.read();
		System.out.println("입력하신 문자는 " + (char)input1 + " 입니다."); // 직접 입력 가능 1차 값

		int input2 = System.in.read();
		int input3 = System.in.read();
		
		System.out.print("한 글자를 입력하세요 : ");
		int input4 = System.in.read();
		System.out.println("입력하신 문자는 " + (char)input4 + " 입니다."); // 직접 입력 가능 2차 값
		
		//System.out.println("입력하신 문자의 아스키코드 10진수는 " + input + " 입니다.");
	}
}
