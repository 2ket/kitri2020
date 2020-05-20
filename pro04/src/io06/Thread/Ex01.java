package io06.Thread;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 20.
 * @Description : 	1) Process는 하나의 프로그램을 말한다.
 * 					2) OS에서 두개이상의 프로그램이 실행하면 멀티태스킹(multitasking)이라 한다. (하나의 컴퓨터 여러개의 프로그램이 동시에 실행) ex) 한글, 메모장 킨경우
 * 					3) Thread는 하나의 작업이다. 멀티Thread는 하나 이상의 작업(하나의 프로그램 안에서) ex) 카톡창에서 음악듣고 대화 주고받기
 * 
 * 시간이 있는것(단일쓰레드) ex)쪽지같은것 가야 답장 확인
 * 채팅(멀티쓰레드) ex) 채팅같이 계속 주고받는것
 * 
 * Thread 관련
 * 1)Thread를 하려면 extends로 다 상속받고
 * 2)run() 재정의(오버라이딩)
 * 3)start() 메소드를 통해 같이 굴러가진다.
 * 
 * 메인, digit, alphabet 3개가 동시에 같이 올라가서 움직인다) (기존 메인함수 순서에 따른것이 아닌)
 * 
 */
public class Ex01 {
//Thread는 동시에 실행됨
	public static void main(String[] args) {	//부모 스레드
		Digit01 digit=new Digit01();
		digit.start();
		
		for(int i=1; i<=200; i++) {
			System.out.println("main function"+"\t");
		}
		
		
		Alphabet01 alpha=new Alphabet01();
		alpha.start();	//자식스레드 객체를 만들어 그 안에 run함수를 만들어두고 start()메소드를 사용하여 run함수를 호출한다
//		마우스를 클릭하면 이벤트가 발생하여 그 함수를 찾아가는것. 이런것을 콜백 함수라고 한다.
	}

}
