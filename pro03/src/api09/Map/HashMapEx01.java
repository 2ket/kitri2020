package api09.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * @Author : 김경은
 * @Date : 2020. 5. 14.
 * @Description : 	키와 값을 쌍으로 이루어져 있다.
 * 					AbstractMap - HashMap
 * 
 */
public class HashMapEx01 {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
//		HashMap<String, String> map=new HashMap<String, String>();
		map.put("spring", "봄");
		map.put("summer","여름");
		map.put("fall", "가을");
		map.put("winter", "겨울");
		System.out.println(map.get("fall"));
		
		//key값을 추출해서 Set에 저장
		Set<String> set=map.keySet();
		System.out.println(set);
		
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
//			System.out.println(iter.next());
			System.out.println(map.get(iter.next()));
		}
		System.out.println();
		
		HashMap<Integer, Double> hashMap=new HashMap<Integer, Double>();
		hashMap.put(10, 55.5);
		hashMap.put(20, 66.6);
		hashMap.put(30, 77.7);
		System.out.println(hashMap);
		
//		Set<Integer> s=hashMap.keySet();
//		Iterator<Integer> iterator=s.iterator();
		Iterator<Integer> iterator=hashMap.keySet().iterator();//한번에 써도 됨
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());	//key
//			System.out.println(hashMap.get(iterator.next()));	//hashMap의 겟(키값)
			double su=hashMap.get(iterator.next());
			System.out.print(su+"\t");
		}
		System.out.println();
		
		//추가
		hashMap.put(40, 88.8);
		//교체
		hashMap.replace(10, 1000.10);
		//삭제
		hashMap.remove(20);
		System.out.println(hashMap);
		
	}

}
