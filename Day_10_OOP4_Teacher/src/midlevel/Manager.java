package midlevel;

import java.util.ArrayList;

public class Manager {
	private ArrayList members = new ArrayList();

	public void addMember(Member m) {
		members.add(m);
	}
	public ArrayList getMembers() {
		return members;
	}
}
