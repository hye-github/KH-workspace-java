import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		

		// 참조형은 스택(값)이랑 힙(주소/대입) 메모리 두군데를 사용
		// 기본형: 고정적인 사이즈, 크기가 작음 / 참조형: 가변적인 사이즈(ex.String)
		

		String a = new String("Hello"); // 너무 기본적이라 new 생략 가능. 다른 것은 생략 불가
		String b = "Hello"; // 너무 기본적이라 new 생략 가능. 다른 것은 생략 불가

		
//		int[] arr; // 배열 만든게 아님 / 배열에 저장될 주소를 저장할 수 있는 변수를 만든 것
					// 힙에 저장된 주소를 저장할 변수
		
//		new int[4]; // new 키워드는 Heap 메모리를 사용하겠다는 문법. 단순히 만들어라 가 아니라 만들고 나서 주소를 가져와라 
		
//		int a = new int[4]; // 안됨  / 정수 = 주소(는 자료형이기때문에)
		
//		String a = new int[4]; // 안됨  / 주소와 스트링과는 다름
		

//		double[] arr = new double[1000000000]; // java.lang.OutOfMemoryError: Java heap space
												// 메모리를 벗어났습니다. 라고 에러뜸
		
		
		
		//결론
		
		int[] arr = new int[4]; // []안의 숫자 : 배열의 크기(arr.length)
								// 인트형 주소를 만들어냈으면 인트형 주소를 담아낼 수 있는 인트형 참조 변수를 만들어야함 
		
		arr[0] = 1; // 값 안넣으면 숫자 0 으로 출력됨. 
		arr[1] = 10;
		arr[2] = 100;
		arr[3] = 1000;
		
		// int[] arr = new int[] {1,10,100,1000}; // 위랑 동일 문법. 다만, 배열의 크기 값을 넣으면 안됨.
		
		
		System.out.println("배열의 크기 : " + arr.length);
		
//		arr[4] = 10000; // 배열 첨자값이 경계를 벗어나는 예외가 생겼습니다. Index4 때문이라고 오류문 뜸
		
		

//		arr[0];
//		arr[1-1];
//		arr[(int)(Math.random()*3)];  // 숫자로 끝나기만하면 됨
		
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]); //  for문으로 i값 만들어서 돌리면 훨씬 편해짐
		
		
//		for(int i = 0;i < 4;i++) { //28번째 줄 값도 숫자 바꿔야 가능 
//			System.out.println(arr[i]);
//		}
		
		for(int i = 0;i < arr.length;i++) { // arr.length 로 크기 나타내기
			System.out.println(arr[i]);
		}
		
		
	}
}
