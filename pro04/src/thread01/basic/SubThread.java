package thread01.basic;

public class SubThread extends Thread{
	public static boolean inputCheck=false;
	
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			if(SubThread.inputCheck) return;
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("데이터가 입력되지 않았습니다.");
		System.exit(0);
	}
}
