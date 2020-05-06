package ch05.object.test;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 6.
 * @Description : 
 */
class EE{
	private int x, y, z;
	private int a;
	
	public EE(){
		x=100;
		y=200;
		z=300;
		a=400;
	}
	
	public EE(int x){
		/*this.x=x;
		y=200;
		z=300;
		a=400;*/
		this();
		this.x=x;
	}
	
	public EE(int x, int y){
		/*this.x=x;
		this.y=y;
		z=300;
		a=400;*/
		
//		this();
//		this.x=x;
//		this.y=y;
		
		this(x);
		this.y=y;
	}
	
	public void disp(){
		System.out.println(x+"\t"+y+"\t"+z);
	}
}

public class Exam25{

	public static void main(String[] args){
		EE e=new EE();
		EE f=new EE(10);
		EE g=new EE(77, 88);
		
		e.disp();
		f.disp();
		g.disp();
	}

}
