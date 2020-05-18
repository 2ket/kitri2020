package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : FileInputStream
 */
public class ByteEx02 {

	public static void main(String[] args) {
		try {
			File file=new File("C:\\\\Kitri2020\\\\java\\\\fileUpDown\\\\ex01.txt");
			FileInputStream fis=new FileInputStream(file);
			
			byte[] data=new byte[65536];
			int count=fis.read(data);
			
			for(int i=0; i<count; i++) {
				System.out.println((char)data[i]);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
