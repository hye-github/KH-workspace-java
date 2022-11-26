
public class Quiz_01 {
	public static void main(String[] args) {
//		byte b = 10;
//		short s = 20;
//		char c = 'A';
//		int i;
//		float f;
//		long l = 100L;
//		
//		s = b;
//		c = b;
//		s = c;
//		c = s;
//		i = 100L;
//		l = 500;
//		f = l;
//		f = 5.11;
		
		byte b = 10;
		short s = 20;
		char c = 'A';
		int i;
		float f;
		long l = 100L;
		
		s = b;
		c = (char)b; // casting 바이트는 음수 o, 캐릭터는 안되어서 캐스팅 필요
		s = (short)c; // casting 쇼트는 사이즈가 작음
		c = (char)s; // casting
		i = 100; // int라서 L삭제
		l = 500; // 500은 int 자동으로 형변환됨
		f = l; // 100.0 자동으로 프로모션 형변환됨
		f = 5.11f; // float라서 f추가 / 아니면 f = (float)5.11;
		
	}
}
