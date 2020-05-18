package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : img input/output
 */
public class ByteEx03 {

	public static void main(String[] args) {
		try {
			File infile=new File("C:\\Kitri2020\\java\\fileUpDown\\input\\펭수.jpg");
			FileInputStream fis=new FileInputStream(infile);
			
			File outFile=new File("C:\\\\Kitri2020\\\\java\\\\fileUpDown\\output\\펭수.jpg");
			FileOutputStream fos=new FileOutputStream(outFile);
			
			while(true) {
				int count=fis.read();
				if(count==-1)break;
				
				fos.write(count);
			}
			fos.flush();
			fos.close();
			fis.close();
			
			System.out.println("파일출력");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
