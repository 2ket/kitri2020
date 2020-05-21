package thread09.Notify;

public class ChoPrducer extends Thread{
	private WorkData workData;

	public ChoPrducer(WorkData workData) {
		this.workData = workData;
	}
	 
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workData.sub();
		}
	}
}
