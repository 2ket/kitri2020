package ch07.etc;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description :	메모리 
 */

class AA{
	private int x, y;
	public void func() {
		x=10;
		y=20;
		System.out.println(x+"\t"+y);
	}
	
}
public class Exam34 {
	public static void main(String[] args) {
		AA a=new AA();
		a.func();
		
		AA b=a;
		b.func();
		
		AA c=a;
		c.func();
		
		AA d=b;
		d.func();
		
		System.out.println("------------------------");
		b.func();
		b=null;
		
		c.func();
		c=null;
		d=null;
//		d.func(); ERROR
//		Exception in thread "main" java.lang.NullPointerException
//		at ch07.etc.Exam34.main(Exam34.java:39)
		
//		메모리는 constance메모리 영역 무거워지므로 너무 남발하면 안됨
//		heap은 지워졌다 쓰였다 반복. Stack과 연관.   
//		stack 
		
		System.out.println(a+"\t"+b+"\t"+c);
		System.out.println("------------------------");
		
		AA x=new AA();	//new를 이용한 선언은 메모리 새 주소에 할당된다
		x.func();
		AA y=x;
		y.func();
	}

}
