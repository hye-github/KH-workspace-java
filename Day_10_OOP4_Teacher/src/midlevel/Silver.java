package midlevel;

public class Silver extends Member{

	public Silver(int id, String name, int point) {
		super(id,name,point);
	}
	
	public double getBonus() {
		return this.getPoint() * 0.02;
	}
	
}
