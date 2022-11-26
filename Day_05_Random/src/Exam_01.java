
public class Exam_01 {
	public static void main(String[] args) {

		// 0 ~ 1 사이의 임의 난수 (0.x)
		double rand = Math.random(); // 0.99999...9 / 0.00000...1 이 가장 크고 가장 작다
		
		// 난수 출력
		System.out.println(rand);
		
		// 난수의 범위를 조절하는게 필요
		System.out.println((int)(rand * 10)); // 0~9까지 가능
		
		// 주사위 만들 때는
		System.out.println((int)(rand * 6)); // 0~5까지 가능
		System.out.println((int)(rand * 6)+1); // 1~6까지 가능
		
		
		/* 난수 구하는 공식이 있음. 값만 대입하면 됨.
			구하려는 난수 최대값 : Y - 53
			구하려는 난수 최소값 : X - 37
			(Math.random() * (Y-X+1) + X) / 공식 외우기

			(Math.random() * 17 + 37)
			0(최소값) + 37 / 16(최대값) + 37 */
		
		// 37~53 사이의 난수
		for(int i = 0;i < 100;i++) {
			double rand2 = Math.random(); // 이 조건 없으면 아래는 똑같은 값만 100번 나옴 / 이 위치 조건 중요!!
			System.out.println((int)(rand2 * (53-37+1) + 37)); // 37~53까지 가능
		}
		
		
	}
}
