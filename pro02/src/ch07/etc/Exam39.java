package ch07.etc;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description : 업캐스팅해서 한번에 부르다 조건으로 다운캐스팅 하고싶을 때 instanceof
 */

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
	public void sub() {
		System.out.println("hahahha");
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
public class Exam39 {
	public static void main(String[] args) {
		Shape shape=new Shape();
		Line line=new Line();
		Rect rect=new Rect();
		Circle circle=new Circle();
	
		print(shape);
		print(line);
		print(rect);
		print(circle);
	}
	
	public static void print(Shape shape) {
		shape.draw();
		//shape.sub(); ERROR 자식 고유의 함수여서 부모가 건드리지 못함
		if(shape instanceof Line) {	//Line 클래스에서 만들어진 shape 인지 확인하는 용도
			Line i=(Line)shape;	//다운캐스팅
			i.sub();
		}
	}
}
