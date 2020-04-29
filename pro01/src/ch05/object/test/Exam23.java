package ch05.object.test;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 29.
 * @Description : 생성자 중복
 * 				    중복은 생성자명 또는 함수명 이름은 같지만 파라메타 타입이나 
 * 				     갯수가 달라야 한다. 
 */

class CC{
	private int x;
	private int y;
	
	public CC(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public CC() {
		x=0;
		y=0;
	}
	
	public void input(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void disp() {
		System.out.println(x+"\t"+y);
	}
}
public class Exam23 {

	public static void main(String[] args) {
		CC a=new CC(10,20);
		//생성자가 이미 생성된 경우, default 생성자 생기지 않는다.
		//새롭게 괄호안에 파라미터 없는 default 생성자를 만들어 둬야 default생성자 호출가능.
		
		CC b=new CC();
		b.input(77, 88);
	}

}
