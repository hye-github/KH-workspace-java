public class TEST_MAIN {
	public static void main(String[] args) throws Exception {

		
		
		TEST_DAO test_DAO = new TEST_DAO();
		
		ShopMember a = test_DAO.searchUser("id");
		
		try {
			System.out.println(a.getMemberId() + a.getMemberPw() + a.getPhone() + a.getGender());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}	
}
