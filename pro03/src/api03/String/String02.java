package api03.String;

import java.util.Date;
import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 12.
 * @Description : 	문자추출
 */
public class String02 {

	public static void main(String[] args) {
		String a="apple";
		String b="Apple";
		
		System.out.println(a.equals(b));//대소문자 구분
		System.out.println(a.equalsIgnoreCase(b));//대소문자 구분x
		
		String subject="Java Programming";
		System.out.println("소문자 : "+subject.toLowerCase());
		System.out.println("대문자 : "+subject.toUpperCase());
		System.out.println("과목명 : "+subject);
		
		String oldStr="자바는 객체지향적 언어입니다.";
		String newStr=oldStr.replace("자바", "java");
		System.out.println("문자열 치환 : "+newStr);
		System.out.println("원본 데이터 : "+oldStr);
		
		String str="How are you?";
		System.out.println("문자열 잘라내기 : "+str.substring(2));
		System.out.println("문자열 잘라내기 : "+str.substring(2,9));
		
		String t="     자바		프로그램		";
		System.out.println("앞뒤 공백문자 제거 : "+t.trim());
		
		//문자 -> 숫자, 날짜
		String value="10";
		Scanner sc=new Scanner(value);
//		System.out.println(sc.next());
		
		int r=sc.nextInt();
		System.out.println(++r);
		int x=Integer.parseInt(value);
		System.out.println(++x);
		
		//숫자, 날짜 -> 문자 '
		System.out.println("");
		String ivar=String.valueOf(10);
		String fvar=String.valueOf(24.5f);
		String bvar=String.valueOf(true);
		
		System.out.println(ivar+"\t"+fvar+"\t"+bvar);
		
		Date date=new Date();
		System.out.println(date.toString());
		System.out.println(date);
		
//		모든 객체는 자체 toString함수 가지고 있으면 객체를 출력하면 toString으로 자동변환출력 
//		없는경우 클래스 저장공간(메모리주소) 출력
//		내부api는 객체 이름만 가져와도 toString출력 
		
		
		
		sc.close();
	}

}
