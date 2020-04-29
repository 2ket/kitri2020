package ch05.object.test;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 29.
 * @Description : 
 */

class DD{
	private int x;
	private int y;
	
	public DD() {
		x=0;
		y=0;
	}
	public DD(int x) {
		this.x=x;
		y=77;
	}
	public DD(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void disp() {
		System.out.println(x+"\t"+y);
	}
}
public class Exam24 {

	public static void main(String[] args) {
		DD a=new DD();
		DD b=new DD(88);
		DD c=new DD(100,200);
		
		a.disp();
		b.disp();
		c.disp();

	}

}
