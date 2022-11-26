import java.util.ArrayList;
import java.util.Scanner;

public class Exam_02 { // public class Exam_02 extends Object 묵시적으로 표기 되어있음.
	public static void main(String[] args) {
		
		Object o = new Scanner(System.in); // 자바에 존재하는 모든 클래스를 상속 받음. 익스텐드는 묵시적 표기.
				o = 10;						// 오브젝트는 다형성의 꼭대기. 모든걸 상속 가능.
				o = Math.random();
				o = new Exam_02();
		
		System.out.println("ArrayList 예제");
		
		
		ArrayList arr = new ArrayList(); // 노란 밑줄은 오브젝트형이라고 배열 변경 안하냐고 물어보는 것
		ArrayList<Integer> arr1 = new ArrayList<Integer>();	// 제너릭 붙이기 // int형 배열로 변경되었다.(다형성을 잃었다)
		ArrayList<String> arr2 = new ArrayList<String>();	// String형 배열로 변경되었다.(편리함,편의성 - downcasting 이 필요가 없다)
		// 오브젝트형 배열
		// Vector arr = new Vector(); // ArrayList의 옛날 이름 : Vector
		// ArrayList arr = new ArrayList(5); 숫자 넣고 자료 넘쳐도 에러 없다.  
		// 배열을 내부에 품고 있지만, 배열은 아니다. arr[0]로 쓸 수 없다.
		
		arr.add("Hello"); // 번호가 없다. 번호가 없는 이유 : 똑똑한 배열이라, 
		arr.add("World"); // 얘네를 5,8번에 넣어도 빈 공간을 없애기때문에 0,1번으로 간다.
		arr.add("collection");
		arr.add(100); // = new Integer (참조자료형으로 변환)
		// 변수하나가 여러가지를 담을 수 있다 : 다형성
		// 상속 관계에 있을 때. 부모 arr, 자식 String, int, Scanner, class,
		
		arr.get(0); // Object형임. String 아님.
		((String)arr.get(0)).length(); // 문자열 길이 알고 싶다면. String이 아니기때문에 downcasting 필요.
		
		
		arr.add(new Scanner(System.in));
		arr.add(new Exam_02());
		
		
		arr.remove(0);
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		arr.add(1,"Hello");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		System.out.println(arr.size()); // 요소수 사이즈 출력
		
	}
}
