import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam_04_Select {
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

		String sql = "select * from cafe_menu order by 1";
		ResultSet rs = stat.executeQuery(sql); // 한 행씩 꺼내올 수 있음

		
		
//		rs.next();
//		int pid = rs.getInt("pid"); // int pid = rs.getInt(1); 동일 표현
//		String pname = rs.getString("pname");
//		int pprice = rs.getInt("pprice");
//		System.out.println(pid + " : " + pname + " : " + pprice);
//		
//		rs.next();
//		pid = rs.getInt(1);
//		pname = rs.getString(2);
//		pprice = rs.getInt(3);
//		System.out.println(pid + " : " + pname + " : " + pprice);
//		
//		rs.next();
//		pid = rs.getInt(1);
//		pname = rs.getString(2);
//		pprice = rs.getInt(3);
//		System.out.println(pid + " : " + pname + " : " + pprice);
//		
//		rs.next(); // 4번째는 입력 안해서 error 결과 집합(RelustSet)을 모두 소모했음
//		pid = rs.getInt(1);
//		pname = rs.getString(2);
//		pprice = rs.getInt(3);
//		System.out.println(pid + " : " + pname + " : " + pprice);

		
		
		while(rs.next()) {
			int pid = rs.getInt("pid"); // int pid = rs.getInt(1); 동일 표현
			String pname = rs.getString("pname");
			int pprice = rs.getInt("pprice");
			System.out.println(pid + " : " + pname + " : " + pprice);
		}
		
		con.close(); // select 여서 commit 은 필요없지만 close 는 꼭 해주기


	}
}
