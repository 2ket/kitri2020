package api08.Collection;

import java.util.ArrayList;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 14.
 * @Description :	컬렉션은 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 
 * 					java.util 패키지에 관련된 인터페이스와 클래스를 포함시켜 놓았다.
 * 					이를 총칭해서 컬렉션 프레임워크라고 부른다.
 * 
 * 			1) List : ArrayList, Vector, LinkedList, Stack, Queue 등등
 * 			2) Set : HashSet, TreeSet 등등
 * 			3) Map : HashMap, HashTable, TreeMap, Properties 등등
 * 
 * ArrayList는 본인의 주소와 양옆의 주소를 자동으로 가져 다중 주소를 가지고있다. -> 삭제추가가 가능한 이유.
 * 
 */
public class ArrayList01 {

	public static void main(String[] args) {
		//List : 순서를 가지고 있다. (예측 가능)
		//상속 : AbstractCollection - AbstractList - Arraylist
		
		//Stack구조 Last Input이 first OutPut 되는 예 : 뒤로가기, 실행취소(Ctrl+z)
		//		: 취소하면 가장 마지막으로 행한 행동이 나옴
		//Queue : 먼저 들어간게 먼저 나오는것 예 : 프린트
		
		String a="apple";
		String b="banana";
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add(a);
		list.add(b);
		list.add("JSP");
		list.add("Oracle");
		
		System.out.println("저장갯수: "+list.size());
		System.out.println("2번지 객체 얻기: "+list.get(2));
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str=list.get(i);
			System.out.println(str);
//			System.out.println(list.get(i));
		}
		//추가
		list.add("사과");
		//특정 번지 추가
		list.add(1, "바나나");
		for(int i=0; i<list.size(); i++) {
			String str=list.get(i);
			System.out.println(str);
		}
		
		//교체
		list.set(3, "안녕하세요");
		System.out.println(list);
		
		// 삭제
		list.remove(0);
		System.out.println(list);
		System.out.println();
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);	//10이라는 정수형이지만 Integer클래스로 들어감 = autoBoxing,
					//Integer a=new Integer(300);
		//Integer보다 상위 클래스인 Number를 쓰는경우도
		System.out.println(arr+"\n\n");
		
		ArrayList<Object> brr=new ArrayList<Object>();
		//Object도 많이 들어감. 모든 클래스의 상위 클래스이기 때문에
		//주로는 내가 만든 사용자클래스를 많이 담음
		brr.add(22.2);
		brr.add(10);
		brr.add("apple");
		brr.add('A');
		System.out.println(brr);
		
		//가장많이쓰는거 ArrayList, 고급으로 가면 Map방식(key값으로 추출)
	}

}
