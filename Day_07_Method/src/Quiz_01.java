

public class Quiz_01 {

	/*
	public static int countS(String str) {
		
		String[] arr = str.split("S");
		// S 기준으로 쪼개. 그 쪼개진 인덱스 최대 값을 세어 

	} 
	*/
	
	/*
	public static int countS(String str) {
		
		int count = 0;
		
		char ch = str.charAt(0);
		if(ch == 'S') {
			count++;
		}
		
		ch = str.charAt(1);
		if(ch == 'S') {
			count++;
		}
		
		ch = str.charAt(2);
		if(ch == 'S') {
			count++;
		}
		
		// 이걸 str 문자열이 끝날 때까지 반복
	} 
	*/
	
	/*
	public static int countS(String str) {
		
		int count = 0;
		
		for(int i = 0;i < str.length();i++) { // 반복문
			char ch = str.charAt(i);
			if(ch == 'S') { // S 대신에 문자를 찾을 수 있게끔
				count++;
			}
		}
		return count;
		
	} 
	

	public static void main(String[] args) {

	String str = "sadjQWONSLDKASDLINKHskdfhwqksdfjQLINRJDSNFSDKFkhkqwjrhsdfnQKJHSflJrhhdsfhQEj";

	int count = countS(str); // 대문자 S 개수를 찾아서 리턴
	System.out.println("대문자 S 의 개수 : " + count);

	}

	*/
	
	
	public static int countS(String from, char findThis) {
		
		int count = 0;
		
		for(int i = 0;i < from.length();i++) { // 반복문
			char ch = from.charAt(i);
			if(ch == findThis) { // S 대신에 문자를 찾을 수 있게끔
				count++;
			}
		}
		return count;
		
	} 
	

	public static void main(String[] args) {

	String str = "sadjQWONSLDKASDLINKHskdfhwqksdfjQLINRJDSNFSDKFkhkqwjrhsdfnQKJHSflJrhhdsfhQEj";

	int count = countS(str, 'a'); // 대문자 S 개수를 찾아서 리턴
	System.out.println("소문자 a 의 개수 : " + count);

	}
	
	
	
}
