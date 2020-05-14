package api08.list.stack;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 14.
 * @Description : Queue//Interface 자기클래스의 객체를 못만듬. 순서를예측할 수 있음.
 */
import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
//		LinkedList<Integer> queue=new LinkedList<Integer>();		//둘중 편한걸로 해도 됨. Queue상위라 가능
		queue.offer(10);	//FIFO : First In First Out
		queue.offer(20);
		queue.offer(30);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()+"\t"+queue.size());
		}
		
		queue.offer(77);
		queue.offer(88);
		queue.offer(99);
		queue.offer(100);
		
		LinkedList<Integer> lk=new LinkedList<Integer>();
		lk.offer(77);
		lk.offer(88);
		lk.offer(99);
		lk.offer(100);
		System.out.println(lk.getFirst());
		System.out.println(lk.getLast());
		
		lk.addFirst(1);
		lk.addLast(2);
		System.out.println(lk.toString());
		lk.removeFirst();
		lk.removeLast();
		System.out.println(lk.toString());
	}

}
