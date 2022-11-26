// 참조자료형
public class Monitor { // 클래스의 첫글자는 대문자 무조건 // 메모리에 만들어진 실체(실제 모니터)가 아니다. 설계도다.
	String brand; //변수명의 첫글자는 대문자 안됨
	int price;
	double weight; // 멤버필드 /멤버변수들/클래스 안에 만들어진 애들
	// Member Field
	
	void powerOn(){}
	void powerOff(){}
	void volumeUp(){}
	void volumeDown(){} // 멤버메서드
	// Member Method
	
	
	
	
	// Constructor
	// 생성자 메서드 / 기존과 규칙이 다른, 특이한 메서드(특별하지않음)
	// 1. 생성자 메서드의 이름은 클래스의 이름과 동일해야 한다.
	// 2. 생성자 메서드는 return 값을 가지지 않는다.
	// 3. 생성자 메서드의 콜 시점은 개발자가 지정할 수 없다. ( 콜 되는 시점이 정해져 있다. )

	
	public Monitor() { // 왼쪽에 작성하지않는 이유 : 생성자 메서드는 return 값을 가지지 않는다. / void 조차 표기하지않는다.
		System.out.println("모니터 생성자 실행 됨");
	}	// 생성자 : 인스턴스가 실행 될 때 딱 한번만 실행 됨
	
	
	
	
	
	
	
	// Nested Class(중첩된 클래스)
	
}

//	() 매개변수
//	{} 메서드 안에 만들어지는 변수 : 지역변수


// 클래스를 구성하는 요소
// Member Field
// Member Method
// Constructor
// Nested Class(중첩된 클래스)


//* 필드가 보이면 set,get메서드 바로 나오도록
// set get 없으면 에러가 나는데 그냥 bad 라고만 떠서 뭐가 잘못된지 모르므로 손에 익히는게 최고다.