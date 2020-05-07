package ch06.inheritance;

public class FAccumulator {	//계산, 누적
	private int initValue;
	public static int totValue;
	
	protected FAccumulator() {}
	
	protected FAccumulator(int initValue) {
		this.initValue=initValue;
		totValue+=initValue;//
	}
	
	protected void setAccumulator(int money) {
		if(money<0)return;
		initValue+=money;
		totValue+=money;//
	}
	protected int getAccumulator() {
		return initValue;
	}
	
}
