package api07.Date;

import java.text.DecimalFormat;

public class DecimalExam {

	public static void main(String[] args) throws Exception {
		double x=1234567.89;
		
		DecimalFormat d1=new DecimalFormat("0");
		DecimalFormat d2=new DecimalFormat("0.0");//반올림
		DecimalFormat d3=new DecimalFormat("0.0000");
		DecimalFormat d4=new DecimalFormat("0000000.0");
		DecimalFormat d5=new DecimalFormat("0.000");
		
		System.out.println(d1.format(x));
		System.out.println(d2.format(x));
		System.out.println(d3.format(x));
		System.out.println(d4.format(x));
		System.out.println(d5.format(x));
		System.out.println();
		
		
		DecimalFormat d6=new DecimalFormat("#######.##");
		DecimalFormat d7=new DecimalFormat("#.#");
		
		
		System.out.println(d6.format(x));
		System.out.println(d7.format(x));
//		System.out.println(d6.format(x));
		
		int y=123456789;
		DecimalFormat d10=new DecimalFormat("#,###");
		DecimalFormat d11=new DecimalFormat("#,####");
		DecimalFormat d12=new DecimalFormat("#,#####");
		DecimalFormat d13=new DecimalFormat("\u00A4 #,####");
		
		System.out.println(d10.format(y));
		System.out.println(d11.format(y));
		System.out.println(d12.format(y));
		System.out.println(d1.format(y));
	
		
		//문자 --> 숫자
		String str="1,123,456";
		DecimalFormat df=new DecimalFormat("#,###");
		Number num=df.parse(str);
		int su=num.intValue();
		System.out.println(su);
		
		
		
//		컬렉션 : 중요하니 알아두세용 면접질문으로 많이나옴
		
		
	}

}
