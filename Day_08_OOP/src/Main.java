/*
객체지향 기반 코드 작성법


Step1. 개발 대상 선정
Step2. 대상을 기능과 속성으로 분석(객체지향적 분석) - 설계도 작성
객체지향이론 : 세상 어떤 것도 만들어낼 수 있다. 기능, 속성만 있다면.
 - 속성 : 개발 대상이 가지고 있는 정보값
 - 기능 : 개발 대상이 수행할 수 있는 능력 : 메서드
Step3. 분석된 내용을 바탕으로 설계도 작성
100개를 만들면 99개는 설계도, 1개는 main을 포함한 class가 만들어짐


	참조자료형 // 참조자료형은 무한대(기본자료형 외의 전부가 참조자료형)인 이유 : 내가 만들 수 있으니까
	class Monitor { // 클래스의 첫글자는 대문자 무조건
		String brand; //변수명의 첫글자는 대문자 안됨
		int price;
		double weight;
	
		void powerOn(){}
		void powerOff(){}
		void volumeUp(){}
		void volumeDown(){}
	}


기본자료형은 고정적 스택메모리
참조자료형은 가변적 힙메모리
new를 쓰면 힙메모리를 쓰겠다는 것

 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Monitor mon; // 대상이 저장될 주소를 만든 것(변수) / 
//		
//		int[] arr; // 배열이 저장될 변수를 만든 것
//		int[] arr = new arr[] {}  // 이게 배열을 만든 것
		
		
		
		
//		Monitor mon = new Monitor(); // 램이라는 세상 속에 실체(모니터)가 만들어진 것
		// 실체 = 객체, 인스턴스
		

//		Monitor mon; // 스택메모리 / 주소를 저장하는 4바이트 변수 = Monitor
//		new Monitor(); // 힙메모리 / new 역할 2개 : 힙메모리에 만드는거 하나, 주소를 반환하는거 하나

		
		Monitor mon = new Monitor(); // class는 같은 프로젝트 내에 있는 것만 사용이 가능하다.
		
//		mon. // . 앞에 있는 mon이라는 주소로 찾아가세요.
		//. 이 참조 연산자 // 그 주소로 찾아가세요.

		// 다운받아서 new  .  을 사용해서 활용가능
		
		
		Scanner sc = new Scanner(System.in);
		// 스캐너라는 기능이 필요하다면 sc. 해서 불러오기
		
		
		Tv tv = new Tv();
		// Tv 인스턴스의 주소를 알고 있는게 tv 변수
		tv.volume = 20; //  .을 찍고 보면 channel; 는 보이지않는다.
//		tv.channel = -500; // 티비 인스턴스 채널에 있는 변수에 -500을 넣어라 // 사용이 되지않는다.
		// 접근제한자
		
		tv.setVolume(20);
		
		
		
		
		
		
		// 클래스 내에 필드는 프라이빗으로 가려놓고 메서드로 통제하는 편
		
		
		
		
		
	}
}
