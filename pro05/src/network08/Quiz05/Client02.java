package network08.Quiz05;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {

	public static void main(String[] args) {
		Socket socket=null;
		OutputStream os=null;
		BufferedOutputStream bos=null;
		Scanner sc=null;
		
		try {
			socket=new Socket("192.168.0.8", 1234);
			System.out.println("서버준비중입니다.");

			os=socket.getOutputStream();
			bos=new BufferedOutputStream(os, 512);
			sc=new Scanner(System.in);
			
			while(true) {
				String str=sc.nextLine();
				if(str.equalsIgnoreCase("Q")) break;
				for(int i=0; i<str.length(); i++) {
					int count=str.charAt(i);
					bos.write(count);
					bos.flush();
				}
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos!=null) bos.close();
				if(os!=null) os.close();
				if(sc!=null) sc.close();
				if(socket!=null) socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
