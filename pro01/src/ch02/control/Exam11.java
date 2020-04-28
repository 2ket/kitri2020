package ch02.control;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 28.
 * @Description : 입력 관련 
 */

import java.util.Scanner;
public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String a= sc.next();
		System.out.print("정수입력: ");
		int x=sc.nextInt();	//숫자로 읽어와줌
		System.out.print("실수입력: ");
		float y=sc.nextFloat();
		
		System.out.print("문자입력: ");
		String str=sc.next();
		char ch=str.charAt(0);
		
		System.out.println("a: "+a);
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("ch: "+ch);
		sc.close();
	}

}
