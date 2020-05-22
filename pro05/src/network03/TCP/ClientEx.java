package network03.TCP;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx {//OutStreamWriter, OutStream

	public static void main(String[] args) {
		Socket socket=null;
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		Scanner sc=null;
		
		
		try {
			InetSocketAddress isa=new InetSocketAddress("192.168.0.8", 5000);
			socket=new Socket();	//소켓생성
			socket.connect(isa);	//연결요청(ip, port)
			
			os=socket.getOutputStream();	//소켓을 outputStream으로 보냄	1byte
			osw=new OutputStreamWriter(os);	//1~2byte	msg.getBytes(); 문자를 바이트로 바꿔 소켓으로 던져줌
			bw=new BufferedWriter(osw, 512);	//2byte
			sc=new Scanner(System.in);
			
			System.out.println("전송할 문자 : ");
			String msg=sc.nextLine();
			bw.write(msg);
			bw.flush();
			
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sc!=null)sc.close();
				if(bw!=null) bw.close();
				if(osw!=null) osw.close();
				if(os!=null) os.close();
				if(socket!=null) socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
