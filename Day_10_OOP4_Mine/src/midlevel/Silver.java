package midlevel;

public class Silver extends Member{ // extends Member 상속 문법 // 멤버의 내용을 상속 받고, 실버의 내용까지 추가된거라서 실버가 더 큼
	//생성자는 멤버로 안옮겼다. 이름이 달라서 못옮김

	public Silver(int id, String name, int point) {

		// 3. 멤버 생성자가 필요함.
		//		super(); // 명시적 수퍼콜 (안보이면 묵시적 수퍼콜)
		super(id,name,point); // super(); 자신의 부모클래스의 생성자를 콜해주세요. 라는 뜻 
		// super에게 전달하는 식으로 해결을 본다.



		//		this.setId(id);
		//		this.setName(name);
		//		this.setPoint(point); // 2. setter 활용 // 멤버콜이 너무 여러번 일어나야해서 불편


		// this.id = id;
		// this.name = name;
		// this.point = point;
		// 낫 비저블 = 1. 접근 제한자 이슈가 생긴 것
		// 상속은 됐지만 private 때문에 자신의 클래스(멤버클래스) 안에서만 활동하기때문에 여기(실버클래스)는 외부임.
		// public으로 수정하면 되지만 정보은닉이 불가능해짐. 캡슐화가 깨짐
	}


	@Override // 이거 컨트롤 스페이스하면 추천 항목으로 뜸
	// 어노테이션이란?
	// 어노테이션은 JDK5 부터 등장하였으며, 클래스나 메서드, 변수에 @을 사용하는 것을 말합니다.
	/* 자식 클래스에 여러 개의 메서드가 정의가 되어 있을 경우
	해당 메소드가 부모 클래스에 있는 메서드를 Override 했다는 것을 
	명시적으로 선언합니다. 가령 어노테이션을 사용하지 않으면 
	자식 클래스에 여러 개의 메서드가 있을 경우, 
	어떤 메서드가 Override 되었는지 쉽게 알기 어렵습니다. 
	이 때, 오버라이드 메서드를 사용하여 명시적으로 선언하게 되면 
	많은 메서드 중에서 어떠한 메서드가 부모 클래스로부터 
	오버라이딩이 되었는지 쉽게 파악할 수 있습니다. 
	실제로 본인이 작성한 코드는 쉽게 파악이 가능하겠지만,
	다른 사람이 작성한 코드일 경우에는 알아보기가 어려울 수밖에 없습니다. */
	public double getBonus() {
		return this.getPoint() * 0.02;  // private 때문에 this.point 안됨. 
	}


}
