package thread03.join;

public class Sum extends Thread{
	private long sum;
	public long getSum() {
		return sum;
	}
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum+=i;
			System.out.print(sum+"\t");
			if(i%10==0) System.out.println();
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("합: "+getSum());
	}
}
