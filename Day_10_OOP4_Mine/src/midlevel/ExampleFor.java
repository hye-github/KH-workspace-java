package midlevel;

public class ExampleFor {
	public static void main(String[] args) {
		
		int [] arr1 = new int[] {5,4,1,3,2};
		
//		for(int i = 0;i < arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for(int a : arr1) { // 우리가 평소 쓰던 for문과 다름 / 변형 for문 // Foreach문
					// : 기준으로 오른쪽에는 Collection을 넣어야한다. Collection:하나 이상의 변수를 묶어서 사용하는 자료 형태
					// arr이 왼쪽을 향하는 총 / 1,2,3,4,5는 총알 / 왼쪽은 총알 하나의 변수
			System.out.println(a);	// 대괄호 arr[i] 필요없어서 편함
		}
		
		
		String[] arr2 = new String[] {"Hello" , "New" , "For"};
		
		for(String str : arr2) { 
			System.out.println(str);
		}
		
		
	}
}
