package server_dto;

public class ServerDTO {

	private int seq;
	private String lid;
	private String lpw;
	private String luser;
	
	public ServerDTO(int seq, String lid, String lpw, String luser) {
		super();
		this.seq = seq;
		this.lid = lid;
		this.lpw = lpw;
		this.luser = luser;
	}
	public ServerDTO() {
		super();
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLpw() {
		return lpw;
	}
	public void setLpw(String lpw) {
		this.lpw = lpw;
	}
	public String getLuser() {
		return luser;
	}
	public void setLuser(String luser) {
		this.luser = luser;
	}
	

}