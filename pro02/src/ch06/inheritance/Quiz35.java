package ch06.inheritance;

abstract class Figure{
	public abstract void area();
	public abstract void around();
}

class Circle1 extends Figure{
	private double radius;
	
	public Circle1() {}
	public Circle1(double radius) {
		this.radius=radius;
	}
	@Override
	public void area() {
		System.out.println("원의 면적:"+(Math.PI*radius*radius));
	}

	@Override
	public void around() {
		System.out.println("원의 둘레:"+(2*Math.PI*radius));
	}
}

class Rectangular extends Figure{
	private double x;
	private double y;
	
	public Rectangular() {}
	public Rectangular(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void area() {
		System.out.println("사각형의 면적:"+(x*y));
	}

	@Override
	public void around() {
		System.out.println("사각형의 둘레:"+(2*(x+y)));
	}	
}

public class Quiz35 {
	public static void main(String[] args) {
		Figure f=new Rectangular(2.3, 3.7);
		f.area();
		f.around();
		
		Figure i=new Circle1(3.6);
		i.area();
		i.around();
	}

}
