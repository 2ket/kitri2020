package ch07.etc;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description : 
 */

class DD{
	public int x;
	
	public void disp() {
		System.out.println(x);
	}
}

class EE{
	public DD sub() {
		DD d=new DD();
		d.disp();
		return d;
	}
	
	public DD func(DD d) {
		//DD객체가 들어와서 DD객체로 return된것. 객체단위로 지역에서 놀고 있으므로 dependency
		return d;
	}
}
public class Exam37 {
	public static void main(String[] args) {
		EE e=new EE();
		DD d=e.sub();
		DD f=e.func(d);
		
	}
}
