
public class Tv_02_Main {
public static void main(String[] args) {
	
	Tv_02 t = new Tv_02();
	
	System.out.println(t);
	System.out.println(t.getThis());

	System.out.println(t.getThis().getThis().getThis().getThis().getThis()); 
	// 디스를 연결해서 출력하는거 = 체이닝 기법 // 과정 거의 끝날 무렵 평가때문에 쓴다.
}
	
}
