
public class Exam_02 {
	public static void main(String[] args) {
	
		System.out.println(10 / 3);
		
		short a = 0;
		byte b = 10;
		a = b;
		
		int sum = 98;
		System.out.println("당신의 총점은 " + sum + "점");
		System.out.println("당신의 총점은 " + sum + '점');
		// 프로모션 활용 사례
		
		byte t = 0;
		short s = 100; // 현재 들어가있는 값이 중요하지않다. 사이즈가 중요하다
		t = (byte)s; // 강제 형 변환 형상
		System.out.println(t);
		
		//연산자
		
		int a1 = 10;
		int a2 = 20;
		
		System.out.println(a1 += a2);
		System.out.println(a1 + a2);
		
	}
}
