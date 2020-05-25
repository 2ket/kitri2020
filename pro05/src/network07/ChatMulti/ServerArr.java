package network07.ChatMulti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ServerArr extends Thread{
	private Socket socket;
	public static List<PrintWriter> list=Collections.synchronizedList(new ArrayList<PrintWriter>());
	//synchronizedList : 한명이 입력해서 서버가 출력해야하면 기다려야 하는것 
	//Collections.synchronizedList : Thread 동기화
	//List<PrintWriter> : 서버 하나에 여러 클라이언트를 담아서 서버가 여러 클라이언트에 동일하게 출력해야함. 소켓으로 넘어오는 데이터의 마지막 형태를 List에 담는다.
	
	private PrintWriter pw;
	
	public ServerArr(Socket socket) {	//[0] pw 홍길동 / [1] pw 김길동 / ...
		this.socket=socket;
		sendArr();
	}

	public void sendArr() {
		try {
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw=new PrintWriter(bw);
			
			list.add(pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sendPrintAll(String str) {	//전체 클라이언트에 뿌려주는 String 함수
		for(PrintWriter pw:list) {	//람다식 개선된 포문
			pw.println(str);
			pw.flush();
		}
	}
	
	@Override
	public void run() {
		BufferedReader br=null;
		String nickName=null;
		
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);
			nickName=br.readLine();
			
			sendPrintAll("#"+nickName+"님이  들어오셨습니다.");
			
			while(true) {
				String inputMsg=br.readLine();
				if(inputMsg.equalsIgnoreCase("Q")) {
					sendPrintAll("#"+nickName+"님이 채팅방을 나갔습니다.");
					list.remove(pw);	//나간사람의 list배열 삭제
					break;
				}
				sendPrintAll(nickName+">>"+inputMsg);
			}
		}catch(SocketException | NullPointerException e){
			sendPrintAll("#"+nickName+"님이 채팅방을 나갔습니다.");
			list.remove(pw);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
				if(socket!=null) socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
