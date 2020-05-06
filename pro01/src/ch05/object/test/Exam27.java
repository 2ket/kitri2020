package ch05.object.test;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 6.
 * @Description : 배열
 */
class GG{
	private int x;
	private int y;
//	생성자에 파라미터가 들어가는 생성자가 들어간다면, 안쓴다고 하더라도 파라미터 없는 default생성자를 무조건 만들어줘야함.
	public GG() {}
	public GG(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println(x+"\t"+y);
	}
}

public class Exam27 {

	public static void main(String[] args) {
		GG[] array=new GG[5];
		array[0]=new GG(10,20);
		array[1]=new GG(30,40);
		array[2]=new GG(50,60);
		array[3]=new GG(70,80);
		array[4]=new GG(99,88);
		
		for(int i=0; i<array.length; i++) {
			array[i].disp();
		}
		
	}

}
