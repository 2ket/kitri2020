package api08.Quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		HashMap<String, String> hs=new HashMap<String, String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.print("이름 : ");
			String name=sc.next();
			System.out.print("전화번호 : ");
			String bunho=sc.next();
			hs.put(name, bunho);
			System.out.println();
		}
		System.out.print("전화번호를 검색할 이름을 입력하세요 : ");
		String key=sc.next();
		
		if(hs.containsKey(key)) {
			System.out.println(key+"의 전화번호는 "+hs.get(key)+"입니다.");
		}else {
		System.out.println("해당 이름이 없습니다.");
		}
	}

}
