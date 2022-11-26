import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int num = 0;
	      int sum = 0;
	      while(true) {
	         System.out.print("수 입력 (0:종료) : ");
	         num = Integer.parseInt(sc.nextLine());
	         if(num == 0) {break;}
	         sum+=num;
	      }
	      System.out.println("입력한 값들의 합은 : " + sum);
	      
	   }
}
