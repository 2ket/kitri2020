package api09.Map;
import java.util.HashMap;
import java.util.Map;


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
		
	}

}
