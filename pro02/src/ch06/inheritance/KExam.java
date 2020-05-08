package ch06.inheritance;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 8.
 * @Description : 추상클래스
 * 
 * 
 */

abstract class KParents{	//추상함수를 하나라도 가지고 있으면 추상클래스로 표시해야함
	protected int x, y;
	
	public void msg() {
		System.out.println("Msg 함수 입니다.");
	}
	
	public abstract void disp();//abstract 함수가 정의되는 클래스 역시 abstract여야 한다.
}

class KSon extends KParents{	//abstract 클래스 상속받는 순간 추상클래스 속 추상함수를 재정의 해야함.
	public void disp() {
		System.out.println("재정의했어!!");
	}
}

public class KExam {

	public static void main(String[] args) {
//		KParents a=new KParents();	//추상클래스는 객체생성이 안된다.
		KParents b=new KSon();		//자식클래스 객체의 업캐스팅은 된다.
		//구현클래스 실행클래스 인터페이스는 클래스개념과 좀 달라요. 인터페이스도 추상클래스처럼 객체생성이 안되요. 대신 자식꺼는 담아줄수있음(=오버라이딩 사용위해)
		b.disp();
		
		KSon c=new KSon();
		c.disp();
	}

}
