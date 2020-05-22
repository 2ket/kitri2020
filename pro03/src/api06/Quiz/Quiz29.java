package api06.Quiz;

public class Quiz29 {
	public static void main(String[] args) {
		String str="1!2@3^4~5";
		String delStr="!@^~";
		
		StringBuffer sb=new StringBuffer(str);
		for(int i=0; i<delStr.length(); i++) {
			//delStr.charAt(i) : i번째 char타입의 문자 : !, @, ^, ~
			//StringBuffer에 쓰이는 indexOf는 String으로 받아야하므로 형변환 필요
			String s=Character.toString(delStr.charAt(i));
			int index=sb.indexOf(s);	//i번째 문자가 들어간 sb의 index찾기
			sb.deleteCharAt(index);		//해당 문자열 지워주기
		}
	
		System.out.println(sb.toString());
		
		StringBuffer sb2=new StringBuffer();//빈 StringBuffer에 추출한문자 더해주기
		//강사님 풀이
		for(int i=0; i<str.length(); i++) {
			char strCh=str.charAt(i); //str의 i번째 문자 
			if(delStr.indexOf(strCh)==-1) {	//i번째 문자를 포함한 인덱스찾아서 포함되지 않으면 -1
				sb2.append(strCh);	//포함되지 않은 문자만 빈 Sb2에 더해줌
			}
		}
		System.out.println(sb2.toString());
	}
}
