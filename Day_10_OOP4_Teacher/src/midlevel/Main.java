package midlevel;

import java.util.ArrayList;
import java.util.Scanner;

// Design Patter MVC1
// Model View Control

public class Main {
	public static void main(String[] args) {

		// 우리가 만든 회원관리 시스템의 3가지 치명적인 문제점
		// 1. 코드 중복도가 높다	-> 상속 문법으로 해결
		// 2. 코드 결합도가 높다	-> 다형성 문법으로 해결
		// 3. 데이터 저장소 문제	-> Collection 으로 해결
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();

		while(true) {
			System.out.println("<< 회원 관리 시스템 >>");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 출력");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {

				manager.addMember(new Silver(1001, "Alice", 1000)); 
				manager.addMember(new Silver(1002, "Tom", 2000));	
				manager.addMember(new Silver(1003, "Jason", 3000));
				manager.addMember(new Gold(1004,"Mike",4000));
				manager.addMember(new Ruby(1005,"Elsa",5000));

			}else if(menu == 2) {
				ArrayList members = manager.getMembers();
				System.out.println("아이디\t이름\t포인트\t보너스");
				for(int i = 0;i < members.size();i++) {
					System.out.println(((Member)members.get(i)).getId() + "\t" + 
							((Member)members.get(i)).getName() + "\t" +
							((Member)members.get(i)).getPoint() + "\t" + 
							((Member)members.get(i)).getBonus()
					);
				}
			}
		}


	}
}
