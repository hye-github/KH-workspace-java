import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

public class CafeMenuDAO {
//데이터 접근 오브젝트 DAO	
	
	
	
//	private Connection getConnection() throws Exception{
//		
//		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
//		String dbID = "kh";
//		String dbPW = "kh";
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			
//		} catch (ClassNotFoundException e1) {
//			e1.printStackTrace();
//			System.exit(0);
//		}
//		
//		Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
//		return con;
//		
//	}

	
	
	// 1. 왜 싱글턴을 써야하는가 ? // 싱글턴 패턴에 대해 이유 면접에 자주 나옴. 자원의 낭비를 줄이기 위해서. 현재는 DBCP 하는데 커넥션 오버플로우 되지말라고 사용 중.
	
//	dao의 멤버필드가  ( private BasicDataSource bds = new BasicDataSource(); )
//	private CafeMenuDAO() {	// 딱 한 번만 실행되는 생성자에 저장.
//	this.bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
//	this.bds.setUsername("kh");
//	this.bds.setPassword("kh");
//	this.bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//	this.bds.setInitialSize(30);
//	} 이거를 함으로써 new 할 때마다 멤버필드가 개수도 똑같이 증가
//	그런데 거기에서 * 30개씩 커넥션이 더 증가됨
	
	
	// 2. 왜 스태틱을 써야하는가 ?
	
//	인스턴스 멤버 메서드
//	static 붙으면 클래스 멤버 메서드
	
	
	
	private static CafeMenuDAO instance = null;
	public synchronized static CafeMenuDAO getInstance() { // 인스턴스 하고 부르게 위해. new 없이도 
		if(instance == null) {
			instance = new CafeMenuDAO(); // 쓰레드 세이프. 싱글턴 패턴의 업그레이드 버전(synchronized : 한번에 한번씩만 실행되어서 통제하는 문법)
		}
		return instance;
	} // 가장 심플한 형태의 싱글턴 패턴
	
	
	
	 //dbcp 외장 라이브러리 인스턴스
	private BasicDataSource bds = new BasicDataSource(); // 내장 아니고 외부 라이브러리 maven repository 검색 > Apache Commons DBCP
	// 안에서는 사용하게 기능을 구성 (2)
	
	private CafeMenuDAO() {	// 딱 한 번만 실행되는 생성자에 저장. 접근제한을 걸어버려서 못하게 만듬. (1)
		this.bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		this.bds.setUsername("kh");
		this.bds.setPassword("kh");
		this.bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		this.bds.setInitialSize(30);
	}
	
	private Connection getConnection() throws Exception{
		
//		this.bds = new BasicDataSource(); // 얘가 DBCP. 여기에 넣으면 한번에 30개씩 만들어짐

		return bds.getConnection(); // DriverManager.getConnection(dbURL, dbID, dbPW); 랑 비슷한 기능
		
	}
	
	
	
	
	
	
	
	public int insert(CafeMenuDTO dto) throws Exception {
		// main 에서는 throws Exception 하면 안된다. 최후의 보루. 반드시 try catch를 해야한다.
		// 여기서 try catch 를 하게 되면 DAO에서 UI가 추가되어 기능성이 떨어진다.
		
		String sql = 
				"insert into cafe_menu values(cafe_menu_seq.nextval,?,?,?)";

		try(Connection con = this.getConnection(); // this.안해도 됨
			PreparedStatement pstat = con.prepareStatement(sql); // 얘도 반복되긴하지만 sql이 바뀌고, return 값은 한번에 하나 밖에 못받기때문에 깔끔하게 connection만 빼냈다.
			){
			pstat.setString(1,dto.getPname());
			pstat.setInt(2, dto.getPprice());
			pstat.setString(3, dto.getIced());

			int result = pstat.executeUpdate();

			con.commit();

			return result;
		}
	} 
	
	
	public int delete(int delPID) throws Exception {

		String sql = "delete from cafe_menu where pid = ?";

		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){

			pstat.setInt(1,delPID);

			int result = pstat.executeUpdate();

			con.commit();

			return result;
		}
	}
	
	
	public int update(CafeMenuDTO dto) throws Exception {

		String sql = "Update cafe_menu set pname = ?, pprice = ?, iced = ? where pid = ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){
		
		pstat.setString(1, dto.getPname());
		pstat.setInt(2, dto.getPprice());
		pstat.setString(3, dto.getIced());
		pstat.setInt(4, dto.getPid());
		
		int result = pstat.executeUpdate();
	
		con.commit();
		
		return result;
		}
	}
	
	public List<CafeMenuDTO> selectALL() throws Exception { // <CafeMenuDTO> : 제너릭
	
		String sql = "select * from cafe_menu order by 1";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery(); // ResultSet이 데이터의 위치를 알고있다.
			) { // close(); 할 것들은 무조건 () 안에 넣어주자.
			
	//		2. close 하기 전에 데이터를 다 모아놓고, 그걸 return 을 하자.
	//			collection-arraylist
			
			List<CafeMenuDTO> result = new ArrayList<>(); // 동일한 타입을 가지고 있는 변수들의 집합. 내부적으로는 배열
			// 서로 다른 타입으로 저장해야할 때, 오브젝트 다형성 배열
			// 다운캐스팅을 매번해서 써야하기때문에 다형성이 무작정 좋진않다.
			// 모든 데이터를 저장할 수 있으나, 가져다 쓸 때 매우 불편하다.
			// 세가지 타입을 모아 만든 DTO 타입으로 만들면 된다.
			
	
			while(rs.next()) { // 한 행을 만들어둔게 DTO
				int pid = rs.getInt("pid"); 
				String pname = rs.getString("pname");
				int pprice = rs.getInt("pprice");
				String iced = rs.getString("iced");
				
				CafeMenuDTO dto = new CafeMenuDTO(pid,pname,pprice,iced); // 얘도 지역변수. while 끝나면 없어짐
				result.add(dto);
	
			}
			
			
//			con.close(); // 예외가 발생되어서 튕기더라도 반드시 실행 될 수 있도록 해야한다. TRY RESOURCE
			// TRY RESOURCE 덕분에 close(); 없어도 됨. 알아서 닫아줌.
			
			return result;
			
	//		1. return rs; // 타입도 ResultSet : 논리적으로는 문제가 없지만, ResultSet은 데이터를 다 보여주는게 아니라 위치만 알고 있는 것이고, 
	//																	Connection을 통해서 전달되는 것이고, close를 하고 return 을 하게 되는데 커넥션이 끊겨서 
	//																	ResultSet 을 사용할 수가 없다.  close 되기 전까지만 동작이 가능하다.
		}
	
	}
	
}
