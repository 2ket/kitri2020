package network06.Chat;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		
		try {
			serverSocket=new ServerSocket(8989);
			System.out.println("서버 챗팅 준비중...");
			
			Socket socket=serverSocket.accept();
			
			ServerReceiver receiver=new ServerReceiver(socket);
			receiver.start();
			
			ServerSender sender=new ServerSender(socket);
			sender.start();
			
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
