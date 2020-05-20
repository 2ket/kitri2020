package thread02.Deamon;

public class DeamonEx02 {

	public static void main(String[] args) {
		AutoSave autoSave=new AutoSave();
		autoSave.setDaemon(true);	//defalt=>setDaemon(false)상태. 기본스레드의 형태. 종속스레드의 경우 setDaemon(true)
		autoSave.start();
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
