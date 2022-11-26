import java.util.Scanner;

public class Quiz_02_answer {
	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);

	      while(true) {
	         System.out.println("=== 동전 앞/뒤 맞추기 ===");
	         int coin = (int)(Math.random() * 2 + 1); // 동전의 앞/뒷면 결정

	         System.out.println("1.앞면 / 2.뒷면 / 0.종료");
	         System.out.print(">> ");
	         int player = Integer.parseInt(sc.nextLine()); // 플레이어의 찍기 결정

	         if(player == 0) {
	            System.exit(0);
	         }
	         
	         if(coin == player) {
	            System.out.println("맞추었습니다!");
	         }else {
	            System.out.println("틀렸습니다!");
	         }
	      }
	}
	
	
}
