package midlevel;


// 클래스 간의 관계
// Has-A 포함관계		-> A Has a B
// IS-A 상속관계		-> A Is a B

public class Gold extends Member{
	
	public Gold(int id, String name, int point) {
		super(id,name,point);
	}
	
	public double getBonus() {
		return this.getPoint() * 0.03;
	}
	
}





