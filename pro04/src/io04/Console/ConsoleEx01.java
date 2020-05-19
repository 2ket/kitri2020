package io04.Console;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class ConsoleEx01 {

	public static void main(String[] args) throws IOException{
		InputStream is=System.in;	//Scanner 없이 is를 통해 받는 방식
		BufferedInputStream bis=new BufferedInputStream(is, 1024);
	
		byte[] data=new byte[20];
		System.out.print("문자열 입력 : ");
		int count=bis.read(data);
		System.out.println(count);
		
		String str=new String(data, 0, count-2);	//Enter("\r\n")까지 카운트해서 가져오므로 엔터 제외 위해 -2해줌
		System.out.println(str);
		
		byte[] suData=new byte[20];
		
		System.out.println("숫자입력: ");
		int cnt=bis.read(suData);
		String suStr=new String(suData, 0, cnt-2);
		int value=Integer.parseInt(suStr);
		System.out.println(++value);
		
		System.out.println();
		
		PrintStream ps=System.out;
		ps.println("출력");
		
	}

}
