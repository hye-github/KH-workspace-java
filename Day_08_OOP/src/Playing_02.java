import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class Playing_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("1. 노래1");
			System.out.println("2. 노래2");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());

		if(menu == 1) {
			try{
				FileInputStream fis = new FileInputStream("music01.mp3"); //첫글자가 대문자 = 참조변수
				Player playMP3 = new Player(fis); // 다운받은라이브러리에 있다. // 추가해서 shift + ctrl + o
				playMP3.play();
			}
			catch(Exception exc){
				exc.printStackTrace();
				System.out.println("Failed to play the file.");
			}
		} else if(menu == 2) {

			try{
				FileInputStream fis = new FileInputStream("music02.mp3"); //첫글자가 대문자 = 참조변수
				Player playMP3 = new Player(fis); // 다운받은라이브러리에 있다. // 추가해서 shift + ctrl + o
				playMP3.play();
			}
			catch(Exception exc){
				exc.printStackTrace();
				System.out.println("Failed to play the file.");
			}
		} else {

			System.out.println("메뉴를 다시 확인해주세요.");

		}
	}
}
