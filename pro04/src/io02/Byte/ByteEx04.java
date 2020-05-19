package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteEx04 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			File infile=new File("C:\\Kitri2020\\java\\fileUpDown\\input\\펭수.jpg");
			fis=new FileInputStream(infile);
			File outFile=new File("C:\\\\Kitri2020\\\\java\\\\fileUpDown\\output\\펭수.jpg");
			fos=new FileOutputStream(outFile);
			while(true) {
				int count=fis.read();
				if(count==-1)break;
				
				fos.write(count);
			}
			fos.flush();
			
			System.out.println("파일출력");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
