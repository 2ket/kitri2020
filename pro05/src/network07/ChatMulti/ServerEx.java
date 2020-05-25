package network07.ChatMulti;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		
		try {
			serverSocket=new ServerSocket(7575);
			System.out.println("서버 챗팅 준비중...");
			
			while(true) {
				Socket socket=serverSocket.accept();
				
				ServerArr arr=new ServerArr(socket);
				arr.start();
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket!=null) serverSocket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
