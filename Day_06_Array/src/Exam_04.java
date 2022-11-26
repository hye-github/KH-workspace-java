
public class Exam_04 {
	public static void main(String[] args) {

		int[] arr = new int[] {10,20}; // 0번에 10, 1번에 20 들어있다
		
//		arr[0] = arr[1];  // 0번에 20, 1번에 20 들어있다
//		arr[1] = arr[0];  // 0번에 10, 1번에 10 들어있다

		
//		arr[0] = 20;
//		arr[1] = 10; // 이 코드는 대입임
		
		System.out.println(arr[0] + ":" + arr[1]);
		
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp; // 이 코드가 교환
		
		System.out.println(arr[0] + ":" + arr[1]);
		
	}
}
