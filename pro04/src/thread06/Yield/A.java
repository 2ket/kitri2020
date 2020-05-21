package thread06.Yield;

public class A extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop) {	//stop에 true가 들어오면 종료
			if(work) {	//work=true
				try {
					sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("A 작업내용");
			}else {	//work=false;
				Thread.yield();
			}
		}
		System.out.println("A 종료");
	}
}
