package thread02.Deamon;

public class Digit extends Thread{
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.print(i+"\t");
			
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
