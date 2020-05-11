package ch07.etc;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description : 	객체를 필드(멤버 객체, 여기서는 오브젝트)로 사용
 */

class Apple{
	private int su;
	private int value;
	
	public void setData(int su, int value) {
		this.su=su;
		this.value=value;
	}
	
	public int getData() {
		return su+value;
	}
}

class Banana{
	private Apple apple;			//apple=0x100
	
	public void setData(Apple apple) {	//apple=0x100
		this.apple=apple;
	}
	
	public void disp() {
		System.out.println("결과값은:"+apple.getData());
	}
}
public class Exam38 {
	public static void main(String[] args) {
		Apple apple=new Apple();	//apple=0x100
		apple.setData(10, 20);
		
		Banana banana=new Banana();
		banana.setData(apple);	//apple=0x100
		banana.disp();
		
		banana=null;
		apple=null;
	}

}
