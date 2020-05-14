package api06.Quiz;

import java.text.DecimalFormat;

public class Quiz23 {

	public static void main(String[] args) {
		int y=123456789;
		
		DecimalFormat df=new DecimalFormat("#,###");
		System.out.println("출력값 : "+df.format(y));
	}

}
