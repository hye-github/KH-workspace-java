
public class Exam_02 {
	public static void func() {
		System.out.println(1);
	}
	public static void func(int num1) {
		System.out.println(2);
	}
	public static void func(int num1, int num2) {
		System.out.println(3);
	}
	public static void func(boolean b) {
		System.out.println(4);
	}
	
	
	public static void main(String[] args) {

		// abc(5,'A') 인트형, 캐릭터형 총 2개

		// boolean reasult = abc(5,'A')

		System.out.println("Hello");
		System.out.println(10);
		System.out.println(3.15);

		
		func(true);
		
		// Method Overloading : 과적하다 / 매개변수에 의해서만 영향을 받는다. 리턴값으로는 오버로딩을 판단할 수 없다
		// 메서드 이름이 같아도 매개변수의 타입 또는 개수가 다르면
		// 서로 다른 메서드로 인식하여 처리하는 문법 // 시험, 면접에서 잘나온다/ 오버로딩과 오버로드와의 차이점


	}
}
