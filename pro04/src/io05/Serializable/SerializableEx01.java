package io05.Serializable;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializableEx01 {
	public static void main(String[] args) {
		Date date=new Date();
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("C:\\Kitri2020\\java\\fileUpDown\\output\\a.dat");
			bos=new BufferedOutputStream(fos, 1024);
			oos=new ObjectOutputStream(bos);
			
			oos.writeObject(date);	//직렬화. 객체를 파일로 출력
			oos.flush();
			
			System.out.println("출력완료");
			while(true) {
				
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) fos.close();
				if(bos!=null) bos.close();
				if(oos!=null) oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
