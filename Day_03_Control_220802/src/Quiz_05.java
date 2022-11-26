import java.util.Scanner;

public class Quiz_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지를 몇 번 출력하시겠습니까 ? ");
		int num = Integer.parseInt(sc.nextLine());
		
		int i = 0;
		while(i < num) { // 입력한대로 프린트 되기
			i++;
			System.out.println("Hello Java");	
		}
		

	}
}
