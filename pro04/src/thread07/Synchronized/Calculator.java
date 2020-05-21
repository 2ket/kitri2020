package thread07.Synchronized;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 21.
 * @Description : 
 */
public class Calculator {		//공유클래스
	private int money;

	public int getMoney() {
		return money;
	}

	//동기화 메소드
	public synchronized void setMoney(int money) {	//임의 영역 : 단 하나의 스레드만 공유객체 실행 가능
		this.money = money;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+money); //현재 이 클래스를 가져다 쓸 쓰레드의 이름이 궁금할때 출력
	}
	
}
