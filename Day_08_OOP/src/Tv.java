
public class Tv {

	public int volume; // 공공의/ 멤버필드 볼륨은 공공으로 써. 선언
	private int channel; // 사적인/ 멤버필드 채널은 내꺼야. 아무도 건드릴 수 없어. 선언
	// Tv 중괄호 안에서만 channel을 건드릴 수 있다. 클래스 내부에서만 사용할 수 있다.
	// 멤버필드에는 private 무조건 붙인다고 생각하자. * 위에 볼륨은 예시로 퍼블릭 냅둠.

	void channerlUp() {
		channel = 20;
	}

	public void channelDown() {
		if(channel > 0) {
			channel--;			// 제약사항 구성
		}
	}

	public void setVolume(int vol) { // 이름 짓는거 : 글로벌 컨벤션
		volume = vol;	
	}

	// 밖에서 값을 가져와라 = set
	// 밖에서 값을 받아줄 매개변수가 필요
	// 밖에서 오는 자료형은 인트
	// 값을 가져와서 멤버필트에 저장

	
	public int getVolume() { // 외부에서 값 받아올께 없음(매개변수 없음). 내부 값만 내보내면 됨(리턴). 
		return volume;	
	}  // void > int(리턴값이 있고, volume의 자료형은 인트)
	
	
	// 메서드 네임 마음대로 하지말아라. set / get 필드명을 그대로 붙여서 지어라. 쎄터메서드들 게터메서드들 
	// 리턴값을 가지지않아서 void

	//	2가지 필요
	//	값을 집어넣는 메서드 하나, 값을 꺼내가는 메서드 하나
	
	

	public void setChannel(int cha) {
		channel = cha;
	}
		
	public int getChannel() {
		return channel;
	}
		
	
	// 정보은닉
	// public / protected / package / private - ( 접근제한자 )
	// : 필드나 메서드 앞에 붙이는 키워드 / 붙일 때 어떠한 현상이 일어남
	//	프라이빗 : 건드리면 안되거나, 건드릴 필요가 없는 것들
	
	
}
