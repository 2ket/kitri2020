package ch06.inheritance;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 7.
 * @Description : 	자식객체를 상위클래스의 객체로 upCasting후 다시 downCasting하여
 * 					상위클래스의 함수를 오버라이드하여 자식클래스에서 사용.
 */

class XX{
	public void disp() {
		System.out.println("disp func...");;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "집에가자";
	}
	
	
	
}

class YY{
	public void setData(Object obj) {	
//		setData에서 받아주는 파라미터 객체가 Object인데, Main함수에서 setData에 던져주는 x값이 XX클래스(자식클래스)객체이므로 upCasting이 된다.
//		받는게 많을때는 최상위 클래스(Object)로 받아서 upCasting 후 다시 downCasting한다.
//		obj.disp();	//ERROR
		System.out.println(obj.toString());
		XX x=(XX) obj;	//downCasting
		x.disp();
		System.out.println(x.toString());
	}
}
public class IExam {

	public static void main(String[] args) {
		XX x=new XX();
		YY y=new YY();
		y.setData(x);
		
		
	}

}
