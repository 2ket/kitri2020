package api08.Collection;

import java.util.Vector;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 14.
 * @Description :	ArrayList와 Vector의 차이점은 ArrayList가 속도가 이론상 좀 빠르다
 * 					Vector는 스레드 동기화 처리에 적당하였으나
 * 					Collections.synchronizedList()로 ArrayList도 동기화 가능
 */
public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		
		System.out.println(vec.get(2));
		System.out.println(vec);
		
		vec.add(50);
		vec.add(2, 77);
		System.out.println(vec);
		vec.set(1, 99);
		System.out.println(vec);
		vec.remove(2);
		System.out.println(vec);
		System.out.println();
		
		for(int i=0; i<vec.size(); i++) {
			int su=vec.get(i);
			System.out.println(su);
		}
		System.out.println();
		for(Integer su:vec) {//for문의 확장
			System.out.println(su);
		}
//		for(데이터형 접근변수명 : 배열이나 컬렉션 변수명){}
		
	}

}
