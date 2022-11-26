package kh.java.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChattingServer {
	public void chattingServer() {

		int port = 8888;
		ServerSocket serverSocket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			serverSocket = new ServerSocket(port);
			Socket clientSocket = serverSocket.accept();
			InputStream in = clientSocket.getInputStream(); // 클라이언트소켓과 연결 될 수 있도록 수정
			OutputStream out = clientSocket.getOutputStream(); // 클라이언트소켓과 연결 될 수 있도록 수정

			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);

			dos.writeUTF("[서버 연결 성공]"); // 1차
			dos.flush();
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			String now = sdf.format(date);
			dos.writeUTF("[현재시간] : " + now); // 2차
			dos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				dis.close();
				dos.close();
				serverSocket.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}

//
//
//package kh.java.exam;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class ChattingServer {
//	public void chattingServer() {
//
//		int port = 8888; // 포트 번호가 다름
//		ServerSocket serverSocket = null;
//		DataInputStream dis = null;
//		DataOutputStream dos = null;
//
//		try {
//			serverSocket = new ServerSocket(port);
//			Socket clientSocket = serverSocket.accept();
//			InputStream in = new InputStream();	// 오류
//			OutputStream out = new OutputStream();	// 오류
//			dis = new DataInputStream(in);
//			dos = new DataOutputStream(out);
//			
//			dos.writeUTF("[서버 연결 성공]"); // 1차
//
//			Date date = new Date();
//			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//			String now = sdf.format(date);
//			dos.writeUTF("[현재시간] : " + now); // 2차
//
//		} catch (IOException e) {
//			e.printStackTrace();
//
//		} finally {
//			try {
//
//				dis.close();
//				dos.close();
//				serverSocket.close();
//
//			} catch (IOException e) {
//
//				e.printStackTrace();
//
//			}
//		}
//	}
//}