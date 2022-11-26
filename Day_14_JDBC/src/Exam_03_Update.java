
import java.sql.Connection;
import java.sql.DriverManager; // ctrl + shift + o = import 추가
import java.sql.Statement;

public class Exam_03_Update {


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


		String sql3 = "update cafe_menu set pprice = 5000 where pname = 'Americano'";
		int result3 = stat.executeUpdate(sql3);
		if(result3 > 0) {
			System.out.println("업데이트 성공");
		}else {
			System.out.println("업데이트 실패");
		}
		con.commit();
		con.close();

	}
}
