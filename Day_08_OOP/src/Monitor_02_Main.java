//배열 메서드 객체지향 this. 생성자 게터세터 + 8/12 내일 실습

import java.util.Scanner;

public class Monitor_02_Main {
	public static void main(String[] args) {

//		Monitor_02 m = new Monitor_02(); // 이미 만들어진 생성자가 있어서 빈 공간이면 에러가 난다.
		// System.out.println("모니터 생성자 실행 됨"); < 이게 나옴
		// 생성자 : 인스턴스가 실행 될 때 딱 한번만 실행 됨
		
//		Monitor_02 m = new Monitor_02(); // 오버로딩 가능 // 만들어줘야함. 지워지기 때문에.
		
		Monitor_02 m = new Monitor_02("Samsung", 100000, 28.5);
		// 따로따로 넣는게 불편하니까 > 문법이 따로 있음.  // Constructor << 이거임
		
		
		Scanner sc = new Scanner(System.in);
		// 생성자도 오버로딩이 가능함. 매개변수가 다른 메서드 생성 가능.
		
		String str = new String("ABC"); // 생성자에게 전달하는 인자값이구나 라고 이해하기
		
		
		
		// 값을 바꾸고싶다면 => setter를 통해서 
		
//		m.setBrand("Samsung");
		System.out.println(m.getBrand());
		
//		m.setPrice(100000);
		System.out.println(m.getPrice());
		
//		m.setWeight(28.5);
		System.out.println(m.getWeight());
		
		// 따로따로 넣는게 불편하니까 > 문법이 따로 있음.  // Constructor
		

		
		
		
//		System.out.println(m.getBrand()); // null -> 숫자 0을 뜻함 / null은 0의 다른 자료형 버전
//		System.out.println(m.getPrice()); // 0 -> 숫자 0을 뜻함
//		System.out.println(m.getWeight()); // 0.0 -> 숫자 0을 뜻함
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
