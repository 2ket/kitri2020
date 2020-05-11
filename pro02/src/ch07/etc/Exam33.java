package ch07.etc;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description : final 함수
 * 
 */

class Test{
	protected final double PI=3.141592;
	protected static final int VALUE=20;
	
	public double getPI() {
		return PI;
	}
	public void setPI(double PI) {
//		this.PI=PI;	ERROR:값을 받아서 PI에 넣는것 안됨. final이므로
	}
	
	public final void abc() {}
	
	public static final void xyz() {}
	
	public void sub() {}
	
	public static void func() {}
}

class Son extends Test{
	public void sub() {
		System.out.println("함수 재정의 가능");
		this.abc();
		Test.xyz();//static은 클래스접근!!!
	}
	public static void fnc() {
		System.out.println("함수 재정의 가능");
	}
//	public final void abc() {}	ERROR
//	public static final void xyz() {}	ERROR
//	final함수는 사용할수는 있어도 함수재정의는 불가능하다
}
public class Exam33 {
	public static void main(String[] args) {
		
	}

}
