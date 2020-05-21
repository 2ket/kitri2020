package thread06.Yield;

public class B extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				try {
					sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("B 작업내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("B 종료");
	}
}
