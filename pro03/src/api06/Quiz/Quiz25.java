package api06.Quiz;

class Point{
	private int x, y, z;
	public Point(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public String toString() {
		return "["+x+"\t"+y+"\t"+z+"]";
	}
	public boolean equals(Object obj) {
		Point point=(Point) obj;
		boolean result=false;
		if(this.x==point.x && this.y==point.y && this.z==point.z) {
			result=true;
		}
		return result;
	}
}

public class Quiz25 {
	public static void main(String[] args) {
		Point p=new Point(1,2,3);
		Point o=new Point(1,2,3);
		
		System.out.println(p);
		System.out.println(o);
		System.out.println("결과: "+p.equals(o));
	}
	
}
