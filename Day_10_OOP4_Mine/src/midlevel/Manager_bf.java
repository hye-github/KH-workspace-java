package midlevel;

public class Manager_bf{ // 설계도
		private Silver[] silverMembers = new Silver[10]; // 실버 인스턴스 정보를 여러개 배열하기 위해 만드는 중
		
		private Gold[] goldMembers = new Gold[10]; 
		
		private int silverIndex=0;
		private int goldIndex=0;
		
		
		public void addMember(Silver s) {
			silverMembers[this.silverIndex++] = s; // Silver형 배열에서 하나 고른거라 Silver형 배열[index]이다. this는 빼도 상관 없다.
		}

		public void addMember(Gold g) {
			goldMembers[this.goldIndex++] = g;
		}
		
		
		public Silver[] getSilverMembers() { // 배열 10개의 주소만 넘어가는거다. 배열이 넘어가는거 아니다..
			return silverMembers;
		}
		
		public Gold[] getGoldMembers() {
			return goldMembers;
		}
		
		
		public int getSilverIndex() {
			return silverIndex;
		}
		public int getGoldIndex() {
			return goldIndex;
		}
		
		
}


/*
package midlevel;

public class Manager { // 설계도
	
		private Member[] members = new Member[10];  // 멤버형 인스턴스는 만들지 않았다. 멤버형 변수를 10개 만든거다.

		
		
		
		private int index = 0;

		public void addMember(Member m) {
			members[this.index++] = m; // 매개변수가 members m 다형성을 가지고 있다. 오버로딩 필요 없다.
		}

		public Member[] getMembers() {
			return members; // 배열이 리턴되는게 아니라, 배열의 주소가 리턴 된다.
		}
		
		public int getIndex() {
			return index;
		}
		
}
*/