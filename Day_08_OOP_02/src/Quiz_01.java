
import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {

		// 배열 10칸 짜리로 시작

		// << 학생 관리 프로그램 >>
		// 1. 신규 정보 입력
		// 2. 학생 목록 출력
		// 3. 프로그램 종료
		// 선택 >>

		// 1번 선택시
		// 학생의 이름, 국어, 영어 점수를 입력받아 Student 인스턴스로 생성 후
		// Student형 배열에 저장.

		// 2번 선택시
		// 배열에 저장 되어있는 모든 학생 정보를 이름/국어/영어/합계/평균 순으로 모두 출력
		// 배열에 한명의 정보도 저장되어 있지 않을 시, "출력할 내용이 없습니다." 라고 안내.

		Scanner sc = new Scanner(System.in);

		Student[] stud = new Student[10];

		int input = 0; // 변수명이 뭘 뜻하는지 모르게 네이밍을 지어둠. 바꾸기

		//몇번까지 입력했는지 기억하는 변수 만들기
		
		while(true) {

			System.out.println("<< 학생 관리 프로그램 >>");
			System.out.println("1. 신규 정보 입력");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택 >> ");

			try {
				int menu = Integer.parseInt(sc.nextLine());

				if(menu == 3) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				} else if(menu == 1) {

					System.out.print("이름 : ");
					String name = sc.nextLine();
					System.out.print("국어 : ");
					int kor = Integer.parseInt(sc.nextLine());
					System.out.print("영어 : ");
					int eng = Integer.parseInt(sc.nextLine());
					System.out.println("입력을 완료하였습니다.");
					stud[input++] = new Student(name, kor, eng); //대응
					
					
					
				} else if(menu == 2) {
					if(input > 0) {
						System.out.println("이름\t국어\t영어\t합계\t평균");
					} else {
						System.out.println("출력할 내용이 없습니다.");
					}
					
					for(int i = 0;i < stud.length;i++) {
						System.out.println(stud[i].getName() + "\t" + stud[i].getKor() + "\t" + stud[i].getEng() + "\t" + stud[i].getTotal() + "\t" + stud[i].getAvg());		
					}

					//	try {
					//		for(int i = 0;i < stud.length;i++) {
					//			System.out.println(stud[i].getName() + "\t" + stud[i].getKor() + "\t" + stud[i].getEng() + "\t" + stud[i].getTotal() + "\t" + stud[i].getAvg());		
					//		}
					//		continue;
					//	} catch (Exception e) { // catch (NullPointerException e)
					//		System.out.println("출력할 내용이 없습니다.");
					//		continue;
					//	}		


				} else {
					System.out.println("메뉴 선택 숫자를 옳바르게 입력해주세요.");
					continue;
				}
			} catch(Exception e) {
				System.out.println("메뉴 선택 숫자를 옳바르게 입력해주세요.");
				continue;
			}
		}



	}

}
