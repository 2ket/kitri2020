package thread10.Notify;

import java.util.Stack;

public class AutoMachine {
	private Stack<String> store=new Stack<String>();
	
	public synchronized void setDrink(String drink) {
		if(!store.isEmpty()) {
			notify();
		}
		store.push(drink);
	}
	public synchronized String getDrink() {
		while(store.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return store.pop();
	}
}
