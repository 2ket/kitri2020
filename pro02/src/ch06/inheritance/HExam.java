package ch06.inheritance;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 7.
 * @Description : 함수재정의, upCasting/downCasting
 */

class HParents{
	protected int x;
	protected int y;
	
	public HParents() {}
	
	public HParents(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void yonsan() {
		System.out.println("hap:"+(x+y));
	}
}

class HSon extends HParents{
	public HSon() {	}
	public HSon(int x, int y) {
		super(x,y);
	}
	
	public void yonsan() {	//Overriding
		System.out.println("cha:"+(x-y));
	}
	public void disp() {
		System.out.println("hihihihi");
	}
}

public class HExam {

	public static void main(String[] args) {
		HParents h=new HParents(77, 88);
		h.yonsan();
		
		HSon s=new HSon(100,200);
		s.yonsan();//함수재정의
		
//		HSon a=new HParents(1,2); //ERROR:자식은 부모클래스를 담을 수 없다.
		
		HParents r=new HSon(1,2);	// upCasting
		r.yonsan();//자식꺼(Overriding) 함수재정의
//		r.disp() //ERROR:자식 고유의것은 건드리지 못함
//		함수 재정의는 자식은 부모의 함수를 고쳐쓸 수 있고, 부모는 자식의 재정의된 함수를 담을 수 있다.
		
		HSon a=(HSon) r; // downCasting 명시적, upCasting한 경우 DownCasting도 가능하다
		a.yonsan();
		a.disp();
		
//		HSon b=(HSon)new HParents(1,2);	//ERROR: upCasting한 자식클래스만 다시 downCasting 할 수 있다.
//		b.yonsan();
//		b.disp();
		
//		상속에서 나오는 함수재정의는 엄청 많이씀
//		자식에선 부모 함수 재정의해서 사용, 부모클래스는 자식클래스의 함수를 담을 수 있다(컨트롤은x)
//		
	}

}
