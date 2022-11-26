
public class Exam_05 {
	public static void main(String[] args) {
		
		// 1 ~ 5 난수 
		 System.out.println((int)(Math.random()*5+1));
		// 1 ~ 5 난수 
		 System.out.println((int)(Math.random()*5+1));
		// 1 ~ 5 난수 
		 System.out.println((int)(Math.random()*5+1));
		 
		 
		 // 3가지 방법 HashSet(해쉬셋) 제일 쉽게 가능 
		 // 난수를 돌려서 출력 전에 앞에 나온 값이 아닌지 검사해서 안나왔으면 출력 / 이중 루프 들어감 / 알고리즘 난이도가 높아짐 
		 // * 난수랑 배열, 스왑을 섞으면 겹치지않는 난수 뽑는게 가능해짐 / 배열 + 스왑 + 난수 = 카드섞기알고리즘
		 // 카드의 역할 = 배열 / 난수 + 스왑 = 카드섞기셔플 / 
		 
		 /*
		 int[] cards = new int[] {1,2,3,4,5};
		 // 셔플을 해야함
		 System.out.println(cards[0] + ":" + cards[1] + ":" + cards[2]);
		 // 난수가 아니고 겹치지않는 수일 뿐임
		 */
		 
		 int[] cards = new int[] {1,2,3,4,5};
		 // 셔플을 해야함
		 for(int i = 0; i < cards.length*10;i++) {
			 int x = (int)(Math.random()*5); //숫자 0~4
			 int y = (int)(Math.random()*5); //숫자 0~4
			 
			 int tmp = cards[x];
			 cards[x] = cards[y];
			 cards[y] = tmp;  // 카드[0] ~ 카드[4] 의 값이 셔플됨 / 스왑기법
		 }
		 
		 System.out.println(cards[0] + ":" + cards[1] + ":" + cards[2]);
		 // 난수가 아니고 겹치지않는 수일 뿐임
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
