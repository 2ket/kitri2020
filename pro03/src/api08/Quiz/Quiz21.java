package api08.Quiz;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz21 {
	public static void main(String[] args) {
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print("나라 : ");
			String country=sc.next();
			System.out.print("인구 : ");
			int population=sc.nextInt();
			hs.put(country, population);
			
		}
		
		System.out.print("검색할 나라의 이름을 입력하세요: ");
		String key=sc.next();
		Iterator<String> iterator=hs.keySet().iterator();
		DecimalFormat df=new DecimalFormat("#,###");
		
		while(iterator.hasNext()) {
			if(key.equals(iterator.next())) {
				System.out.println(key+"의 인구는 "+df.format(hs.get(key))+"명 입니다.");
			}
		}
	}
}
