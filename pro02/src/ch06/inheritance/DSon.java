package ch06.inheritance;

public class DSon extends DParents{
	public DSon() {
		super();
		System.out.println("DSon 기본생성자");
	}
	public DSon(int x) {
		super(x);	//항상 첫줄에 쓰여야함
		System.out.println("DSon 생성자1");
	}
	public DSon(int x, int y) {
		super(x,y);
		System.out.println("DSon 생성자2");
	}
	public void showPoint() {
		System.out.println(x+"\t"+y);
	}
}
