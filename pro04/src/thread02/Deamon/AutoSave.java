package thread02.Deamon;

public class AutoSave extends Thread{
	public void save() {
		System.out.println("작업을 저장하였습니다.");
	}
	@Override
	public void run() {
		 while(true) {
			 try {
				 sleep(500); //500 : 0.5초, 1000: 1초
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
			 
			 save();
		 }
	}

}
