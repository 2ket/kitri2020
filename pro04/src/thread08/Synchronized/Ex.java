package thread08.Synchronized;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 21.
 * @Description : 
 * 
 * 9. yield
 * 	다른 스레드에게 실행 양보하고 자신은 실행 대기로 상태로 가는 yield() 메소드를 제공
 * 전체 프로그램 성능에 도움이 된다.
 * 
 * 10. Synchronized
 * 단하나의 스레드만 실행 할 수 있는 메소드 또는 블록을 말한다.
 * 다른 스레드는 메소드나 블록이 실행이 끝날 때 까지 대기해야 한다.
 * 동기화 메소드 public Synchronized void method(){ 임계영역	}
 * 동기화 블록    public void method(){
 * 				synchronized(공유객체 this){	임계영역	} 	}
 */
public class Ex {

	public static void main(String[] args) {
		Toilet toilet=new Toilet();
		
		Family father=new Family(toilet);
		father.setName("아빠");
		father.start();
		
		Family mother=new Family(toilet);
		mother.setName("엄마");
		mother.start();
		
		Family sister=new Family(toilet);
		sister.setName("누나");
		sister.start();
		
		Family brother=new Family(toilet);
		brother.setName("형");
		brother.start();
		
		Family me=new Family(toilet);
		me.setName("나");
		me.start();
	}

}
