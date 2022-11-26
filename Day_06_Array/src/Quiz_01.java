//실습문제 1 페이지 79

import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int COUNT = 3; // int num = 3; 아니고(이거는 변수임) 상수값으로 나타냄
		String[] name = new String[COUNT];
		int[] kor = new int[COUNT];
		int[] eng = new int[COUNT];

		for(int i = 0;i < name.length;i++) {
			System.out.print((i+1) + " 번째 학생 이름 : ");
			name[i] = sc.nextLine();
			System.out.print(name[i] + " 학생 국어 : ");
			kor[i] = Integer.parseInt(sc.nextLine());
			System.out.print(name[i] + " 학생 영어 : ");
			eng[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("이름\t국어\t영어\t합계\t평균"); // /t = tab / //t = /t 기능이 빠짐
		// System.out.println("이름	" + "국어	" + "영어	" + "합계	" + "평균");
		
		for(int i = 0;i < name.length;i++) {
			int sum = kor[i] + eng[i];
			double avg = sum / 2.0;
			
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + sum + "\t" + avg );
			// System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + (kor[i] + eng[i]));	
		}

	}

}
