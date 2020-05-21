package thread09.Notify;

public class Hong extends Thread {
	private WorkData workData;

	public Hong(WorkData workData) {
		this.workData=workData;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workData.method();
		}
	}
	
}
