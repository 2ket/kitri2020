package ch06.bb;
import ch06.aa.AA;
/**
 * @Author : 김경은
 * @Date : 2020. 5. 8.
 * @Description : 다른 패키지에서 호출하기
 */
public class DD {

	public static void main(String[] args) {
		AA a=new AA();
		
//		System.out.println(a.x);	//private는 클래스가 달라지면 사용할 수 없음
//		System.out.println(a.y);	//protected는 패키지가 달라지면 사용할 수 없음
		System.out.println(a.z);	//public 언제든 가능하다.
//		System.out.println(a.su);	//default는 패키지가 달라지면 사용할 수 없음
	}

}
