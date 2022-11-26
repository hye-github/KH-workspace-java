
public class Tv_02 {

	private int volume; // 인스턴스가 만들어지면 만들어져있음. 인스턴스 사라지면 사라짐
	private int channel; // 설계도여서 new를 해야 tv가 만들어짐 / heap은 기본값 0.
//	private final Tv this; // -> 자기 참조 변수(Self Reference Field) 
//								this 는 값이 정해져있음. 상수값. final
//								자기 스스로를 참조하는 변수
// new를 통해 인스턴스 화 될 때 만들어지는 this. 자기 자신의 주소를 갖게됨.
	
	
	public Tv_02 getThis() { //set은 이미 final로 고정값이라 안됨.
		return this;
	}
	
// 변수 앞에 this.를 찍으면 멤버필드를 찾을 수 있다. : 순한맛 암기버전
// this.를 안찍으면 가까운 지역변수나 매개변수를 찾을 수 있다.	
// this는 멤버필드를 엑세스 할 수 있는 키워드다.
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) { //매개변수 volume는 메서드 setVolume의 소유
										// setVolume가 실행되면 매개변수 volume 만들어짐
										// setVolume가 없어지면 매개변수 volume 없어짐
		this.volume = volume;  // 자동완성에서 나오는 [this.] 암묵적 문법. 안써도 쓴 것처럼 해주는 문법. 
								// import Java.lang* (예)
								// 이름이 똑같아도 구분 짓게 만드는 기법
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}

	
	// getter / setter 자동완성기능 활용
	// 단축키 : (alt + shift + s) -> (r) -> (alt + a) -> (alt + r)
	// 정보은닉된 멤버필드는 getter / setter 를 통해 접근할 수 있다.
	
}
