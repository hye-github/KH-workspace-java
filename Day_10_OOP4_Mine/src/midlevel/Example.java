package midlevel;

class A{
	public void funcA() {
		System.out.println("func A 입니다.");
	}
}

class B extends A{
	public void funcB() {
		System.out.println("func B 입니다.");
	}
}


public class Example {
	public static void main(String[] args) {
		
		// 다형성 - 많은 형태를 가지는 성질
		// 상속 관계에 놓여있는 두 클래스 사이에서
		// 상위클래스(부모) 참조 변수(A형 a)는 자신을 상속 받는 하위 클래스(B) 인스턴스(new B();)의
		// 주소를 저장할 수 있다.
		
		A a = new B(); // 아래 자료 형을 위쪽 자료형을 향해  up casting 자동으로 실행 되었다.
		// B b = new A(); 이거는 안됨
		
		// a에 . 찍으면 A형 ? B형?
		a.funcA(); // 담을 수 있지만, 참조변수의 자료형만큼만 사용할 수 있다.
		
		((B)a).funcA(); // down casting // 캐스팅하면 모든 기능을 다 사용할 수 있다. 
		((B)a).funcB(); // down casting  // 위쪽 자료형이 아래쪽 자료형을 향해
		
		// 다운캐스팅 하지않았는데도 A의 기능을 B가 오버라이딩했을 경우는 B의 기능도 사용할 수 있다.
		
		/*
	class A{
		public void funcA() {
			System.out.println("func A 입니다.");
		}
	}

	class B extends A{
		public void funcA() {
			System.out.println("func B 입니다.");
		}
	}
		*/
		 
		
	}
}
