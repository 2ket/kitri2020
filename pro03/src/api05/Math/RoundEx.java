package api05.Math;

public class RoundEx {

	public static void main(String[] args) {
		double x=123.5672;
		double y=456.4675;
		
		int a=(int)Math.round(x);
		System.out.println("반올림: "+a);
		
		int b=(int)Math.ceil(y);
		System.out.println("무조건 올림: "+b);
		
		int c=(int)Math.floor(x);
		System.out.println("무조건 내림: "+c);
		
		//소수 둘째자리 반올림해서 첫째자리 출력
		double temp=x*10;
		int imsi=(int)Math.round(temp);
		double result=(double)imsi/10.0;
		System.out.println(result);
		
		double t=Math.round(x*10)/10.0;
		System.out.println(t);
		
		double e=Math.round(x*100)/100.0;
		System.out.println(e);
		
		double m=Math.round(x*1000)/1000.0;
		System.out.println(m);
		
		double ce=Math.ceil(x*100)/100.0;
		System.out.println("소수 셋째자리 올림 둘째자리까지 출력: "+ce);
		
		double f=Math.ceil(x*1000)/1000.0;
		System.out.println("소수 넷째자리 올림 셋째자리까지 출력: "+f);
	}

}
