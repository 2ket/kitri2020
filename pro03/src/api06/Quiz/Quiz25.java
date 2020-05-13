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
	public boolean equals(Point point) {
		if(this.toString().equals(point.toString())) {	//근데 equals를 오버라이딩했는데 여기다가 원래Object클래스의 equals함수를 쓰는게 의미가 있...나...?
			return true;
		}else {
			return false;
		}
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
