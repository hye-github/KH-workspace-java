import java.util.Scanner;

public class ExceptionHandler {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(true) { // 제대로 입력할 때까지 반복. 반복 입력이 필요할 때만 while true

			System.out.print("숫자 입력 : ");
			try { // 신규문법. 예외처리기법. try 시도해라
				
/* int // 변수 선언 */ num = Integer.parseInt(sc.nextLine());	// 에러가 발생 될 것으로 예상되는 지점을 예외처리한다.
															// 에러가 발생하는 즉시 바로 catch로 건너뜀.
															// (아래 1 출력 안됨) 
															// try catch
				System.out.println("1 정상입력되었습니다.");	// 에러가 난 지점과 catch 사이는 실행 안됨
				break; // 성공적으로 입력을 받게 되면 꼭 넣기. 안넣으면 무한반복됨
				
			}catch(Exception e) { // 에러가 안나면 catch 구문은 실행이 안됨.
									// 에러가 나면 catch로 건너뛴다.
				System.out.println("2 숫자를 입력해야합니다."); // (숫자 입력 : ) 쪽으로 올라가야함. 
			}
			
		}
	
		
		System.out.println("3 사용자가 입력한 수는 : " + num); //break; 안넣으면 여기까지 도달이 안됨
		
	}
	
}
