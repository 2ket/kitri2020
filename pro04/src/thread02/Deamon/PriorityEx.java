package thread02.Deamon;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 20.
 * @Description :	
 * 					동시성(Concurrency) : 하나의 코어에서 멀티스레드가 번갈아가며 실행하는 것
 * 										어떤 순서에 의해 동시성으로 실행할 것인가를 결정하는 것을 스케쥴링(CPU)이라고 한다.
 * 					병렬성(Parallelism) : 멀티 코어에서 멀티작업을 동시에 실행하는 것
 */

class Example extends Thread{
	@Override
	public void run() {
		for(int i=0; i<2000000000;i++) {
			
		}
	}
}

public class PriorityEx {

	public static void main(String[] args) throws InterruptedException {
		// 쿼드 코어일 경우 스레드가 병렬성으로 실행될 수 있기 때문에 4개 이하의 스레드를 실행할 경우에는 우선순위 영향을 크게 받지 않는다.
		// 그러므로 4개 이상으로 테스트.
		for(int i=0; i<=10; i++) {
			Example example=new Example();
			example.setName("thread: "+i);
			
			if(i==5) {
				example.setPriority(Thread.MAX_PRIORITY); 	//10~1
			}
			
			if(i==3) {
				example.setPriority(Thread.MIN_PRIORITY);	//
			}
			
			if(i==10) {
				example.setPriority(5); 					//
			}
			
			
			example.start();
			Thread.sleep(1000);
			System.out.println(example.getName());
		}
	}

}
