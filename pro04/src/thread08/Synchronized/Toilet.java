package thread08.Synchronized;

public class Toilet {	//공유클래스

	public void openDoor(String name) {	//임의영역 단하나의 스레드만 실행
		
		synchronized (this) {	//동기화 블럭
			System.out.println(name+" 화장실 입장");
			for(int i=0; i<2000; i++) {
				if(i==100) System.out.println(name+": 시원하다 끄응");
			}
			
			System.out.println(name+" 화장실 퇴장");
		}
	}
}
