import java.util.Scanner;

// 1~n까지의 합 구하기

public class Homework2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== 1 ~ n 까지의 합 구하기 ==");
		System.out.print("n 입력 : ");

		int n = Integer.parseInt(sc.nextLine()); 
		
	
		int sum = 0;

		
		// 수학 공식 써서 푸는게 cpu 잘 안써서 더 효율적
		
		// 반복문 안쓰고 풀어보기 n = 3 일 때,
		// 일단 1이 필요, + 2 + 3 = 이 결과값을 변수에 저장
		// 모든걸 더할 int sum = 0; 을 만들기
		// sum = sum + 1;  ㅁ = x 기준으로 오른쪽은 값, 왼쪽은 공간
		// sum = sum + 2;
		// sum = sum + 3;
		
		
//		for (int i = 1; i <= n; i++) {  // 실제 선생님 풀이
//			sum = sum + i;
//		}
		
		
		String str = "";
		for (int i = 1; i <= n; i++) {
			str = str + i;
			if(i != n) {
				str += " + ";
			}
			sum = sum + i;
		}
		System.out.println(str + " = " + sum);
		
		
		
//		int sum = 0;
//		int i = 1;
//		
//		while(i<=n) {
//			sum += i;
//			i++;
//		}
		
		System.out.print("1 ~ " + n + " 까지의 합은 " + sum + " 입니다.");
			
	}
	
}
