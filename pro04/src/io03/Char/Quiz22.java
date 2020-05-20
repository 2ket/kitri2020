package io03.Char;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Quiz22 {

	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			file=new File("C:\\Kitri2020\\java\\fileUpDown\\input\\quiz22.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			int i=0;
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				i++;
				System.out.println(i+"\t"+str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) fr.close();
				if(br!=null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
