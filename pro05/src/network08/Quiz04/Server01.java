package network08.Quiz04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server01 {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		BufferedReader br=null;
		try {
			serverSocket=new ServerSocket(7575);
			System.out.println("서버 준비 중입니다.");
			socket=serverSocket.accept();
			
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			while(true) {
				String inputMsg=br.readLine();
				if(inputMsg.equalsIgnoreCase("Q")) {
					System.out.println("채팅을 종료합니다.");
					break;
				}
				System.out.println("전송받은 메시지 : "+inputMsg+"\t/"+socket.getInetAddress().getHostAddress());
			}
		} catch(NullPointerException e) {
			System.out.println("채팅을 종료합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(socket!=null) socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
