package midlevel;

import java.util.ArrayList;
import java.util.Scanner;

// Design Pattern MVC1 = Model / View+Control
// Model View Control

public class Main {
	public static void main(String[] args) {

		// 우리가 만든 회원관리 시스템의 3가지 치명적인 문제점
		// 1. 코드 중복도가 높다	-> 상속 문법으로 해결 (비슷한 코드 줄이기)
		// 2. 코드 결합도가 높다	-> 다형성 문법으로 해결 (각 클래스간의 결합도)
		// 3. 데이터 저장소 문제	-> Collection 으로 해결 (배열 사이즈 정하는 부분)



		Scanner sc = new Scanner(System.in); //VIEW
		Manager manager = new Manager(); //매니저 인스턴스생성 배열10칸 기억


		while (true) {
			System.out.println("<< 회원 관리 시스템 >>");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 출력");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {

				manager.addMember(new Silver(1001, "Alice", 1000));
				manager.addMember(new Silver(1002, "Tom", 2000));
				manager.addMember(new Silver(1003, "Jason", 3000));
				manager.addMember(new Gold(1004, "Mike", 4000));
				manager.addMember(new Ruby(1005, "Elsa", 5000));
				
			} else if(menu == 2) {  //출력 파트

				ArrayList<Member> members = manager.getMembers();  // Method / ArrayList형

				System.out.println("아이디\t이름\t포인트\t보너스");

//				for(int i = 0;i < members.size();i++) {  // members의 자료형 ArrayList
//					System.out.println(((members.get(i))).getId() + "\t" +  // members.get(i)의 자료형 Object
//							((members.get(i))).getName() + "\t" +	// Member 형으로 downcasting 다형성을 남발한 댓가. 이래야 .찍고 get이 출력됨
//							((members.get(i))).getPoint() + "\t" +
//							((members.get(i))).getBonus());
//				}
				
				
				for(Member membersGet : members) { // Foreach문으로 변경해보세요.
					System.out.println(membersGet.getId() + "\t" + 
							membersGet.getName() + "\t" + 
							membersGet.getPoint() + "\t" +
							membersGet.getBonus());
				}

			}
		}
	}
}

