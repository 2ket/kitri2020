package api06.Quiz;

public class Quiz18 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
		System.out.println(sb);
		
		StringBuilder stringB=new StringBuilder();
		for(int i=1; i<=100; i++) {
			stringB.append(i);
		}
		System.out.println(stringB.toString());
	}

}
