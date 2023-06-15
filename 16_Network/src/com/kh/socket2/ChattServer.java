package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {

	// 클라이언트가 보낸 메세지를 받아서 다시 클라이언트에게 받은 메세지를 보내기
	
	public static void main(String[] args) {
		
		//계속 스트림이 추가되는 것
		//+ PrintWritter 사용
		
		
		try {
			//1.서버 소켓 생성
			ServerSocket server = new ServerSocket(60000);
			System.out.println("Server Ready.......");
			
			//2. 클라이언트가 서버에 접속하면 accept로 받아서 Socket을 하나 리턴 받아야함
			Socket s = server.accept();
			System.out.println("Client Socket...Returning....");
			
			//3. 소켓으로부터 스트림 리턴
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);//<-한번 더 받아오기 위한..
			
			String line = null;
			while((line = br.readLine())!=null) {
				System.out.println("[" + s.getInetAddress() + "]가 보낸 메세지: " + line );
				pw.println(line);
			}
			
			br.close();
			
		} catch (IOException e) {
			System.out.println("Client와의 연결이 끊어졌습니다....");
		}
		
	}

}
