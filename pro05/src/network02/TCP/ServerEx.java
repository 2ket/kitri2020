package network02.TCP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		try {
			InetSocketAddress isa=new InetSocketAddress(5000);
			serverSocket=new ServerSocket();	//서버소켓 생성
			serverSocket.bind(isa);		//포트를 열고 있음
			System.out.println("서버가 연결을 기다리고 있습니다.");	//대기상태로 클라이언트 연결 기다림
			
			socket=serverSocket.accept();	//클라이언트 접속 후 연결 수락
			
			//누가 접속했는지 보려면
			InetAddress ia=socket.getInetAddress();
			String ip=ia.getHostAddress();
			System.out.println("접속 IP : "+ip);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket!=null) serverSocket.close();
				if(socket!=null) socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
