package ch01.dataType;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 27.
 * @Description : 연산자 우선순위
 * 	1) 최우선 연산자 : . [] ()
 *  2) 단항연산자 : !, ~, +/-, ++/--(전위형증감연산자), (cast) 또는 (자료형)
 *  3) 산술연산자 : *, /, %, +, -
 *  4) 시프트 연산자 : <<, >>, >>>
 *  5) 비교연산자 : >, <, <=, >=, ==, !=
 *  6) 논리연산자 : &, ^, |, &&, ||
 *  7) 삼항연산자 : 조건식 ? 참 : 거짓
 *  8) 대입연산자 : =, *=, /=, %=, +=...
 *  9) 후위형증감연산자 : ++/--
 *  10)순차연산 : 
 */
public class Exam02 {

	public static void main(String[] args) {
		boolean a=false;
		boolean b=!a;	//일반부정
		System.out.println(a+ "\t" +b);
		
		int c = ~10;	//이진부정
		// 0000 1010
		// 1111 0101 -11
		int d=~-15;
		//1111 0001 (15-1)을 0으로 채우고 나머지를 1로 채우면 -15
		//0000 1110 14
		System.out.println(d);
		
		int cc=~24;	//-25
		System.out.println("cc:"+cc);
		int dd=~-30;	//29
		System.out.println("dd:"+dd);		
	}

}
