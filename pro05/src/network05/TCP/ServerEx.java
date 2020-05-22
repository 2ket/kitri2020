package network05.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		
		//입력
		BufferedReader br=null;
		
		//출력
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		
		try {
			InetSocketAddress isa=new InetSocketAddress(6565);
			serverSocket=new ServerSocket();
			serverSocket.bind(isa);
			System.out.println("서버 연결됨.....");
			
			socket=serverSocket.accept();
			String inputMsg=null, outputMsg=null;
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			while(true) {
				//입력
				inputMsg=br.readLine();
				if(inputMsg.equalsIgnoreCase("Q")) {
					System.out.println("====상대가 접속을 종료했습니다.====");
					break;
				}
				System.out.println("클라이언트 >> "+inputMsg);
				
				//출력
				System.out.print("YOU >> ");
				outputMsg=sc.nextLine();
				pw.println(outputMsg);
				pw.flush();
				
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
				
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(sc!=null) sc.close();
				if(serverSocket!=null) serverSocket.close();
				if(socket!=null) socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
