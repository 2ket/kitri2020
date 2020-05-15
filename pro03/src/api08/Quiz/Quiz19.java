package api08.Quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.print("좋아하는 커피를 3가지 입력하세요: ");
			String coffee=sc.next();
			hs.add(coffee);
		}
		System.out.println();
		System.out.println("입력하신 커피는: "+hs.size());
		Iterator<String> iterator=hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
