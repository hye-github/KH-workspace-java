
public class Exam_02 {
	public static void main(String[] args) {

		// char 형 배열 3칸짜리를 만들고 'A','F','Z' 넣어보세요.

		char[] cha = new char[]{'A','F','Z'};

		char[] cha2 = new char[3];
		cha2[0] = 'A'; 
		cha2[1] = 'F';
		cha2[2] = 'Z';
		
		System.out.println(cha[0]);
		System.out.println(cha[1]);
		System.out.println(cha[2]);
		
		System.out.println(cha2[0]);
		System.out.println(cha2[1]);
		System.out.println(cha2[2]);
		
		
		// String 형 배열 2칸짜리를 만들고 "Hello", "Array" 담아보세요.

		String[] str = new String[] {"Hello","Array"};

		String[] str2 = new String[2];
		str2[0] = "Hello";
		str2[1] = "Array";

		System.out.println(str[0]);
		System.out.println(str[1]);
		
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		
		
		// int 형 배열 arr3를 100칸짜리를 만들고 100 ~ 1 역순으로 담아보세요.
		

		int[] arr3 = new int[100];
		
		for(int i = 0;i < arr3.length;i++) {
			arr3[i] = 100 - i;
//				0       100
//				1        99
//				2        98
//				3        97		
		}

		System.out.println(arr3[99]); // 1;
		System.out.println(arr3[0]); // 100;
		
		// char 형 배열 arr4 를 26칸짜리로 만들고 A-Z 또는 Z-A 까지 담아보세요.
		
		// A-Z
		char[] arr4 = new char[26];
		for(int n = 0;n < arr4.length;n++) {
			arr4[n] = (char)('A' + n); // 강사님 답안
//				0        A 65
//				1        B 66
//				2        C 67
//				3        D 68	
//			arr4[n] = (char)(n + 65);
			
			System.out.println(arr4[n]);

		}
		
		// Z-A
		char[] arr5 = new char[26];
		for(int m = 0;m < arr5.length;m++) {
			arr5[m] = (char)('Z' - m); // 강사님 답안
//			0        Z 
//			1        Y 
//			2        X 
//			3        W 
//			arr5[m] = (char)(90 - m);
			
			System.out.println(arr5[m]);

		}
		
		
	}
}
