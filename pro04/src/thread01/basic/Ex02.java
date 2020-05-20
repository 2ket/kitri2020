package thread01.basic;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 20.
 * @Description : 
 * 
 * 스레드의 실행을 start()로 호출하는 이유 : 동시에 실행하기 위해서.
 * run()함수로 호출할 경우 오버라이딩 된 함수(스레드)가 순차적으로 실행되기 때문에,
 * start()함수를 이용하여 재정의된 run()함수가 "로직에 의해 시스템이 직접 호출하여" 동시에 스레드를 실행한다. = call back함수
 */
public class Ex02 {

	public static void main(String[] args) {
		
		InputThread it=new InputThread();
		it.run();
		SubThread st=new SubThread();
		st.run();
	}

}
