package midlevel;


class A{
	
}

class B extends A{
	
}

public class Example {
	public static void main(String[] args) {
	
		// 다형성 - 많은 형태를 가지는 성질
		// 상속관계에 놓여있는 두 클래스 사이에서 
		// 상위클래스(부모) 참조 변수는 자신을 상속받는 하위클래스 인스턴스의
		// 주소를 저장할 수 있다.

		
		
		
		A a = new B();
		
		
		
		
		
//		((B)a).funcA();
//		((B)a).funcB();
		
		
		
	}
}







