package network03.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		
		try {
			InetSocketAddress isa=new InetSocketAddress(5000);
			serverSocket=new ServerSocket();
			serverSocket.bind(isa);		//해당 포트로 서버 열어줌
			System.out.println("서버 연결됨...");
			
			socket=serverSocket.accept();	//연결 받아줌
			is=socket.getInputStream();		//소켓에서 byte 받아서 저장
			isr=new InputStreamReader(is);	//byte를 문자로 변환
			br=new BufferedReader(isr, 512);	//isr을 모아서 buffer(덩어리)로 보내줌
			
//			while(true) {
				String msg=br.readLine();
//				if(br.read()==-1) break;
				System.out.println("["+socket.getInetAddress().getHostAddress()+"]: "+msg);

//			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {	//순서대로 닫아주는게 좋다
				if(br!=null) br.close();
				if(isr!=null) isr.close();
				if(is!=null) is.close();
				if(socket!=null) socket.close();
				if(serverSocket!=null) serverSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
