//조별테스트
public class Quiz_06 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println(++a == 10 && b++ == 20); // shortcut 연산
		System.out.println(a + " : " + b);
		
		System.out.println(++a); // 위에 있어서 한번더 계산됨 . 원래는 11
		System.out.println(++a == 10);
		
		System.out.println(b++); // 후치형이라 20
		System.out.println(b++ == 20); // 21됨

	}
}
