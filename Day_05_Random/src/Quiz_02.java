import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=== 동전 앞 뒤 맞추기 ===");
			System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
			int num = Integer.parseInt(sc.nextLine());
			
			// 난수 1 또는 2 만들기	
			double i = Math.random();
	
			if (num == (int)(i*2+1)) {
				System.out.println("맞췄습니다^^");
			} else {
				System.out.println("땡! 틀렸습니다!");	
			}
			
			System.out.println("--------------------------->restart");
		}
	}
	
	
}
