
public class Exam_04 {
	public static void main(String[] args) {
		
		
		/*
		
//		break; // 이 자리에서는 사용 불가. 반복문 내에서만 사용 가능하기 때문에
		
		for(int i = 1;i <= 10;i++) {
			if(i == 5) {
				break; // 1-10까지 출력되게 만들어진 반복문이었으나 5가 되어서 출력 멈추게 만듦
						// 닫히는 중괄호(본인이 속한 루프문-현재 for문) 밖으로 벗어나버림. 컴퓨터 실행 x
						// 결론은 5,6,7,8,9,10까지 실행 안됨.
			}
			System.out.println(i);
		}
		
		*/
		
		
		//이중반복문 :tip 같은 것. 사용 빈도가 높지않음
		
		int j = 0;
		
		abc: while(j < 5) {  // 레이블 이름 지정하기
			
			for(int i = 1;i <= 10;i++) {
				if(i == 5) {
					break abc; // 레이블 이름 붙이기
				}
				System.out.println(i);
			}
			
		}
		
		
	}
}
