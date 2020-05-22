package network04.TCP;


import java.net.Socket;
import java.net.UnknownHostException;
import java.net.InetSocketAddress;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class ClientEx {

	public static void main(String[] args) {
		Socket socket=null;
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		BufferedReader br=null;
		
		try {
			//연결
			InetSocketAddress isa=new InetSocketAddress("192.168.0.8", 7878);
			socket=new Socket();
			socket.connect(isa);
			
			//출력
			os=socket.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw, 512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			System.out.print("전송할 문자 : ");
			String msg=sc.nextLine();
			pw.println(msg);
			pw.flush();
			
			//입력
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			String reply=br.readLine();
			System.out.println("서버가 보내준 답변: "+reply);
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sc!=null) sc.close();
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(osw!=null) osw.close();
				if(os!=null) os.close();
				
				if(br!=null) br.close();
				if(socket!=null) socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
