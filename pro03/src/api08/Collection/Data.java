package api08.Collection;

public class Data {
	private int x;
	private int y;
	private int z;
	
	public Data() {}

	public Data(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void yonsan() {
		z=x+y;
	}
	public void disp() {
		System.out.println(x+"\t"+y+"\t"+z);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+x+"\t"+y+"\t"+z+"]\n";
	}
	
}
