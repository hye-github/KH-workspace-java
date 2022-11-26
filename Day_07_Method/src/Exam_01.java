import java.util.Scanner;

public class Exam_01 {

/*
	
// 메서드 문법(정정)
	
	public static int plus(int num1, int num2) { // parameter -> 인수값 / 파라미터 / 매개변수
		
		int result = num1 + num2;
		return result;
	}
		
		public static void main(String[] args) { 
			
			// main의 콜되는 지점은 우리가 부를 수 없고, 윈도우가 콜한다.
			// 우리한테는 매개변수 인자값을 넣을 수가 없다.
			// 메인을 콜할 수 없으나, 프로그램을 실행 시킬 때 값을 전달할 수 있다.
			
			
			plus(10,5); // argument -> 인자값 / 아규먼트 / 전달인자 // 리턴값으로 봐야함(인트값 15로)
			
//			String name = sc.nextLine() + plus(10,5); // 자연스럽게 스트링값 + 15(자동 프로모션) = 스트링값15			
//			Integer.parseInt(sc.nextLine()) + Math.random(); // 입력된값>인트(자동 프로모션) + 더블형랜덤값 = 더블형값
			
		}
	
//
		
*/
	
	public static int plus(int num1, int num2) {  
		// 덧셈을 담당하는 직원(함수 function 펑션) / 메서드 / plus의 원래 자리
		// public static 객체
		
		int result = num1 + num2;
		return result; // 메서드의 기능을 끝내고 값을 돌려보내라.
	
//	return num1 + num2; // 값을 돌려보내야함. 위와 표현 동일
//
//								메서드 콜에 의해 전달되어지는 값을 받아 저장하는 변수 : 매개변수
//								int num1, int num2 = 매개 변수이다. 소괄호 안이라서 지역 변수가 아님
//								파라미터가 전달되어서 매개변수로 들어간다.
//								메서드 기준 왼쪽 : 리턴 데이터 타입(int)  // 데이터 타입 맞춰서 작성해야함
//								메서드 기준 오른쪽 : 매개변수
//								메서드 안쪽은 실행하고자하는 코드
	}
	
	
	
	// 2개의 정수를 인자값으로 받아 뺄셈한 결과를 반환하는 minus 메서드를 작성해보세요.
	
	//public static int minus(int num1, int num2) / 3개만 놓고 봤을 땐 메서드의 프로토타입이라고 말한다.
	
	
//	public static int minus(int num1, int num2) {
//		return num1 - num2;
//	}                                              / 다 보면 메서드 정의
	
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	
	// 2개의 정수를 인자값으로 받아 곱셈한 결과를 반환하는 mply 메서드를 작성해보세요.
	
	public static int mply(int num1, int num2) {
		return num1 * num2;
	}

	
	// 2개의 정수를 인자값으로 받아 나눗셈한 결과를 double형으로 반환하는 divide 메서드를 작성해보세요.
	
	public static double divide(int num1, int num2) {
		return num1 / (double)num2; // (double) 한쪽 더블로 형변환 안하면 int 값 나누기 되어서 정수로 값이 나와버림
									// 나중에 형변환해도 소용 없음. 나눌 때 생각해서하기
	}
	
	
	// 2개의 정수를 인자값을 받아 둘 중 더 큰 수를 반환하는 bigger 메서드를 작성해보세요.
	// (만약 두 수가 같을 경우 0 을 반환)

	public static int bigger(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		} else if(num1 < num2) {
			return num2;
		} else {
			return 0;
		}
	}
	
	
	// "사과" 라고 전달하면 "Apple" 을 반환하고, "포도" 라고 전달하면 "Grape" 를 반환하는
	// translate 메소드를 작성하세요.
	// (기타 다른 단어가 전달되면 "None" 을 반환하세요.)
	
	public static String translate(String word) {
		if (word.equals("사과")) {
			return "Apple";
		} else if (word.equals("포도")) {
			return "Grape";
		} else {
			return "None";
		}
	}
	
	
	
	
	
	
