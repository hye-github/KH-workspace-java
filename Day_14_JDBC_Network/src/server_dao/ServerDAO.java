package server_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import server_dto.ServerDTO;

public class ServerDAO {

	private static ServerDAO instance = null;

	public synchronized static ServerDAO getInstance() {
		if(instance == null) {
			instance = new ServerDAO();
		}
		return instance;
	}


	private BasicDataSource bds = new BasicDataSource();

	private ServerDAO() {
		this.bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		this.bds.setUsername("kh");
		this.bds.setPassword("kh");
		this.bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		this.bds.setInitialSize(30);
	}


	private Connection getConnection() throws Exception{
		return bds.getConnection();
	}


	
	
	public int insert(ServerDTO dto) throws Exception { 

		String sql = "insert into login_main values(login_seq.nextval,?,?,?)";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){
		// PreparedStatement : 얘가 성능이 더 좋음. 안쓸 이유가 없다.

		pstat.setString(1, dto.getLid()); // ? 에 넣을 것 lid
		pstat.setString(2, dto.getLpw()); // ? 에 넣을 것 lpw
		pstat.setString(3, dto.getLuser()); // ? 에 넣을 것 luser

		int result = pstat.executeUpdate();

		con.commit();

		return result; // 결과값을 메인에게 돌려보내놓고, 메인이 결과값을 알아서 사용하게 하기
		}
	}
	
	
	
	public boolean isLidExist(String lid) throws Exception{ // try catch 여야 예외 처리이고 전가 안해도 되고, try resources
		
		String sql = "select lid from login_main where lid = ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){

			pstat.setString(1, lid);

			try(ResultSet rs = pstat.executeQuery();){
				boolean result = rs.next();
				return result;
			}
		}
	}
	
	
	
	public boolean isLoginExist(String lid, String lpw) throws Exception{ // try catch 여야 예외 처리이고 전가 안해도 되고, try resources
		
		String sql = "select lseq from login_main where lid = ? and lpw = ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){

			pstat.setString(1, lid);
			pstat.setString(2, lpw);

			try(ResultSet rs = pstat.executeQuery();){
				boolean result = rs.next();
				return result;
			}
		}
	}
	
	
	
	
	
	
}
