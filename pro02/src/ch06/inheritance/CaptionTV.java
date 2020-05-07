package ch06.inheritance;

public class CaptionTV extends CTV {
	private boolean caption;	//화면 캡쳐
	
	public CaptionTV() {}
	
	public CaptionTV(boolean power, int channel, boolean caption) {
		super.power=power;
		super.channel=channel;
		
		this.caption=caption;
	}
	
	public void display(String text) {
		if(power && caption) {
			System.out.println(channel+"\t"+text);
		}else {
			System.out.println("전원 또는 화면캡쳐를 켜세요.");
		}
	}
}
