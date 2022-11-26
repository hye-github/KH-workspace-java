package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();

		while (true) {
			System.out.println("<< 반려동물 전산 시스템 >>");
			System.out.println("1. 반려동물 등록하기 (강아지종류/나이/주인이름/연락처뒷자리)");
			System.out.println("2. 반려동물 등록 현황보기");
			System.out.println("3. 반려동물 등록 정보 삭제하기(주인이름으로 조회)");
			System.out.println("4. 반려동물 등록 정보 수정하기(번호로 조회)");
			System.out.print("메뉴 선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				m.add(new Dog("Samoyed", 2, "Tom", 3837));
				m.add(new Dog("Spitz", 13, "Joo", 5388));
				m.add(new Dog("Shiba", 2, "Lio", 2345));
				m.add(new Dog("Beagle", 1, "Meo", 4573));
				m.add(new Dog("Retriever", 8, "Hou", 1547));
				m.add(new Dog("Maltese", 7, "Qui", 1547));
				m.add(new Dog("Poodle", 5, "Kei", 2808));
				m.add(new Dog("Chihuahua", 11, "Wak", 7688));
				m.add(new Dog("Pekingese", 10, "Siona", 1853));
				m.add(new Dog("Pug", 9, "June", 1546));
				m.add(new Dog("Bulldog", 7, "Pio", 8323));
				m.add(new Dog("Greyhound", 5, "Xiy", 7234));

			} else if (menu == 2) {
				ArrayList<Dog> dogList = m.getDogList(); // ?? 
				System.out.println("강아지 종류\t나이\t주인 이름\t연락처 뒷자리");

				for(Dog dogArr : dogList) { // ??
					System.out.println(dogArr.getDogName()+"\t"+
									dogArr.getDogAge()+"\t"+
									dogArr.getOwnerName()+"\t"+
									dogArr.getPhoneNum());
				}
				
			} else if (menu == 3) {
				System.out.println("삭제");
			
			} else if (menu == 4) {
				System.out.println("수정");
				
			} else if (menu == 5) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}

		}

	}

}
