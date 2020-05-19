package io03.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 19.
 * @Description : 	입출력, PrintWriter
 */
public class CharEx03 {
	public static void main(String[] args) {
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;		//출력을 돕는 프린트 보조 스트림 PrintWriter(문자) PrintStream(바이트)
		Scanner sc=null;
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			file=new File("C:\\Kitri2020\\java\\fileUpDown\\output\\CharEx03.txt");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw, 1024);
			pw=new PrintWriter(bw);
						
			//출력
			System.out.println("문자열을 입력하세요");
			sc=new Scanner(System.in);
			 while(true) {
				 String msg=sc.nextLine();
				 if(msg.equalsIgnoreCase("q")) break;
				 	 
//				 bw.write(msg+"\r\n");
				 pw.println(msg);
				 pw.flush();
			 }
			 System.out.println(" 출력완료");
			 //입력
			 fr=new FileReader(file);
			 br=new BufferedReader(fr,1024);
			 
			 while(true) {
				 String msg=br.readLine();
				 
				 if(msg==null) break;
				 System.out.println(msg);
			 }
			 
			 
			 //프로세서 : 운영체제 위에서 실행되는 응용프로그램
			 //멀티프로세스 : 하나의 운영체제에서 두개 이상의 프로그램이 실행되는 경우
			 //스레드 : 하나의 응용프로그램에서 하는 동작 하나
			 //멀티스레드 : 하나의 응용프로그램에서 두가지 이상의 일을 동시에 할수 있는 경우
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw!=null) fw.close(); 
				if(bw!=null) bw.close(); 
				if(sc!=null) sc.close(); 
				
				if(fr!=null) fr.close();
				if(br!=null) br.close();
			}catch(IOException e ) {
				e.printStackTrace();
			}
		}
		
	}
}
