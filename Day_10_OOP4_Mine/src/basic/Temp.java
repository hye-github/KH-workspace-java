package basic;

public class Temp { // Temp : 임시
	public int a;			// instance member field 멤버필드 // 멤버변수-Temp 클래스를 구성하는 변수, 클래스 안에 만들어진 변수, (지역변수x)
							// 설계도기때문에 실제 메모리에 a가 있는건 아니다. 실제 존재하지않는다. new 인스턴스 해야 메모리에 실체화된다.
	public static int b;	// class member field(static(정적으로 고정) 때문에 클래스멤버필드가 됨) 멤버필드 // 멤버변수(지역변수x) // b는 그림에 안그림. 
							// 메인이 실행됨과 동시에 int b도 실행된다. 실제 메모리에 적재 된다. 클래스 단계에서 이미 존재.
							// 
	
	public void funcA() {
		a = 10; // 인스턴스 new를 통해 만들어져있어야하는 것 > a라는 멤버필드가 만들어져있다는 것
		b = 20;
	}
	
	public static void funcB() { // 언제든 콜할 수 있다. a, b 가 있던 없던간에.
//		a = 30;	// a라는 변수는 존재 여부를 알 수 없기때문에 / 인스턴스를 안하면 존재할 수 없는 a
		b = 40; // b는 언제나 만들어져있어서 사용 가능하나 a는 사용 불가
	}
	
}
