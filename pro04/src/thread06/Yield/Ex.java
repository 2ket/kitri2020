package thread06.Yield;

public class Ex {

	public static void main(String[] args) throws InterruptedException {
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();				//A, B 실행
		Thread.sleep(3000);
		
		a.work=false;
		Thread.sleep(3000);		//B실행
		
		a.work=true;
		b.work=false;			//A실행
		Thread.sleep(3000);
		
		a.stop=true;
		b.stop=true;
		
	}

}
