package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description :  파일 입출력 : 그림, 멀티미디어, 문자 종류의 데이터를 보낼 수 있다.
 * 							 바이트기반, 문자기반 스트림으로 바눈다.
 * 							바이트 기반 : 그림, 멀티미디어, 문자의 모든 종류 데이터를 보내고 받을 수 있다.
 */
public class ByteEx01 {

	public static void main(String[] args) {
		byte[] data=new byte[] {'a', 'p', 'p', 'l', 'e'};
		
		try {
			File file=new File("C:\\Kitri2020\\java\\fileUpDown\\ex01.txt");
			FileOutputStream fos=new FileOutputStream(file);
			
			for(int i=0; i<data.length; i++) {
				fos.write(data[i]);
			}
			fos.flush();	//비워줘야 ex01.txt로 데이터가 넘어감
			fos.close();	//시스템 자원 반납하고 출력스트림 닫는다. (close 안할경우 데이터손실)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
