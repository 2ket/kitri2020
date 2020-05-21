package thread05.State;

public class Ex {
	public static void main(String[] args) {
		StateTarget target=new StateTarget();
		
		while(true) {
			Thread.State state=target.getState();	//target 스레드의 상태를 스레드 상태에 저장 
			System.out.println("타겟 스레드 상태 : "+state);
			
			if(state==Thread.State.NEW) {	//상태가 (final)NEW라면 (비어있다면)
				target.start();		//target 스레드 실행
			}
			if(state==Thread.State.RUNNABLE) {}
			if(state==Thread.State.TIMED_WAITING) {
//				System.out.println("일시정지");
			}
			
			if(state==Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
