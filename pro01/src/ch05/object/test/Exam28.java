package ch05.object.test;
/**
 * @Author : 김경은
 * @Date : 2020. 5. 6.
 * @Description : static 변수
 * 
 * constant : 프로그램 시작, 만들어져서 종료 없어진다
 * 
 * Heap : Stack영역에서 더이상 참조하지 않으면 가비지컬렉션에 의해서 종료된다
 * Stack : 블럭단위로 만들어지고 없어진다
 * Register : 
 * 
 * static : 객체가 계속 바뀌어도 증감이 됨
 * 대부분은 클래스 안,  블록 안 지역변수에는 static 안쓰나,
 * 필요에 의해 메모리에 계속 남아있길 원하는 변수에는 static 쓴다. 남용하면 메모리를 잡아먹게됨
 */

class HH{
	private int x;
	private int y;
	private static int count;

	public void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setCount() {
		System.out.println(++count);
	}
	
	public void disp() {
		System.out.println(x+"\t"+y);
	}
	
}

public class Exam28 {

	public static void main(String[] args) {
		HH a=new HH();
		a.setData(10, 20);
		a.setCount();
		a.disp();
		
		HH b=new HH();
		b.setData(30, 40);
		b.setCount();
		b.disp();
		
		HH c=new HH();
		c.setData(50, 60);
		c.setCount();
		c.disp();
		
	}

}
