package io03.Char;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 19.
 * @Description : 	BufferReader
 */
public class CharEx02 {

	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			file=new File("C:\\Kitri2020\\java\\fileUpDown\\output\\charEx01.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				System.out.println(str);
				
			}
		}catch(Throwable e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) fr.close();
				if(br!=null) br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
