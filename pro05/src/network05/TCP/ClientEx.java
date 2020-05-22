package network05.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		BufferedReader br=null;
		
		
		try {
			socket=new Socket("192.168.0.8", 6565);
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);

			br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			
			String outputMsg=null, inputMsg=null;
			
			while(true) {
				//출력
				System.out.print("YOU >> ");
				outputMsg=sc.nextLine();
				if(outputMsg.equalsIgnoreCase("Q")) {
					pw.println(outputMsg);
					pw.flush();
					break;
				}
				
				pw.println(outputMsg);
				pw.flush();
				
				//입력
				inputMsg=br.readLine();
				System.out.println("서버 >> "+inputMsg);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sc!=null) sc.close();
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				
				if(br!=null) br.close();
				if(socket!=null) socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
