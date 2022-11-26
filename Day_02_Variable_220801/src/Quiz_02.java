
public class Quiz_02 {
	public static void main(String[] args) {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L; //가독성의 L, 4바이트 이하는 L을 써도 되고 안써도 된다
		
//		/*1*/ b = (byte)i;
//		/*2*/ ch = (char)b;
//		/*3*/ short s = (short)ch;
//		/*4*/ float f = (float)l;
//		/*5*/ i = (int)ch;
		
		/*1*/ b = (byte)i; 
		/*2*/ ch = (char)b; // 바이트는 음수를 가질 수 있기때문에 변환 필요
		/*3*/ short s = (short)ch; // 캐릭터는 큰 숫자를 저장할 수 있기때문에 쇼트는 불가능 
		/*4*/ float f = l; // 실수형이 무조건 크다 = 공식 같은 것
		/*5*/ i = ch; // 캐릭터는 인트에 들어갈 수 있음

	}
}
