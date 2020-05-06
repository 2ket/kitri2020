package ch05.object.test;

class Circle{
	private double radius;
	private double area;
	
	public void getRadius(double radius) {
		this.radius=radius;
	}
	public double findArea() {
		area=radius*radius*Math.PI;
		return area;
	}
	public void disp() {
		System.out.println("원의면적:"+area);
	}
	
	
	
}

public class Quiz12 {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.getRadius(4.0);
		c.findArea();
		c.disp();
	}

}
