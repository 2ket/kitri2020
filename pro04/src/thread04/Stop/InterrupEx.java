package thread04.Stop;
/**
 * @Author : 김경은
 * @Date : 2020. 5. 21.
 * @Description :	Daemon : 주/부 스레드. 주스레드 멈추면 부 스레드도 멈춘다.
 * 					Join : 주/부 개념보단 한쪽이 돌아갈 때 까지 기다려줌
 * 
 * 
 * 스레드가 실행 대기 또는 실행 상태에 있을 때 interrupt() 메서드가 실행되면
 * 스레드가 미래에 일시정지 상태가 되어 InterruptedException 발생한다.
 * interrupt() 메서드가 호출되었다면 스레드는 interrupted()메서드는 true를 리턴한다.
 * 				
 */

class SubThread extends Thread{
	@Override
	public void run() {
		int count=0;
		
		System.out.println("실행중...");
		while(count<=10) {
			
			System.out.println(count);
			try {
				if(isInterrupted())break; 	//일시정지시 에러를 발생해서 깨운다.
				sleep(300);
			}catch(Exception e) {
//				e.printStackTrace();
				System.out.println("자원 종료....");
				System.out.println("실행 종료....");
			}
			++count;
		}
		
	}
}

public class InterrupEx {
	public static void main(String[] args) {
		SubThread sub=new SubThread();
		sub.start();
		
		for(int i=0; i<=2; i++) {
			System.out.println("main"+i);
			
			if(i==1) sub.interrupt();
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println("==main error==");
			}
		}
	}

}
