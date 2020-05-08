package ch06.robotAbstract;

public class SuperRobot extends Robot {
	public SuperRobot() {}
	
	public SuperRobot(String kind) {
		super.kind=kind;
	}
	
	
	@Override
	protected void actionFly() {
		System.out.println("날 수 있습니다");
	}

	@Override
	protected void actionMisail() {
		System.out.println("미사일을 쏠 수 있습니다");
	}

	@Override
	protected void actionKnife() {
		System.out.println("레이저검을 가지고 있습니다");
	}

}
