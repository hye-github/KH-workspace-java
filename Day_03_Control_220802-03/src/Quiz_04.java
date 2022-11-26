
public class Quiz_04 {
	public static void main(String[] args) {
	
		//1~100 / 5의 배수일 때만 짝 글자 나오게 하기
		
		
		int i = 0;
		while(i < 100) {
			i++;
			
			if(i % 5 == 0) {
				System.out.println("짝!");
			}else {
				System.out.println(i);
			}
			
		}
		
		
	}
	
}
