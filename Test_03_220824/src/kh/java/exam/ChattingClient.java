package kh.java.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ChattingClient {
	public void chattingClient() {

		String serverIp = "127.0.0.1";
		int serverPort = 8888; // 포트 번호 수정
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			socket = new Socket(serverIp, serverPort);
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);

			String serverMsg = dis.readUTF(); // 1차
			System.out.println(serverMsg);

			String serverMsgNow = dis.readUTF(); // 2차가 필요
			System.out.println(serverMsgNow);

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				dis.close();
				dos.close();
				socket.close(); // 소켓 클로즈 추가

			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}
}

//
//package kh.java.exam;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.Socket;
//
//public class ChattingClient {
//	public void chattingClient() {
//		
//		String serverIp = "127.0.0.1";
//		int serverPort = 9999;
//		Socket socket = null;
//		DataInputStream dis = null;
//		DataOutputStream dos = null;
//
//		try {
//			socket = new Socket(serverIp, serverPort);
//			InputStream in = socket.getInputStream();
//			OutputStream out = socket.getOutputStream();
//			dis = new DataInputStream(in);
//			dos = new DataOutputStream(out);
//			
//			String serverMsg = dis.readUTF(); // 1차
//			System.out.println(serverMsg);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//
//		} finally {
//			try {
//				dis.close();
//				dos.close();
//
//			} catch (IOException e) {
//				e.printStackTrace();
//
//			}
//		}
//	}
//}