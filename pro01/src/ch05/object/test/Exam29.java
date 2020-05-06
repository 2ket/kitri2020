package ch05.object.test;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 6.
 * @Description : static변수의 접근방법
 */

class YY{
	private int x;
	public int y;
	
	private static int a;
	public static int b;
	//접근제한/지정예약어/
	
	
	public void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void sub(int a, int b) {
		YY.a=a;
		YY.b=b;
	}
	
}
public class Exam29 {

	public static void main(String[] args) {
		YY y=new YY();
		y.y=70;
		YY.b=20;	//static 변수는 접근시 무조건 클래스명으로 접근. y.b=20;이면 오류남 YY.b=20;으로 해야함
	}

}
