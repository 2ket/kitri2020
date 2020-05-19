package io03.Char;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 19.
 * @Description :	문자 입출력 - Read & Writer  / byte입출력 - InputStream & OutputStream
 */
public class CharEx01 {

	public static void main(String[] args) {
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		Scanner sc=null;
		try {
			file=new File("C:\\Kitri2020\\java\\fileUpDown\\output\\charEx01.txt");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw, 1024);
			
			System.out.println("문자열을 입력하세요 : ");
			sc=new Scanner(System.in);
			
			while(true) {
				
				
				String msg=sc.nextLine();	//한줄씩(공백포함) 데이터 전달
				if(msg.equalsIgnoreCase("q")) break;	//q가 나오면 빠져나오겠다.
				
				bw.write(msg+ "\r\n");	//메모장에서 \r\n이 줄바꿈
				bw.flush();
				
			}
			System.out.println("내용이 출력되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw!=null) fw.close();
				if(bw!=null) bw.close();
				if(sc!=null) sc.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
