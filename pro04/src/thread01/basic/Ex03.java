package thread01.basic;

class AA{
	public void disp() {
		System.out.println("hahahaha");
	}
}
class Alphabet02 extends AA implements Runnable{

	@Override
	public void run() {
		for(char i='A'; i<='z';i++) {
			System.out.print(i+"\t");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		System.out.println();
	}
	
}

class Digit02 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.print(i+"\t");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Digit02 digit=new Digit02();
		digit.start();
		
		Alphabet02 alpha=new Alphabet02();
		Thread thread=new Thread(alpha);
		thread.start();
	}

}
