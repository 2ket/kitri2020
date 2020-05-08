package ch06.inheritance;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 8.
 * @Description : 	인터페이스 상속
 */
interface LParents{
	public int SU=10;			//static final
	public static final int value=20;
	public void disp();			//abstract method
	public abstract void func();
/**	기본적으로 인터페이스속 변수는 static final, 함수는 abstract method형태이다.	*/
}

class LSon implements LParents{
	private int value;
	@Override
	public void disp() {
		System.out.println(SU);
	}

	@Override
	public void func() {
		
	}
	public void output() {
		value=77;
		System.out.println(value);
	}
//종류가 같으면 extends(클래스->클래스 상속, 인터페이스->인터페이스 상속), 다른경우 implements(클래스->인터페이스 상속, 반대의 경우는 없다.) 
}

public class LExam {
	public static void main(String[] args) {
//		LParents l=new LParents();//ERROR 인터페이스는 자기 객체 생성 불가
		LParents p=new LSon();
		p.disp();
//		p.output();	//자식 고유의 함수는 못건드림
		System.out.println(LParents.SU);
		System.out.println(LSon.SU);
		
		LSon s=new LSon();
		s.disp();
		s.output();
	}

}
