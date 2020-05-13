package api04.Wrapper;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 13.
 * @Description : 	Wrapper클래스 : 기본타입(byte ~~~~ double, boolean) 값을 포장하는 객체
 * 					즉, 기본 자료형을 클래스로 제공
 */
public class AutoBoxing {

	public static void main(String[] args) {
		// Boxing, UnBoxing
		
		int su=10;
		Integer obj=su;		//AutoBoxing
		System.out.println(obj.toString());
		
		int value=obj;		//AutoUnBoxing
		System.out.println(value);
		
		int hap=obj+100;	//AutoUnBoxing으로 100을 더한것
		System.out.println(hap);
		System.out.println();
		
		Integer a=20;	//AutoBoxing	-128~-127 주소 공유
		Integer b=20;	//AutoBoxing	Integer b=new Integer(20)
		
		System.out.println("주소값비교:"+(a==b));
		System.out.println(a.equals(b));
		
		Integer c=300;
		Integer d=300;
		System.out.println("주소값비교:"+(c==d));
		System.out.println(c.equals(d));
		
		int y=10;
		Integer x=new Integer(y);
		int z=x.intValue();
		System.out.println(x+"\t"+y+"\t"+z);
	}

}