//	public static String nextLine() { // 넥스트라인의 메서드 구조
//		
//	}
//	
//	
//	public static int parseInt(String str) {
//		//파라미터로 전달한 값을 인트로 전환하는 기능
//	}
//	
//	
//	public static double Math.random() {
//		//파라미터로 전달한 값을 인트로 전환하는 기능
//	}
	
	


	
	public static void main(String[] args) { // 메인은 프로그램 시작점 / 본격적 코드는 main에 담지않음. 코드 밖에 짬
											// 메인 사장님
//		System.out.println(10 + 5);
//		
//		plus(10,5) // 덧셈이 필요할 때 직원을 부름 / 메서드를 콜한다. 메서드콜
//					// 제어문옆에 붙어있는 소괄호만 아니라면 메서드콜 전부 가능
//		
//		plus() // 전달할 값 없으면
//		plus(10,5) // 전달할 값 있으면 / Method 를 Call 하며 전달하는 값을 인자값(parameter 파라미터) = 10,5
//		
//		
//		15 // 코드상에서 plus(10,5)로 보이긴함
//			// 복귀하면 plus(10,5)를 지우고 15만 남김 
		
		int result = plus(10,5); // 그래서 자료형이 아니라 int 형이다. 
		// 코드흐름이 위로, 위에서 계산하고 리턴, 원래 자리에, 그리고 result 에 값이 저장 끝
		
		System.out.println(result);
		
		
//		System.out.println(); 메서드
		
		Scanner sc = new Scanner(System.in);
		
/*		
		
		sc.nextLine();	// 메서드콜  / 스탠다드 라이브러리 메서드 / 표준, 내장 메서드
		// 인자값을 안넣어도 오류가 안남. = > 매개변수가 없다. / 인자값과 매개변수는 짝을 이룬다.
		
		String name = sc.nextLine(); // 메서드 타입이 스트링. 리턴값이 스트링
		
		// 제어문(if for while)이 아닌데 () 소괄호 붙어있으면 전부다 메서드콜
		// 맨 위에 우리가 만든건 사용자 메서드
		
//		Integer.parseInt();

		Integer.parseInt(sc.nextLine()); //sc.nextLine() : 인자값 / 문자값
		// parseInt의 역할 : 입력값(문자열)을 숫자로 바꾸는 기능
		
//		System.in.read(); // 알파벳 한글자를 숫자로 받아주는 기능 / 인트값
		
		
		
		
		plus(10,50);
		sc.nextLine();
		
		int num = plus(10,50);
		String name2 = sc.nextLine();
		int num2 = Integer.parseInt(sc.nextLine()); // 파스인트는 무슨 형 몇 개? 스트링형, 1개 
		// 파스인트의 리턴값이 인트라서 num2 앞에 int를 붙임  // sc.는 인스턴스
		
		
		double rand = Math.random(); // ()안에 아무것도 없다 = 파라미터 없다. = 매개변수 없다. 
		// 랜덤은 무슨 형 몇 개? double형
		// 0~1사이의 난수. 랜덤의 리턴 값은 double형
		// 컨트롤 + 클릭하면 메서드 보여줌
		
		
		// 메서드를 보면서 리턴값과 파라미터가 있겠지 라고 생각.
		
		
		
		
*/		
		// minus(20,10); / 정의되어 불러서 사용하는 지점 : 메서드 호출부
		
		int resultminus = minus(20,10);
		System.out.println(resultminus);
		
		int resultmply = mply(20,10);
		System.out.println(resultmply);
		
		double resultdivide = divide(20,3);
		System.out.println(resultdivide);
		
		
		
		int resultbigger= bigger(30,30);
		System.out.println(resultbigger);
		
		
		String word = translate(sc.nextLine());
		System.out.println(word);


		
		
	}
}
