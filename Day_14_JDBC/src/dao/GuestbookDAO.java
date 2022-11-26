package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import dto.GuestbookDTO;

//사용자가 입력한 값을 main(view)이 받고, main(view)이 dao(model)에게 전달, dao는 dbms에게 전달

public class GuestbookDAO {
	
	private static GuestbookDAO instance = null;
	
	public synchronized static GuestbookDAO getInstance() {
		if(instance == null) {
			instance = new GuestbookDAO();
		}
		return instance;
	}
	
	
	private BasicDataSource bds = new BasicDataSource();
	
	private GuestbookDAO() {
		this.bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		this.bds.setUsername("kh");
		this.bds.setPassword("kh");
		this.bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		this.bds.setInitialSize(30);
	}
	
	
	private Connection getConnection() throws Exception{
		return bds.getConnection();
	}
	
	
	
	
//	private Connection getConnection() throws Exception{
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e1) {
//			e1.printStackTrace();
//			System.exit(0);
//		}
//		
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String id = "kh";
//		String pw = "kh";
//		Connection con = DriverManager.getConnection(url,id,pw);
//		
//		return con;
//	}
	


	public int insert(GuestbookDTO dto) throws Exception { 

		String sql = "insert into guestbook values(guestbook_seq.nextval,?,?,default)";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){
		// PreparedStatement : 얘가 성능이 더 좋음. 안쓸 이유가 없다.

		pstat.setString(1, dto.getWriter()); // ? 에 넣을 것
		pstat.setString(2, dto.getContents()); // ? 에 넣을 것

		int result = pstat.executeUpdate();

		con.commit();

		return result; // 결과값을 메인에게 돌려보내놓고, 메인이 결과값을 알아서 사용하게 하기
		}
	}

	
	
	
	
	public int delete(int seq) throws Exception {

		String sql = "delete from guestbook where seq = ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){
			
			pstat.setInt(1, seq); // 1번 물음표에 seq 값을 넣는다.

			int result = pstat.executeUpdate();

			con.commit();

			return result;
		}
	}

	
	
	public boolean isSeqExist(int seq) throws Exception{ // try catch 여야 예외 처리이고 전가 안해도 되고, try resources
		
		String sql = "select * from guestbook where seq = ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){

			pstat.setInt(1, seq);

			try(ResultSet rs = pstat.executeQuery();){
				boolean result = rs.next();
				return result;
			}
		}
	}
	
	public boolean isWriterExist(String writer) throws Exception{

		String sql = "select * from guestbook where writer = ?";

		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){

			pstat.setString(1,writer);

			try(ResultSet rs = pstat.executeQuery();){
				boolean result = rs.next();
				return result;}
		}
	}
	
	public int update(GuestbookDTO dto) throws Exception{
		
		String sql = "update guestbook set writer=?, contents=? where seq = ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){
			
			pstat.setString(1, dto.getWriter());
			pstat.setString(2, dto.getContents());
			pstat.setInt(3, dto.getSeq());
			int result = pstat.executeUpdate();
			
			con.commit();
			
			return result;
		}
	}
	
	
	public List<GuestbookDTO> selectALL() throws Exception {
		
		String sql = "select * from guestbook order by 1";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();){
			
			List<GuestbookDTO> result = new ArrayList<>();
			
			while(rs.next()) {
				int seq = rs.getInt("seq");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				Timestamp write_date = rs.getTimestamp("write_date");
			
				GuestbookDTO dto = new GuestbookDTO(seq,writer,contents,write_date);
				
				result.add(dto);
				
			}
			
			return result;
		}

	}
	
	
	public List<GuestbookDTO> searchByWriter(String pwriter) throws Exception  {
		
		String sql = "select * from guestbook where writer like ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){
		
			pstat.setString(1, "%"+pwriter+"%");

			try(ResultSet rs = pstat.executeQuery();){

				List<GuestbookDTO> result = new ArrayList<>();

				while(rs.next()) {
					int seq = rs.getInt("seq");
					String writer = rs.getString("writer");
					String contents = rs.getString("contents");
					Timestamp write_date = rs.getTimestamp("write_date");

					GuestbookDTO dto = new GuestbookDTO(seq,writer,contents,write_date);

					result.add(dto);
				}


				return result;}
		}
	}
	
	
}