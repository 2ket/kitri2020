package io02.Byte;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteEx05 {

	public static void main(String[] args) {
		
		File file=null;
		FileOutputStream fos=null;

		FileInputStream fis=null;
		
		try {
			
			//파일 출력
			file=new File("C:\\Kitri2020\\java\\fileUpDown\\output\\Ex05.text");
			fos=new FileOutputStream(file);
			
			
			
			// byte 자료형 입출력, 이미지(엑셀, 파워포인트 등등) 입출력, 문자 입출력
			String str="안녕하세요";	//문자 //String은 전달x, byte로 변환해야함
			byte[] data=str.getBytes();//바이트로 바꿔서 출력
			fos.write(data);
			fos.flush();

			//파일 입력
			fis=new FileInputStream(file);
			byte[] msg=new byte[65536];	//byte의 최대치
			int count=fis.read(msg);	//바이트 읽기
			
			String inStr=new String(msg, 0, count);	//문자로 바꾼다.
			System.out.println(inStr);

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) fos.close();
				if(fis!=null) fis.close();
			}catch(IOException e) {e.printStackTrace();}
		}
		
	}

}
