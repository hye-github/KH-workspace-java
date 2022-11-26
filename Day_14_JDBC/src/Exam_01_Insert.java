import java.sql.Connection;
import java.sql.DriverManager; // ctrl + shift + o = import 추가
import java.sql.Statement;

public class Exam_01_Insert {
	public static void main(String[] args) throws Exception{
		// JDBC
		// Java DataVase Connectivity
		// 자바 프로그램을 통해서 DBMS를 사용하는 문법
			
		// Step 1. DBMS 라이브러리 등록하기
		Class.forName("oracle.jdbc.driver.OracleDriver"); // DBMS에 등록하는 설정 // 인스턴스 생성방식
		
		// Step 2. DBMS에 접속하기
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "kh";
		String dbPW = "kh";
		Connection con = DriverManager.getConnection(dbURL,dbID,dbPW); // 대문자 = 클래스 , . 찍은거 스태틱 메서드
		
		// Step 3. Query 전달 인스턴스 생성
		Statement stat = con.createStatement();
		
		String sql  =  
				"insert into cafe_menu values(cafe_menu_seq.nextval,'Americano',2000,'Y')";
		
		int result = stat.executeUpdate(sql); // .executeQuery : select 할 때(결과 ResultSet가 반환)만 쓰고 나머지는 전부 Update(int 숫자가 반환)
		
		// Step 4. Query 실행 결과 확인
		if(result > 0) {
			System.out.println("입력 성공");
		}else {
			System.out.println("입력 실패");
		}
		
		// Step 5. 마무리 작업(commit)
		con.commit();
		con.close(); // 안하면 문제점 : 계속 접속하고 있기때문에 다른 사람들은 접속이 안됨

	}
}
