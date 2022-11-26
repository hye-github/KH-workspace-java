//<< 인증 시스템 실습 >>
//조건 1. 모든 UI관련 코드는 클라이언트 프로그램에서 작성하세요. (메뉴, 안내메세지 등...)
//조건 2. 서버 측 코드는 Control 클래스(통신담당) / DAO 클래스 / DTO 클래스를 사용하세요.
//조건 3. 모든 DB 통신은 DBCP를 사용해야합니다.
//조건 4. SQL Injection으로부터 안전해야 합니다.
//조건 5. 모든 자원은 항상 잊지 말고 반환하세요.
//조건 6. DAO 생성은 싱글턴을 적용해주세요.
//조건 7. 기능은 로그인 / 회원가입을 제작하시되 두 분이 기능을 하나씩 나누어 만들어주세요.

package client_main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.Scanner;

import javax.swing.JOptionPane;

import server_dao.ServerDAO;
import server_dto.ServerDTO;

public class ClientMain {

	public static String getSHA256(String input) {

		String toReturn = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.reset();
			digest.update(input.getBytes("utf8"));
			toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toReturn;
	}

	public static void main(String[] args) throws Exception {

		ServerDAO dao = ServerDAO.getInstance();

		Scanner sc = new Scanner(System.in);

		try (Socket socket = new Socket("localhost", 15000); // 통신을 위해서 사용이 필요한 논리적인 단말기로 생각하면 됩니다.
				DataInputStream dis = new DataInputStream(socket.getInputStream()); // 출력
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); // 입력
		) {

			while (true) {
				System.out.println("<< 인증 시스템 >>");
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
				System.out.println("0. 종료");
				System.out.print(">> ");

				int menu = Integer.parseInt(sc.nextLine());
				dos.writeInt(menu);
				dos.flush();

				if (menu == 1) {

					while (true) {
						
						while(true) {
							System.out.print("Id : ");
							String lid = sc.nextLine();
							dos.writeUTF(lid);
							dos.flush();
							
							if (!dis.readBoolean()) {
								System.out.println(dis.readUTF());
								continue;
							}
							break;
						}
						
						System.out.print("Pw : ");
						String lpw = sc.nextLine();
						dos.writeUTF(lpw);
						dos.flush();

						if (dis.readBoolean()) {
							System.out.println(dis.readUTF());
							break;

						} else {
							System.out.println(dis.readUTF());
						}
					}

				} else if (menu == 2) {

					while (true) {
						System.out.print("ID : ");
						String lid = sc.nextLine();
						dos.writeUTF(lid);
						dos.flush();

						if (!dis.readBoolean()) {

							System.out.print("PASSWORD : ");
							String lpw = sc.nextLine();

							System.out.print("USER NAME : ");
							String luser = sc.nextLine();

							dos.writeUTF(lpw);
							dos.writeUTF(luser);
							dos.flush();

							System.out.println(dis.readUTF());
							break;

						} else {
							System.out.println(dis.readUTF());
						}
					}

				} else if (menu == 0) {
					System.out.println(dis.readUTF());
					System.exit(0);
				} else {
					System.out.println(dis.readUTF());
				}

			}

		} catch (Exception e) {
			e.printStackTrace(); // 배포 단계에선 빼기
			System.out.println("클라이언트 서버와의 연결이 해제 되었습니다.");
		}

	}
}
