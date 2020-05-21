package thread07.Synchronized;

public class Cho extends Thread{
	private Calculator calculator;

	public void setCaculator(Calculator calculator) {
		this.calculator = calculator;
		setName("Hong");
	}

	@Override
	public void run() {
		calculator.setMoney(100);
	}
	
}
