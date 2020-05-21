package thread09.Notify;
 
/**
 * @Author : 김경은
 * @Date : 2020. 5. 21.
 * @Description : 
 */
public class WorkData {
	public synchronized void method() {	//동기화 함수
		System.out.println(Thread.currentThread().getName()+" : method() 작업실행");
		notify();		//일시정지 깨워줌
		try {
			wait();		//일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void sub() {	//동기화 함수
		System.out.println(Thread.currentThread().getName()+" : sub() 작업실행");
		
		notify();		//일시정지 깨워줌
		try {
			wait();		//일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
