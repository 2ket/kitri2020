package api08.list.stack;

import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		//FILO (First Input Last Output)
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(10);	//젤 먼저 들어갔으니 젤 나중에 나옴.
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop());	//30
		System.out.println(stack.pop());	//20
		System.out.println(stack.pop());	//10
//		System.out.println(stack.pop());	//ERROR
		
		Stack<String> strStack=new Stack<String>();
		strStack.push("사과");
		strStack.push("배");
		strStack.push("바나나");
		
		while(!strStack.isEmpty()) {
			System.out.println(strStack.pop());
		}
//		System.out.println(strStack.pop());	//ERROR
		
		
	}
}
