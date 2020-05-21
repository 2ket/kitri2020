package thread10.Notify;

public class Consumer extends Thread{
	private AutoMachine machine;
	private String name;
	
	public Consumer(AutoMachine machine, String name) {
		this.machine = machine;
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(machine.getDrink()+" : "+name+" 꺼내 먹음");
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
