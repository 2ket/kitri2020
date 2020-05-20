package io06.Thread;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 20.
 * @Description : call back 함수
 */
public class Alphabet01 extends Thread{	//자식스레드 혹은 부 스레드
	public void run() {	//call back함수 : 개발자가 호출하는 함수가 아니라, 로직에 의해서 시스템이 직접 호출하는 함수
		for(char i='A'; i<='z';i++) {
			System.out.print(i+"\t");
			if(i=='Z') System.out.println();
		}
		System.out.println();
	}
}
