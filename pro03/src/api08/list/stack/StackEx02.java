package api08.list.stack;

import java.util.Stack;

public class StackEx02 {

	public static void main(String[] args) {
		Stack<Coin> coin=new Stack<Coin>();
		coin.push(new Coin(100));
		coin.push(new Coin(50));
		coin.push(new Coin(70));
		coin.push(new Coin(60));
		
		while(!coin.isEmpty()) {
			Coin c=coin.pop();
			System.out.println(c.getValue());
		}
	}

}
