package basic;

public class Exam_01 {

	// Static
	// 장점 :	Scope 이슈에서 자유롭다.(언제 어디서나 즉각 사용 가능)
	// 단점 :	1. 메모리 효율성이 매우 떨어짐
	//			2. 동시성 이슈를 가짐(어려운 내용) : 신뢰성이 없다.
	//			3. 
	
	// 지역변수는 메서드를 만들면서 사용되는 것. 일시적으로 사용되고 반환된다. 
	
	public static void main(String[] args) {
		
		Temp.b = 10;	// 템프 인스턴스 안했는데도 b 라는 변수가 메모리에 만들어져있다.
		
//		Math.random();	// 퍼블릭 접근 제한자, 인스턴스 만든 적도 없는데 바로 만들어지는건 스태틱, 리턴값은 더블이고.//스태틱 메서드다
//		Integer.parseInt(); // 퍼블릭, 클래스에서 바로 . 찍고 사용 가능하니 스태틱, 매개변수 없나보다.
//		
//		System.out.println(); //대문자라클래스/스태틱멤버필드/println은 인스턴스에 . 찍어서 스태틱이 아니다.....
		
//		new Temp();	// 이렇게 하면 변수가 메모리에 구성된다.
//		
//		Temp t1 = new Temp();
//		Temp t2 = new Temp();
//
//		Temp t = new Temp();	// 인스턴스화
//		t.a = 10;				// 변수 만들고 10 입력
		
	}
}
