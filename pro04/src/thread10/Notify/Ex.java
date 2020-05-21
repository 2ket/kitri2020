package thread10.Notify;

public class Ex {

	public static void main(String[] args) {
		AutoMachine machine=new AutoMachine();	//공유객체 (공유데이터)
		
		Producer gildong=new Producer(machine);	//생산자
		
		Consumer cho=new Consumer(machine, "김경은");
		Consumer kim=new Consumer(machine, "지명관");
		Consumer park=new Consumer(machine, "임정인");
		
		gildong.start();
		
		cho.start();
		kim.start();
		park.start();
	}

}
