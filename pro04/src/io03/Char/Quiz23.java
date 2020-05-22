package io03.Char;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Quiz23 {

	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			file=new File("C:\\Kitri2020\\java\\fileUpDown\\input\\quiz23.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr, 1024);
			
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				System.out.println(str.toUpperCase());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) fr.close();
				if(br!=null) br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
/**강사님 풀이( binary stream 이용)
 * File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try{
			file=new File("C:\\Temp\\quiz\\quiz23.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis, 1024);
			
			while(true){
				int cnt=bis.read();
				if(cnt==-1) break;
				String str=String.valueOf((char) cnt);
				System.out.print(str.toUpperCase());
			}
			
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾지 못하였습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 입출력시 에러가 발생하였습니다.");
			e.printStackTrace();
		}finally{
			try{
				if(bis !=null) bis.close();
				if(fis !=null) fis.close();
			}catch(Exception e){
				System.out.println("Close Error");
				e.printStackTrace();
			}
		}
 */		
	}

}
