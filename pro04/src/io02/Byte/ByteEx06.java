package io02.Byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 19.
 * @Description :	BufferedInputSream - 보조스트림: 일정바이트 모아서 입출력 
 */
public class ByteEx06 {
	public static void main(String[] args) {
		File inFile=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		File outFile=null;
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			inFile=new File("C:\\Kitri2020\\java\\fileUpDown\\input\\ERD설명 도형.pptx");
			fis=new FileInputStream(inFile);
			bis=new BufferedInputStream(fis, 1024);	//네트워크 통신의 경우 512byte가 최대
			
			outFile=new File("C:\\Kitri2020\\java\\fileUpDown\\output\\erd.pptx");
			fos=new FileOutputStream(outFile);
			bos=new BufferedOutputStream(fos, 1024);//Max 1024, 네트워크통신Max 512
			
			while(true) {
				int count=bis.read();
				if(count==-1) break;
				bos.write(count);
			}
			
			bos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null); fis.close();
				if(fos!=null); fos.close();
				if(bis!=null); bis.close();
				if(bos!=null); bos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		// 4byte씩 주고받는 데이터 입출력 
		// Stream-socket-network
		// 4,000 byte 넘긴다면 while로 천번 돌릴거냐구..
		// 예를들어 만바이트를 주고받는다면, 천번씩 주는걸 묶어서 보내는것. 이게 버퍼 스트림
		//bufferStream - 버퍼로 입출력 받는 것(뒤에가 문자인지 바이트인지 정해줌)
		//2byte는 read, write
		//binary input output, byte read write, buffer 
		
	}
}
