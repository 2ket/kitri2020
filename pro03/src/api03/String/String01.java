package api03.String;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 12.
 * @Description : 문자열 추출
 */
public class String01 {

	public static void main(String[] args) {
		String a="apple";
		String b=new String("banana");
		
		System.out.println(a+"\t"+b);
		
		String subject="자바프로그래밍";
		char ch=subject.charAt(5);
		System.out.println("문자열추출 : "+ch);
		
		int len=subject.length();
		System.out.println("문자열길이 : "+len);
		
		int i=subject.indexOf("프로");	//주어진 문자열이 포함되지 않으면 -1을 포함
		System.out.println("문자열 위치 : "+i);
		
		String juminbunho="123456-1234567";
		char sex=juminbunho.charAt(7);
		
		
		
		if(juminbunho.length()==14) {	//자리수가 14자리인지 확인
			if(juminbunho.indexOf('-')==6) {	//중간에 7번째에 -기호가 제대로 들어가는지
				if(sex%2!=0) {	//남자인지
					System.out.println("남자");
				}else {
					System.out.println("여자");
				}
//				switch(sex) {
//				case '1': case '3': case '5':
//					System.out.println("남자");break;
//				case '2': case '4': case '6':
//					System.out.println("여자");break;
//				}
				
			}else {System.out.println("형식이 맞지 않음");}
		}else {System.out.println("자리수가 맞지않음");}
	}

}
