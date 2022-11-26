import java.util.ArrayList;
import java.util.Scanner;

public class Manager { // 설계도
	
		private ArrayList<Student> members = new ArrayList<Student>();

		public void addMember(Student m) {
			members.add(m);
		}
	
		public ArrayList<Student> getMembers() {
			return members;
		}
		
		public int getValidNum() {
			Scanner sc = new Scanner(System.in);
			while (true) {
				try {
					return Integer.parseInt(sc.nextLine());

				} catch (Exception e) {
					System.out.println("숫자를 정확히 입력해주세요.");
					System.out.print(">>> ");
				}
			}
		}
		
		public void idNumEdit(Student e) {


			boolean notFound = true;

			for(Student delMember : members) { 
				if(delMember.getIdnum() == idNumEdit) {
					System.out.println("");
					System.out.print("이름을 입력해주세요. >>> ");
					String namesearch = sc.nextLine();
					System.out.print("국어 점수를 입력해주세요. >>> ");
					int idNumDel = manager.getValidNum();
					System.out.print("영어 점수를 입력해주세요. >>> ");
					int idNumDel = manager.getValidNum();
					System.out.print("수학 점수를 입력해주세요. >>> ");
					int idNumDel = manager.getValidNum();
					
					
					notFoundIdNum = false;
					break;
				}
			}
			
			if(notFound) {System.out.println("\"" + namesearch + "\" 이름을 찾지 못했습니다.");}

	

		}
		
		
		
		
}