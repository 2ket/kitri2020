package network06.Chat;

import java.net.Socket;

public class ClientEx { 

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("닉네임을 하나만 입력하세요. ");
			return;
		}
		
		try {
			String nickName=args[0];
			Socket socket=new Socket("192.168.0.8", 8989);
			
			ClientSender sender=new ClientSender(socket, nickName);
			sender.start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
