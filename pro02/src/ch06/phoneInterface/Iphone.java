package ch06.phoneInterface;

public class Iphone implements Phone {

	@Override
	public void callSend() {
		System.out.println("가능합니다");
	}

	@Override
	public void canData() {
		System.out.println("5G 가능합니다");
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨 미탑재 되었습니다.");
	}

}
