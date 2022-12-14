package midlevel;

import java.util.Scanner;

// Design Pattern MVC1 = Model / View+Control
// Model View Control

public class Main_bf {
	public static void main(String[] args) {

		// 우리가 만든 회원관리 시스템의 3가지 치명적인 문제점
		// 1. 코드 중복도가 높다	-> 상속 문법으로 해결 (비슷한 코드 줄이기)
		// 2. 코드 결합도가 높다	-> 다형성 문법으로 해결 (각 클래스간의 결합도)
		// 3. 데이터 저장소 문제	-> Collection 으로 해결 (배열 사이즈 정하는 부분)
		
		
		
		 Scanner sc = new Scanner(System.in); //VIEW
	     Manager manager = new Manager(); //매니저 인스턴스생성 실버클래스의 배열10칸 기억


		while (true) {
			System.out.println("<< 회원 관리 시스템 >>");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 출력");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {

				manager.addMember(new Silver(1001, "Alice", 1000)); // 내용을 매니저에게 줘서 배열에 저장할 수 있도록 한다. 매니저에 보관이라는 기능을 만든다.
				manager.addMember(new Silver(1002, "Tom", 2000)); // 눈에 안보이지만 디폴트 생성자는 있다. 하지만 3개 값을 인자로 전달 받을 생성자가 없다. 
				manager.addMember(new Silver(1003, "Jason", 3000));
				manager.addMember(new Gold(1004, "Mike", 4000));
				manager.addMember(new Gold(1005, "Elsa", 5000));
//
			} else if(menu == 2) {  //출력 파트
		        Silver[] silverMembers= manager.getSilverMembers(); //출력 //실버형 배열이
				Gold[] goldMembers = manager.getGoldMembers();
				
				System.out.println("아이디\t이름\t포인트\t보너스");
				
				for(int i = 0;i < manager.getSilverIndex();i++) {
					System.out.println(silverMembers[i].getId() + "\t" + 
										silverMembers[i].getName() + "\t" + 
										silverMembers[i].getPoint() + "\t" + 
										silverMembers[i].getBonus());
				}
				
				for(int i = 0;i < manager.getGoldIndex();i++) {
					
					System.out.println(goldMembers[i].getId() + "\t" + 
										goldMembers[i].getName() + "\t" + 
										goldMembers[i].getPoint() + "\t" + 
										goldMembers[i].getBonus());
				}
				
				
				
			}
		}
	}
}
//



//
//package midlevel;
//
//import java.util.Scanner;
//
//// Design Pattern MVC1 = Model / View+Control
//// Model View Control
//
//public class Main {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		Manager manager = new Manager();
//
//		while (true) {
//			System.out.println("<< 회원 관리 시스템 >>");
//			System.out.println("1. 신규 회원 등록");
//			System.out.println("2. 회원 정보 출력");
//			System.out.print(">> ");
//			int menu = Integer.parseInt(sc.nextLine());
//
//			if (menu == 1) {
//
//				manager.addMember(new Silver(1001, "Alice", 1000)); // 내용을 매니저에게 줘서 배열에 저장할 수 있도록 한다. 매니저에 보관이라는 기능을 만든다.
//				manager.addMember(new Silver(1002, "Tom", 2000));
//				manager.addMember(new Silver(1003, "Jason", 3000));
//
//			} else if (menu == 2) {
//				Silver[] members = manager.getMembers();
//
//				System.out.println("아이디\t이름\t포인트\t보너스");
//				for(int i = 0;i < manager.getIndex();i++) {
//					System.out.println(members[i].getId() + "\t" + members[i].getName() + "\t" + members[i].getPoint() + "\t" + members[i].getBonus());
//				}
//			}
//		}
//	}
//}





/*
package midlevel;

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

				manager.addMember(new Silver(1001, "Alice", 1000)); // 내용을 매니저에게 줘서 배열에 저장할 수 있도록 한다. 매니저에 보관이라는 기능을 만든다.
				manager.addMember(new Silver(1002, "Tom", 2000)); // 눈에 안보이지만 디폴트 생성자는 있다. 하지만 3개 값을 인자로 전달 받을 생성자가 없다. 
				manager.addMember(new Silver(1003, "Jason", 3000));
				manager.addMember(new Gold(1004, "Mike", 4000));
				manager.addMember(new Ruby(1005, "Elsa", 5000));
				
			} else if(menu == 2) {  //출력 파트
				Member[] members = manager.getMembers(); 

				System.out.println("아이디\t이름\t포인트\t보너스");

				for(int i = 0;i < manager.getIndex();i++) {
					System.out.println(members[i].getId() + "\t" +  // 원래 멤버 기능. 다운캐스팅 필요없다.
							members[i].getName() + "\t" +  			// 원래 멤버 기능. 다운캐스팅 필요없다.
							members[i].getPoint() + "\t" + 			// 원래 멤버 기능. 다운캐스팅 필요없다.
							members[i].getBonus());					// 겟보너스=추상메서드. 멤버형 오버라이딩된 경우. 
				}

			}
		}
	}
}


*/