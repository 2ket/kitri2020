package ch05.object.test;

class ABS{
	private int value;
	private int abs;
	
	public void setValue(int value) {
		this.value=value;
	}
	public int resultAbs() {
//		abs=Math.abs(value);
//		return abs;
		
		if(value<0) {
			abs=(-value);
		}else {
			abs=value;
		}
		return abs;
		
	}
	public void disp() {
		System.out.println("result:"+abs);
	}
}

public class Quiz13 {

	public static void main(String[] args) {
		ABS abs=new ABS();
		abs.setValue(-10);
		abs.resultAbs();
		abs.disp();
	}

}
