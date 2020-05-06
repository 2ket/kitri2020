package ch05.object.test;

class KK{
	public void aa() {
		bb();
		this.bb();
		
		cc();
		KK.cc();
		ee();
		KK.ee();
	}
	
	public final void bb() {
		
	}
	
	public static void cc() {
//		bb();	//ERROR static만 가져올수있음
		dd();
		KK.dd();
		ee();
	}
	
	public final static void dd() {
		
	}
	public static final void ee() {}
}


public class Exam32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
