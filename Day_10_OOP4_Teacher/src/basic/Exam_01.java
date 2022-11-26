package basic;

public class Exam_01 {
	
	// Static 
	// 장점 : Scope 이슈에서 자유롭다. ( 언제 어디서나 즉각 사용 가능 ) 
	// 단점 : 1. 메모리 효율성이 매우 떨어짐
	//       2. 동시성 이슈를 가짐
	//		 3. 
	
	public static void main(String[] args) {
		
		Temp.b = 10;
		
		Temp t1 = new Temp();
		System.out.println(t1.b);
		
		t1.b = 20;
		
		Temp t2 = new Temp();
		System.out.println(t2.b);
		t2.b = 100;
		
		System.out.println(t1.b);
	}
}
