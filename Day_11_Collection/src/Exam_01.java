
public class Exam_01 {
	public static void main(String[] args) {
		
		System.out.println("배열 예제");
		
		String[] arr = new String[10];
		
		arr[0] = "Hello";
		arr[1] = "World";
		arr[2] = "collection";
		//arr[3] = 100; // 스트링형 자료형(동일한 자료형)의 집합
		
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = null;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		arr[2] = arr[1];
		arr[1] = "Hello";
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr.length); // 배열 전체 크기 출력 : 10 , 
										// 요소수는 for문으로 돌려야 셀 수 있다.
		
	}
}
