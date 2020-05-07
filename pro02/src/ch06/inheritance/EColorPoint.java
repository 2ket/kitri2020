package ch06.inheritance;

public class EColorPoint extends EPoint{
	private String color;
	
	public EColorPoint() {}
	
	public EColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	
	public void showColorPoint() {
		super.showPoint();
		System.out.println(color);
	}
}
