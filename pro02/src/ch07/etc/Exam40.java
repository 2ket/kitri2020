package ch07.etc;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description : 	싱글톤(Singleton) : 자바 패턴
 * 생성자를 스태틱으로 올려둬서 new로 객체생성을 하지 않고 바로 쓸 수 있게 만드는 패턴
 * DB의 data acceptObject만들때처럼 계속 실행해야하는 경우 new없이 계속 사용
 */

class Singleton{
	private static Singleton singleton=new Singleton();	//0x500
	public void data() {
		System.out.println("싱글톤 함수");
	}
	public static Singleton getInstance() {
		return singleton;	//static선언한 위 singleton		//0x500
	}
}

public class Exam40 {
	public static void main(String[] args) {
		Singleton a=new Singleton();
		Singleton b=new Singleton();
		Singleton c=b;
		
		if(a==b) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
		
		if(b==c) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
		
		System.out.println("==========================");
		Singleton x=Singleton.getInstance();
		x.data();
		
		Singleton y=Singleton.getInstance();
		y.data();
		
		if(x==y) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
	}
}
