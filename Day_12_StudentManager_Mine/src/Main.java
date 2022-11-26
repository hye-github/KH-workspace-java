
// 조건. MVC1 구조를 적용하여 만드세요.
// MVC2 구조 가 된게 아닌가??

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		ArrayList<Student> members = manager.getMembers();

		while (true) {
			System.out.println("<< 학생 관리 시스템 >>");
			System.out.println("1. 신규 정보 입력 ( 학번 / 이름 / 국어 / 영어 / 수학 )");
			System.out.println("2. 학생 목록 출력 ( 학번 / 이름 / 국어 / 영어 / 수학 / 합계 / 평균 )");
			System.out.println("3. 학생 정보 검색 ( 이름으로 검색 )");
			System.out.println("4. 학생 정보 삭제 ( 학번으로 삭제 )");
			System.out.println("5. 학생 정보 수정 ( 학번으로 수정 )");
			System.out.println("6. 프로그램 종료");
			System.out.print(">> ");
			int menu = manager.getValidNum();

			switch(menu) {
			case 1 :
				manager.addMember(new Student(1001, "Tom", 70, 80, 20));
				manager.addMember(new Student(1002, "Ash", 55, 100, 69));
				manager.addMember(new Student(1003, "Piona", 28, 34, 12));
				manager.addMember(new Student(1004, "Jun", 89, 92, 77));
				manager.addMember(new Student(1005, "Jun", 89, 92, 77));
				System.out.println("신규 정보가 입력 되었습니다.");
				break;

			case 2 :
				System.out.println("학생 목록을 출력합니다.");
				System.out.println("========================================");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				for(Student membersGet : members) { 
					System.out.println(membersGet.getIdnum() + "\t" 
							+ membersGet.getName() + "\t" 
							+ membersGet.getKor() + "\t" 
							+ membersGet.getEng() + "\t" 
							+ membersGet.getMath() + "\t" 
							+ membersGet.getSum() + "\t" 
							+ membersGet.getAvg());
				}
				break;

			case 3 :
				System.out.print("검색할 학생의 이름 : ");
				String namesearch = sc.nextLine();

				System.out.println("========================================");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");



				boolean notFound = true;
				for(Student membersGet : members) { 
					if(membersGet.getName().equals(namesearch)) {
						System.out.println(membersGet.getIdnum() + "\t" 
								+ membersGet.getName() + "\t" 
								+ membersGet.getKor() + "\t" 
								+ membersGet.getEng() + "\t" 
								+ membersGet.getMath() + "\t" 
								+ membersGet.getSum() + "\t" 
								+ membersGet.getAvg());
						notFound = false;
					}
				}

				if(notFound) {System.out.println("\"" + namesearch + "\" 이름을 찾지 못했습니다.");}

				break;


			case 4 :
				System.out.println("학생 정보를 삭제합니다. 학번으로 조회 합니다.");
				System.out.print(">> ");
				int idNumDel = manager.getValidNum();
				boolean notFoundIdNum = true;
				
				for(Student delMember : members) { 
					if(delMember.getIdnum() == idNumDel) {
						members.remove(delMember);
						notFoundIdNum = false;
						break;
					}
				}
				if(notFoundIdNum) {System.out.println("\"" + idNumDel + "\" 학번을 찾지 못했습니다.");}
				break;

			case 5 :
				System.out.println("학생 정보를 수정합니다. 학번으로 조회 합니다.");
				System.out.print(">> ");
				int idNumEdit = manager.getValidNum();

				System.out.println("========================================");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				break;

			case 6 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

		}
	}
}