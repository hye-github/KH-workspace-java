package midlevel;

import java.util.ArrayList;

public class Manager { // 설계도
	
		private ArrayList<Member> members = new ArrayList<Member>(); // import 해야함

		public void addMember(Member m) {
			members.add(m);
		}
		
		public ArrayList<Member> getMembers() { // 제너릭(<Member>)은 자료형(ArrayList)이 사용되는 곳에 모두 넣어야함
			return members;
		}
		
}
