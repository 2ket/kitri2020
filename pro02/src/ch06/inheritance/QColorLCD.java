package ch06.inheritance;
class LCD{
	private int size;
	public LCD(int size) {
		this.size=size;
	}
}
public class QColorLCD extends LCD{
	int colorSize;
	public QColorLCD(int colorSize, int size) {
		super(size);
		this.colorSize=colorSize;
	}
}
