/* http://www.sauronsoftware.it/projects/ftp4j/manual.php#14 */

import java.io.File;
import java.util.Scanner;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPFile;

public class Main2 {

	private static int getValidNum() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());

			} catch (Exception e) {
				System.out.println("숫자를 정확히 입력해주세요.");
				System.out.print(">>> ");
			}
		}
	}

	public static void main(String[] args) throws Exception {

		FTPClient client = new FTPClient();
		Scanner sc = new Scanner(System.in);

		mainlist: while (true) {
			System.out.println("=== FTP Client Program ===");
			System.out.println("1. Connect FTP Server");
			System.out.println("2. Exit Program");
			System.out.print(">>> ");
			int menu = getValidNum();

			switch (menu) {
			case 1:
				while (true) {
					System.out.println("input url");
					System.out.print(">>> ");
					String url = sc.nextLine();
					System.out.println("input port");
					System.out.print(">>> ");
					int port = getValidNum();
					try {
						client.connect(url, port);
						System.out.println("FTP Server is connecrted");
						break;

					} catch (Exception e) {
						System.out.println("정확히 입력해주세요.");
					}
				}

				while (true) {
					System.out.print("input id : ");
					String id = sc.nextLine();
					System.out.print("input password : ");
					String password = sc.nextLine();

					try {
						client.login(id, password);
						System.out.println("Login Success!");
						break;

					} catch (Exception e) {
						System.out.println("정확히 입력해주세요.");
					}
				}

				while (true) {
					System.out.println("===================");
					System.out.println("1. Upload File");
					System.out.println("2. Download File");
					System.out.println("3. Disconnect FTP Sever");
					System.out.println("4. Delete File");
					System.out.print(">>> ");
					int menu2nd = getValidNum();

					FTPFile[] list = client.list();
					
					switch (menu2nd) {
					case 1:
						System.out.println("=== Upload File ===");

						while (true) {
							System.out.println("업로드할 파일 루트를 입력해주세요.");
							System.out.print(">>> ");
							String uploadFile = sc.nextLine();

							try {
								client.upload(new java.io.File(uploadFile));
								System.out.println("업로드가 완료 되었습니다.");
								break;

							} catch (Exception e) {
								System.out.println("정확히 입력해주세요.");
							}
						}
						break;

					case 2:
						System.out.println("=== File List ===");
						System.out.println("다음 목록 중에 고르세요.");
						for (int i = 0; i < list.length; i++) {
							System.out.println(list[i]);
						}

						while (true) {
							System.out.println("목록에서 저장할 파일 이름을 입력해주세요.");
							System.out.print(">>> ");
							String downName = sc.nextLine();
							System.out.println("저장될 루트를 입력해주세요.");
							System.out.print(">>> ");
							String localFile = sc.nextLine();

							try {
								client.download(downName, new java.io.File(localFile));
								System.out.println("다운로드가 완료 되었습니다.");
								break;

							} catch (Exception e) {
								System.out.println("정확히 입력해주세요.");
							}
						}
						break;

					case 3:
						System.out.println("서버와의 연결이 끊어졌습니다.\r\n");
						client.disconnect(true);
						continue mainlist;

					case 4:
						System.out.println("=== File List ===");
						System.out.println("다음 목록 중에 고르세요.");
						for (int i = 0; i < list.length; i++) {
							System.out.println(list[i]);
						}

						while (true) {
							System.out.println("목록에서 삭제할 파일 이름을 입력해주세요.");
							System.out.print(">>> ");
							String delete = sc.nextLine();

							try {
								client.deleteFile(delete);
								System.out.println("파일 삭제가 완료 되었습니다.");
								break;

							} catch (Exception e) {
								System.out.println("정확히 입력해주세요.");
							}
						}
						break;
					}
				}

			case 2:
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0);

			default:
				System.out.println("메뉴 숫자를 정확히 입력해주세요.");
			}
		}
	}
}
