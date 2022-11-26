import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TEST_DAO {
	


public ShopMember searchUser(String memberId) throws Exception {
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	ShopMember shopMember = null;
	
	shopMember = new ShopMember(); // 인스턴스 생성
	
	String query = "SELECT * FROM SHOP_MEMBER WHERE MEMBER_ID = '" + memberId + "'"; // 쿼리문 정상 작동할 수 있도록 추가
	
	//	String query = "SELECT * FROM SHOP_MEMBER WHERE MEMBER_ID =" + memberId;

	try {
		
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test_01", "T3sxl!&00");
		stmt = conn.createStatement();
		rset = stmt.executeQuery(query);

		
		if(rset.next()) {
			shopMember.setMemberId(rset.getString("MEMBER_ID"));
			shopMember.setMemberPw(rset.getString("MEMBER_PW"));
			shopMember.setPhone(rset.getString("PHONE"));
			shopMember.setGender(rset.getString("GENDER").charAt(0)); // 오브젝트로 받아서 char로 캐스팅 (char)rset.getObject("GENDER")
			//			shopMember.setGender(rset.getString("GENDER").charAT(0));
		}
		

	} catch (SQLException e) {
		e.printStackTrace();

	} finally {
		rset.close();
		stmt.close();
		conn.close();
	}

	return shopMember;
}


}