package thread10.Notify;

public class Producer extends Thread {
	private AutoMachine machine;

	public Producer(AutoMachine machine) {
		this.machine = machine;
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			machine.setDrink("음료수 No : "+i);
			System.out.println("음료수 No "+i+" 채워넣음");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
