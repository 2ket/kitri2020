package ch04.object.basic;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 29.
 * @Description : 구현클래스
 * 				     실행클래스	// main함수 갖고 있는 클래스
 * 				     추상클래스 - 상속 / 자신의 객체 발생이 안됨
 * 				  Interface - 상속 / 자신의 객체 발생이 안됨 
 */
public class Exam16 {	//실행클래스
	public static void main(String[] args) {
		Su a = new Su();	//변수명 = 식별자, a라는 객체가 쓸수 있는것 x, y
		a.x=10;
		a.y=20;
		System.out.println(a.x + "\t" + a.y); 
		//지역변수는 초기화x, 전역변수는 지정 안되있으면 0으로 초기화
		
		Su b = new Su();
		b.x=77;
		b.y=88;
		System.out.println(b.x+"\t"+b.y);
		
		System.out.println("Person Class");
		Person x=new Person();	//객체발생
//		x.name="홍길동";
//		x.age=25;
//		x.ki=157.5f;
//		x.disp();
//		System.out.println(x.name);
//		System.out.println(x.age);
//		System.out.println(x.ki);
		x.input("홍길동", 25, 157.5f);
		
		Person y=new Person();
//		y.name="펭수";
//		y.age=10;
//		y.ki=210f;
//		y.disp();
//		System.out.println(y.name);
//		System.out.println(y.age);
//		System.out.println(y.ki);
		
		y.input("펭수", 10, 210f);
	}

}
