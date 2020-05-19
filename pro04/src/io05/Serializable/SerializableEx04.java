package io05.Serializable;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 19.
 * @Description : ObjectInputStream : 객체출력하는 스트림
 */
public class SerializableEx04 {
	public static void main(String[] args) {

		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ObjectInputStream ois=null;		//객체출력하는 스트림
		
		try {
			fis=new FileInputStream("C:\\Kitri2020\\java\\fileUpDown\\output\\b.dat");
			bis=new BufferedInputStream(fis, 1024);
			ois=new ObjectInputStream(bis);
			
			Test test=null;
			
			while(true) {
				test=(Test)ois.readObject();
				if(test==null) break;
				System.out.println(test.toString());
			}

		}catch(EOFException e){//파일의 내용을 더이상 읽어 올 것이 없으면 끝에 도달했을때 EOFExeption을 던져준다고 합니다..
//			e.printStackTrace();
			System.out.println("다 읽었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
				if(bis!=null) bis.close();
				if(ois!=null) ois.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
