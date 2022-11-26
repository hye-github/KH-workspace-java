import java.util.Scanner;

public class Exam_03_answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/* p.78 버퍼 입력을 스캐너 입력으로 나타낸 것 

		int x,y,z,a1;
	
		System.out.print("첫 번째 값 : ");
		x = Integer.parseInt(sc.nextLine());
	
		System.out.print("두 번째 값 : ");
		y = Integer.parseInt(sc.nextLine());
	
		System.out.print("세 번째 값 : ");
		z = Integer.parseInt(sc.nextLine());
	
		System.out.print("네 번째 값 : ");
		a1 = Integer.parseInt(sc.nextLine());
	
		System.out.println("첫 번째 값 : " + x);
		System.out.println("두 번째 값 : " + y);
		System.out.println("세 번째 값 : " + z);
		System.out.println("네 번째 값 : " + a1);
	
		아래는 위 내용을 배열로 나타낸 것

		 */


		int[] arr = new int[4];

		for(int i = 0;i < arr.length;i++) {
			System.out.print((i+1) + " 번째 값 : ");
			arr[i] = Integer.parseInt(sc.nextLine());		
		}

		for(int i = 0;i < arr.length;i++) {
			System.out.println((i+1) + " 번째 값 : " + arr[i]);
		}

	}
}
