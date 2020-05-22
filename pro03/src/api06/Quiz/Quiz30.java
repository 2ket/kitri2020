package api06.Quiz;

import java.text.DecimalFormat;

public class Quiz30 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str="123,456,777.5";
		DecimalFormat df=new DecimalFormat("#,###.#");
		Number num=df.parse(str);
		double su=num.doubleValue();
		
		DecimalFormat df1=new DecimalFormat("0");
		System.out.println("반올림: "+df1.format(su));
		System.out.println("반올림 : "+Math.round(su));//강사님 풀이
		
		
		DecimalFormat df2=new DecimalFormat("#,###");
		System.out.println("만단위: "+df2.format(su));
		
	}

}
