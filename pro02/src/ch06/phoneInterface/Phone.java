package ch06.phoneInterface;

public interface Phone {
	// 송수신
	public void callSend();//특별한경우 아니면 다 퍼블릭
	// 데이터전송
	public void canData();
	//리모컨기능
	public void tvRemote();
}
