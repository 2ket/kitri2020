package thread03.join;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 20.
 * @Description : Join - 다른 스레드가 종료할 때까지 해당 스레드를 일시정지
 */
public class JoinEx {

	public static void main(String[] args) {
		Sum sum=new Sum();
//		sum.run();		//main 합:5050, 합:5050
		sum.start();	//main 합: 0, 합:5050
		try {
			//Sum클래스 스레드가 종료 할때까지 JoinEx스레드 일시정지 한다.
			sum.join();		//합: 5050, main 합:5050 (메인 스레드가 나중에 실행되므로 출력역시 나중에)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 합 : "+sum.getSum());
	}

}
