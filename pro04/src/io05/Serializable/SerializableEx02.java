
package io05.Serializable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class SerializableEx02 {
	public static void main(String[] args) {

		
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("C:\\Kitri2020\\java\\fileUpDown\\output\\a.dat");
			bis=new BufferedInputStream(fis, 1024);
			ois=new ObjectInputStream(bis);
			
			
			Date date=(Date)ois.readObject();
			System.out.println(date);
			while(true) {
			}

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
