package ch06.inheritance;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 8.
 * @Description : 오버라이딩 된 자식클래스의 함수들을 부모클래스 객체의 배열로 업캐스팅하여 묶어 실행
 */

class Shape{	//부모 클래스 (super클래스)
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{	//자식클래스 (sub클래스)
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class JExam {

	public static void main(String[] args) {	//부모클래스에 3개의 자식클래스를 배열로 담아내면 편리하다(상속이기에 가능)
		Shape[] array=new Shape[3];
		array[0]=new Rect();
		array[1]=new Line();
		array[2]=new Circle();
		
		for(int i=0; i<array.length; i++) {
			System.out.println("-----"+i+"-----");
			array[i].draw();
		}//오버라이딩 된 각각의 자식클래스의 함수들을 부모클래스 객체로 배열에 담아 한꺼번에 출력하는게 가능하다  
	}

}
