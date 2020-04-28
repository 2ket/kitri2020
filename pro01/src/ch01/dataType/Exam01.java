package ch01.dataType;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 27.
 * @Description : 자료형
 */
public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		System.out.println("하하하");
		System.out.print("호호호");
		System.out.println("월요일\n\n");
		System.out.print("화요일 \t 수요일\n\n");
		
		// 숫자(정수, 실수)
		// 정수 - byte, short, int long
		byte a = 10;			// 1byte :8bit  -128~127
		short b = 129;			// 2byte :16bit -32768~32767
		int c = 1000;			// 4byte :32bit -2147483648~2147483647
		long d = 6580L;			// 8byte :64bit -(2^63) ~ (2^63-1)
		System.out.println("\na:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("\n");
		//가장많이 쓰는게 integer(int) 
		//오라클은 데이터 범위를 딱 맞춰서 써야한다 기억공간낭비없이. java는 상관x
		
		// 실수 - float, double
		float e = 45.5f;		// 4byte : 4E-45 ~3.4082E38
		double f = 123.40;		//8byte  : 4.92 E-324~1.8 E308
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		
		//문자 (2byte)
		char ch='A';
		char h='가';
		System.out.println("ch:"+ ch);	//아스키 코드값
		System.out.println("h:"+ h);	//문자셋 (UTF-8)
		
		//문자열 (2byte이상 참조형 자료형) 무한 참조형(reference라 하는 이유 : 주소값을 참조)
		String str1 = "Hello java";
		String str2 = "안녕하세요, 자바";
		String str3 = "How are you";
		
		String str4="Hello java";
		if(str1==str4) { //주소비교 T
			System.out.println("T");
		}else {
			System.out.println("F");
		}//str4가 str1의주소값을 다시 사용하여 메모리 공간을 절약한다. str1==str4는 같은 주소값을 가져 True
		//stack영역
		if(str1.equals(str4)){ //데이터 비교 T
			System.out.println("T");
		}else {
			System.out.println("F");
		}
		
		
		String aa = new String("hi");
		String bb = new String("hi");
		if(aa==bb) {	//주소비교 F
			System.out.println("T");
		}else {
			System.out.println("F");
		}//heap(?) 영역
		
		if(aa.contentEquals(bb)){	//데이터 비교 F
			System.out.println("T");
		}else {
			System.out.println("F");
		}
		
		//논리형 자료형 T(1), F(0) 1byte
		boolean b1=true;
		boolean c1=false;
		System.out.println(b1);
		System.out.println(c1);
		
	}

}
