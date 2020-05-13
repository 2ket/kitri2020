package api03.String;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 13.
 * @Description : 	StringBuffer의 추가/삭제/수정
 */
public class StringBuffer02 {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("** JAVA");
		System.out.println(str);
		
		str.insert(3,  "Good");
		System.out.println(str);
		
		str.setCharAt(1, '#');
		System.out.println(str);
		
		str.replace(3, 7, "Love");// end에서 -1 해줘야함. end숫자 포함안함
		System.out.println(str);
		
		str.deleteCharAt(1);	//문자열 하나만 지우는것
		System.out.println(str);
		
		str.delete(7, 11);
		System.out.println(str);
		
		str.reverse();	//역순 출력
		System.out.println(str);
	}

}
