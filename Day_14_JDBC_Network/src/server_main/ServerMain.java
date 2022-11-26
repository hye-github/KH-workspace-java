package server_main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import server_dao.ServerDAO;
import server_dto.ServerDTO;

public class ServerMain {

	public static void main(String[] args) throws Exception {

		ServerDAO dao = ServerDAO.getInstance();
		ServerDTO dto = new ServerDTO();

		try (ServerSocket server = new ServerSocket(15000);
				Socket sock = server.accept();
				/*
				 * accept(): 연결 요청이 오면 새로운 Socket 객체 반환 새로 만들어진 Socket 객체를 통해 클라이언트와 통신
				 */
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());) {

			while (true) {

				int menu = dis.readInt();

				if (menu == 1) {

					while (true) {

						String lid = "";
						
						while(true) {
							lid = dis.readUTF();
							
							boolean lidResult = dao.isLidExist(lid);
							dos.writeBoolean(lidResult);
							dos.flush();
	
							if (!lidResult) {
								dos.writeUTF("아이디를 다시 확인해주세요.");
								dos.flush();
								continue;
							}
							break;
						}
						
						String lpw = dis.readUTF();

						boolean lLoginResult = dao.isLoginExist(lid, lpw);

						dos.writeBoolean(lLoginResult);
						dos.flush();

						if (lLoginResult) {
							dos.writeUTF("로그인에 성공했습니다.");
							dos.flush();
							break;
						} else {
							dos.writeUTF("아이디와 패스워드를 다시 확인해주세요.");
							dos.flush();
						}

					}
				} else if (menu == 2) {

					while (true) {
						
						String lid = dis.readUTF();
	
						boolean lLoginResult = dao.isLidExist(lid);
						dos.writeBoolean(lLoginResult);
						dos.flush();
	
						if (!lLoginResult) {
							String lpw = dis.readUTF();
							String luser = dis.readUTF();
	
							int result = dao.insert(new ServerDTO(0, lid, lpw, luser));
							
							dos.writeUTF("회원가입이 완료 되었습니다.");
							dos.flush();
							break;
	
	
						} else {
							dos.writeUTF("이미 회원가입된 아이디 입니다.");
							dos.flush();
						}

					}
				} else if (menu == 0) {
					dos.writeUTF("프로그램을 종료합니다.");
					dos.flush();
				} else {
					dos.writeUTF("메뉴를 다시 확인해주세요.");
					dos.flush();
				}

			}
		} catch (Exception e) {
			e.printStackTrace(); // 배포 단계에선 빼기
			System.out.println("서버와의 연결이 해제 되었습니다.");
		}
	}
}