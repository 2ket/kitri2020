package api06.Quiz;

import java.util.StringTokenizer;

public class Quiz24 {
	public static void main(String[] args) {
		String str="아이디, 이름, 패스워드";
		//split() 메소드 이용
		String[] array=str.split(", ");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		//StringTokenizer 이용
		StringTokenizer st=new StringTokenizer(str, ", ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
}
