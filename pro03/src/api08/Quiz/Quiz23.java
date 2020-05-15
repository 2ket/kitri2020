package api08.Quiz;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz23 {
	public static void main(String[] args) {
		ArrayList<Integer> arr =new ArrayList<Integer>();
		
		for(int i=0; i<20; i++) {
			arr.add(i+1);
		}
		
		Iterator<Integer> iterator=arr.iterator();
		while(iterator.hasNext()) {
			int value=iterator.next();
			System.out.print(value+"\t");
			if(value%10==0) {
				System.out.println();
			}
		}
	}
}
