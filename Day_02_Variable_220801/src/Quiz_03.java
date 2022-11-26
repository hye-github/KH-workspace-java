
public class Quiz_03 {
	public static void main(String[] ar) {
		int i1 = 10;
		int i2 = 20;
		float f1 = 3.14f;
		char c1 = 'A';
		char c2 = 'B';

		System.out.println("결과 : " + i1 + i2); //결과 : 1020 스트링으로 연결
		System.out.println("결과 : " + (i1 + i2)); //결과 : 30 동일 인트
		System.out.println("결과 : " + i1 + f1); //결과 : 103.14
		System.out.println("결과 : " + (i1 + f1)); //결과 : 13.14
		System.out.println("결과 : " + f1 + c1); //결과 : 3.14A 스트링으로 연결
		System.out.println("결과 : " + (f1 + c1)); //결과 : 68.14 괄호라 오른쪽부터 연결. 캐릭터랑 플롯. 프로모션 됨. 더하기는 큰값을 따라 감.
		System.out.println("결과 : " + c1 + c2); //결과 : AB 스트링으로 연결
		System.out.println("결과 : " + (c1 + c2)); //결과 : 131 연결은 문자열끼리 더할때만 가능. 해당건은 정수형태임. 연산이 되기때문에 65 + 66

	}
}
