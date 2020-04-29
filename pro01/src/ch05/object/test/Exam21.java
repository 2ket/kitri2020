package ch05.object.test;


class BB{
	private int x;
	private int y;
	private int z;
	
	//접근 제한자 public
	//!!!생성자는 클래스 명과 같아야한다!!!
	public BB(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void disp() {
		System.out.println(x+"\t"+y+"\t"+z);
	}
}

//생성자와 함수는 생긴 모양이 다름
public class Exam21 {

	public static void main(String[] args) {
		BB b = new BB(1,2,3);
		b.disp();
	}

}
