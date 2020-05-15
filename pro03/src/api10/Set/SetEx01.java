package api10.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 15.
 * @Description :	Set은 수학의 집합을 생각하면 된다. 중복값 처리x, 저장순서 유지x.
 *  				Map : Key, Value / 중복값 처리o, 중복 키x, 저장 순서 유지x.
 *  				List : Index 값 / 중복값 처리o, 저장순서 유지o.
 */
public class SetEx01 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("strawberry");
		set.add("apple");
		System.out.println(set);	//중복값인 apple이 하나만 나옴
		set.remove("apple");
		System.out.println(set);	//중복값 apple 다 사라짐
		
		HashSet<Object> obj=new HashSet<Object>();
		obj.add(10);
		obj.add(24.5f);
		obj.add("apple");
		
		//순차 접근해서 객체를 리턴(반복자)
		Iterator<Object> iter=obj.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("melon");
		
		Iterator<String> i=list.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+"\t");
		}
		
	}
}
