
public class Quiz_01_split_false {

	public static int countChar(String from, char findThis) {
	      
	      String[] arr = from.split(findThis + "");
	      return arr.length-1; // 배열의 길이 - 1 = 글자 개수
	      
	   }

	   public static void main(String[] args) {
	      String str = "SSASS";
	      int count = countChar(str,'S');
	      System.out.println("대문자 S 의 개수 : " + count);
	   }
	
}
