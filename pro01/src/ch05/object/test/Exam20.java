package ch05.object.test;


class AA{		//this=객체(a)
	private int x;
	private int y;	
	
	public void input(int x, int y) {
		this.x=x;
		this.y=7;
		
		System.out.println(x);//지역변수
		System.out.println(this.x); //멤버변수
		System.out.println(y);
		System.out.println(this.y);
		
		
	}

public void sub() {
	System.out.println(this.x); //생략가능
}
}

public class Exam20 {
	public static void main(String[] args) {
		AA a=new AA();
		a.input(10, 20);
		
	}

}
