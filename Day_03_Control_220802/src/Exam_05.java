
public class Exam_05 {
	public static void main(String[] args) {
	
/*		
		for(int i = 1;i <= 10;i++) {
			if(i == 5) {
				continue; //이쪽으로 점프하게됨. 다음으로 넘어가겠다는 의미. 탈출 아님. 브레이크는 저쪽으로 탈출 
							// 5만 출력 안됨. 5일 때만 다음으로 넘어갔음.
			}
			System.out.println(i);
			//이쪽
		}
		//저쪽

*/
		
		int i;
		
		for(i = 1;i <= 10;i++) {
			if(i == 2 || i == 5) {
				continue;
				}
				System.out.println("i = " + i);
				
				if(i == 8) {
					break;
				}
			}
		}
		
	}

