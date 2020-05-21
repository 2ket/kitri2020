package thread04.Stop;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 21.
 * @Description : 스레드 정지
 */

class PrintThread extends Thread {
	private boolean stop = false;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		System.out.println("stop: "+stop);

		while (!stop) {

			System.out.println("실행중..."+stop);

			try {
				sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("자원종료...");
			System.out.println("실행 종료... stop: "+stop);
		}
	}
}

public class StopEx {
	public static void main(String[] args) {
		PrintThread print = new PrintThread();
		print.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);

//			if(i==3) print.stop();	//갑작스런 중단에 자원반납이 어려워 이제는 쓰이지 않는다. 
			if(i==3) {print.setStop(true);break;}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
