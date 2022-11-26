package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class GuestbookDAO {
	
	public int insert(String pname, String pcontents) throws Exception {
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "gb";
		String dbPW = "gb";
		Connection con  = DriverManager.getConnection(dbURL, dbID, dbPW);
		
		String sql = "insert into guestbook (pid,pname,pcontents) values(guestbook_seq.nextval,?,?)";

		PreparedStatement pstat = con.prepareStatement(sql);

		pstat.setString(1, pname);
		pstat.setString(2, pcontents);
		
		int result = pstat.executeUpdate();
		
		con.commit();
		con.close();
		
		return result;
	}
	
	public int delete(int delPID) throws Exception {

		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "gb";
		String dbPW = "gb";

		Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);

		String sql = "delete from guestbook where pid = ?";

		PreparedStatement pstat = con.prepareStatement(sql);
		pstat.setInt(1, delPID);

		int result = pstat.executeUpdate();

		con.commit();
		con.close();

		return result;
	}

	
	public int edit(String editPNAME, String editPCONTENTS, int editPID) throws Exception {

		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "gb";
		String dbPW = "gb";

		Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);

		String sql = "update guestbook set pname = ?, pcontents = ? where pid = ?";

		PreparedStatement pstat = con.prepareStatement(sql);

		pstat.setString(1, editPNAME);
		pstat.setString(2, editPCONTENTS);
		pstat.setInt(3, editPID);

		int result = pstat.executeUpdate();

		con.commit();
		con.close();

		return result;
	}
	
	
	
}
