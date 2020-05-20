package io03.Char;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz26 {

	public static void main(String[] args) {
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		Scanner sc=null;
		
		System.out.println("데이터를 입력해 주세요. (종료: Q)");
		try {
			file=new File("C:\\Kitri2020\\java\\fileUpDown\\output\\quiz26.txt");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw, 1024);
			
			sc=new Scanner(System.in);
			while(true) {
				String msg=sc.nextLine();
				if(msg.equalsIgnoreCase("Q")) break;
				bw.write(msg+"\r\n");
				
				bw.flush();
			}
			System.out.println("종료되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
				sc.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
