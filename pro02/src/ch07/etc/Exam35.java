package ch07.etc;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description :	객체를 지역변수 또는 매개변수로 사용 / Dependency(의존관계)
 */

class BB{
	public int x;
	public void disp() {
		x=50;
		System.out.println(x);
	}
}
class CC{
	private int su;
	public void func(BB b) {	//b=0x100
		b.x=77;
		System.out.println(b.x);
		
		b.disp();
		b=null;
	}
	
	
	public void method(BB b) {}
	//가비지 컬렉션이 지워짐 
	//우리가 new라는 키워드로 객체를 생성. 메모리의 heap영역에 할당되게 된다.
	//왼쪽이 공간을 차지하는 heap영역, 주소값을 갖게 되고, 그 함수는 주소를 공유해서 쓰는건데, 함수안에 얠 선언한것
	//디비에선 테이블과 테이블 관계를 릴레이션이라 했음
	//상속, 인터페이스
	//디펜던시Dependency
	//지역에서 쓰고 버려지는것
	
	public void sub() {
		//b.x=99;	ERROR 지역으로 선언해줘야함..
		BB b=new BB();	//공간이 다름. 
		b.disp();
	}
}
public class Exam35 {

	public static void main(String[] args) {
		BB b=new BB();	//b=0x100
		CC c=new CC();	//c=0x200
		c.func(b);		//0x100
		c.sub();		
		//객체단위로 넘겨주는 경우가 훨씬 많음
		
		b=null;
		c=null;
	}

}
