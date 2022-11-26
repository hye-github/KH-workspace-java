// 배열 p.162

import java.util.Scanner;

public class Ex_SeqSearch {
	public static void main(String[] args) {
		int s[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int value, index = -1; // 왜 여기에다가 -1을 넣은거야? 굳이 필요 없는 수인데... // 에러를 상징하는 수. 1은 정상종료.

		Scanner sc = new Scanner(System.in);
		System.out.println("탐색할 값을 입력하시오: ");
		value = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < s.length; i++) {
			if(s[i] == value)
				index = i;
		}

		if(index < s.length && index >= 0)
			System.out.println(" " + value + "값은 " + index + "위치에 있습니다.");
	}
}
