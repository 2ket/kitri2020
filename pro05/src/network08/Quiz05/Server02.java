package network08.Quiz05;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		InputStream is=null;
		BufferedInputStream bis=null;
		
		try {
			serverSocket=new ServerSocket(1234);
			System.out.println("서버준비중입니다.");
			socket=serverSocket.accept();
			is=socket.getInputStream();
			bis=new BufferedInputStream(is, 512);

			
			int count;
			while(true) {
				count=bis.read();
				if(count==-1) break;
				System.out.print((char)count);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
