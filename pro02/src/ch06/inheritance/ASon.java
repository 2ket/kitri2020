package ch06.inheritance;

public class ASon extends AParents{
	private int su;
	private int value;
	
	public void disp() {
//		System.out.println(x);	//ERROR : x가 AParents에서  
//		private는 상속이 불가하다. public은 너무 공용화라 쓰기 적절하지 않다. 이런 경우 protected(class diagram에선 #)를 쓴다.
//		따라서 가장 많이쓰는 접근자는 protected가 된다. 
		
		System.out.println(x1+"\t"+this.x1);
		System.out.println(super.x1);
		
		System.out.println(y1+"\t"+this.y1);
		System.out.println(super.y1);
		
		sub();
		this.sub();
		super.sub();//상속의 경우 super를 쓸 수 있다.
		
		System.out.println(su+"\t"+this.su);
		System.out.println(value+"\t"+this.value);//상속 아닌 변수는 super 못씀. -> 상속과 비상속 구분을 위해 상속된 변수/함수/생성자 사용시 super쓰는게 좋다
	}
	
	public void setData(int x1, int y1, int su, int value) {
		super.x1=x1;	//this.x1=x1; super를 쓰면 상속된 변수임을 쉽게 알 수 있다.
		super.y1=y1;
		
		this.su=su;
		this.value=value;
	}
}
