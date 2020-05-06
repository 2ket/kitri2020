package ch05.object.test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 6.
 * @Description : 
 */

class ZZ{
	private String name;
	private int don;
	private static float iyul;
	
	public ZZ() {}
	
	public ZZ(String name, int don, float iyul) {
		this.name=name;
		this.don=don;
		ZZ.iyul=iyul; //static변수 iyul은 부를때 클래스로 접근해야함
		
	}
	
	public void disp() {
		System.out.println(name+"\t"+don+"\t"+iyul);
	}
	
	public static void output() {
//		static함수는 static변수만 사용가능
		
//		System.out.println(name);	ERROR
//		System.out.println(don);	ERROR
		System.out.println(iyul);
	}
}
public class Exam30 {

	public static void main(String[] args) {
		ZZ z=new ZZ("홍길동", 100000, 0.07f);
		z.disp();
		
		ZZ.output();//static 함수 역시 불러올 때 클래스로 접근해야함
		
		double pi=Math.PI;
		
		PrintStream out=System.out;
		out.println(10);	//System.out.println(10);
		
		Scanner sc=new Scanner(System.in);	//원래대로면 System.in에서 in의 반환형이 InputStream이므로 객체 선언으로 불러오는게 맞다.
		
		InputStream is=System.in;
		Scanner sc2=new Scanner(is);
		
		int su=Math.abs(-29);
		System.out.println(su);
	}

}
