// 배포자가 원하면 코드를 공개하지않고 라이브러리처럼 컴파일해서 기계어(2진수)파일만 올릴 수 있기때문에 코드를 수정 불가능하다.
// 오픈 소스가 대중화되어서 드물긴한데 라이브러리 판매용은 소스코드공개하지않는다.

public class Monitor_02 {
	private String brand = "LG"; // new 해서 인스턴트할 때 실행 됨. = 기본값(디폴트 벨류). 그래서 값이 출력됨.
	private int price = 1000;
	private double weight = 27.5;
	
	void powerOn(){}
	void powerOff(){}
	void volumeUp(){}
	void volumeDown(){}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Monitor_02() { // 왼쪽에 작성하지않는 이유 : 생성자 메서드는 return 값을 가지지 않는다. / void 조차 표기하지않는다.
		// System.out.println("모니터 생성자 실행 됨_02");
	} // 생성자 : 인스턴스가 실행 될 때 딱 한번만 실행 됨
	// 생성자를 만들지 않아도 new를 할 수 있는 이유가 생성자가 눈에 보이지않을 뿐 존재하기 때문이다.
	// 단 하나라도 직접 만드는 순간, 있던 디폴드 생성자는 사라진다. 
	
	
	// 생성자의 보편적 모습
	public Monitor_02(String brand,int price,double weight) {
		this.brand = brand;
		this.price = price;
		this.weight = weight;
	}
	
	// 생성자 오버로딩
	public Monitor_02(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}
	
	
}