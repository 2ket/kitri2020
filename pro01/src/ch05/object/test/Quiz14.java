package ch05.object.test;

class Plus{
	private int x;
	private int y;
	
	public int getX() {
		return ++x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return ++y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

public class Quiz14 {

	public static void main(String[] args) {
		Plus p=new Plus();
		p.setX(10);
		p.setY(20);
		
		System.out.println(p.getX()+", "+p.getY());
	}

}
