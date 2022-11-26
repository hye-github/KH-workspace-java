
/* 사용자가 원하는 랜덤 범위의 값 추출
 * 
 * 
*/

public class Quiz_01 {
	public static void main(String[] args) {
		
		double rand = Math.random();
		
		System.out.println("0~9까지의 랜덤 수 : " + (int)(rand*10));		
		System.out.println("1~10까지의 랜덤 수 : " + (int)(rand*(10-1+1)+1));
		System.out.println("20~35까지의 랜덤 수 : " + (int)(rand*(35-20+1)+20));
		System.out.println("0 또는 1 : " + (int)(rand*(1-0+1))); // 0~10 미만의 수는 n+1 (n=큰수) 하면 됨
		
	}
}
