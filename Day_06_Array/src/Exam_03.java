import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[4];

		for(int i=0;i<x.length;i++) {
			
			System.out.print("입력 : ");
			i = Integer.parseInt(sc.nextLine());

			System.out.println(i);		
			
		}
		
	}
}
