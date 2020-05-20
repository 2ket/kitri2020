package io02.Byte;

import java.io.FileInputStream;
import java.io.IOException;

public class Quiz16 {

	public static void main(String[] args){
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Kitri2020\\java\\fileUpDown\\input\\test.txt");
			int count;
			while((count=fis.read())!=-1) {
				System.out.println((char) count);
			}
		}catch(IOException e) {}
	}

}
