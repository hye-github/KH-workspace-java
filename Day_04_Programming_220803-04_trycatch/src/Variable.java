
public class Variable {
	public static void main(String[] args) {

		// 변수의 종류
		// [지역변수 / 매개변수] / 정적변수 / 멤버변수
		// 우리가 이제까지 사용해온 변수는 지역변수
		
		int a = 10; // 인트형 지역변수 a / 지역에서 사용할 수 있는 변수 / 자바에서는 {} 는 지역을 뜻함

		
		int b = 20; // 바깥 지역에서 만들어진 변수는, 지역을 포함하는 쪽에서 만들어진 변수는 내부 지역에서 사용이 가능하다.
		
		
		{ // 가 지역
			/* int */ b = 20; // 자신이 속한 지역을 벗어날 수 없다. 생명주기를 다함.
		}
		
		System.out.println(b); // b라는 변수를 찾을 수 없다. / 12번째 줄에 변수 선언 하여서 ㄱㅊ
		
		{ // 나 지역
			/* int */ b = 30; // 변수 이름은 중첩되지않으나 현재 지역을 벗어나서 가능하다.
			System.out.println(b); // b의 값은 30이다.
		}
		
		
	}
}
