package network08.Quiz04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client01 {

	public static void main(String[] args) {
		Socket socket=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		try {
			socket=new Socket("192.168.0.8", 7575);
			
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			while(true) {
				System.out.print("전송할 메시지는 : ");
				String outputMsg=sc.nextLine();
				if(outputMsg.equalsIgnoreCase("Q")) {
					pw.println(outputMsg);
					pw.flush();
					System.out.println("챗팅을 종료합니다.");
					break;
				}
				pw.println(outputMsg);
				pw.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(sc!=null) sc.close();
				if(socket!=null) socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
