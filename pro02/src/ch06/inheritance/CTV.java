package ch06.inheritance;

public class CTV {
	protected boolean power;	//전원상태
	protected int channel;		//채널
	
	public static int su;
	
	public void setPower(boolean power) {
		this.power=power;
	}
	
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
	
	
}
