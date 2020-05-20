package io03.Char;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		Scanner sc=null;
		
		try {
			file=new File("C:\\Kitri2020\\java\\fileUpDown\\input\\quiz22.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			sc=new Scanner(System.in);
			System.out.print("문자를 입력 : ");
			String msg=sc.nextLine();
			
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				if(str.equals(msg)) {
					System.out.println("동일한 문자열 존재합니다. ["+str+"]");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
