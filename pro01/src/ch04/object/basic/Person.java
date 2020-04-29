package ch04.object.basic;

public class Person {
	//클래스는 변수와 함수로 이루어져있다.
	public String name;	// instance variable, member variable, field
	public int age;
	public float ki;
	
	public void disp() {//instance function, member function
		System.out.println(name);
		System.out.println(age);
		System.out.println(ki);
		System.out.println();
	}
	//.연산자, 함수통해서, 생성자 통해서
	//함수가 제일 편하다. 98%가 함수 사용
	
	//함수와 생성자 차이.
	//
	public void input(String n, int a, float k) {
		name=n;
		age=a;
		ki=k;
		disp();
	}
}
