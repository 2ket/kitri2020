package thread07.Synchronized;

public class Hong extends Thread {
	private Calculator calculator;

	public void setCaculator(Calculator calculator) {
		this.calculator = calculator;
		setName("Cho");
	}

	@Override
	public void run() {
		calculator.setMoney(50);
	}
	
}
