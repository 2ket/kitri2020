package ch05.object.test;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 6.
 * @Description : final 지정예약어
 * 
 * 값이 바뀌지 말아야할것에 final 사용.
 */

class II{
	private int x;
	private static int value;
	private final double PI=3.141592;
	private static final double RPI=3.141592;//static함수에서도 호출가능한 final 변수 = static final 변수
	
	public void sub() {
		int y=20;
//		static int su=100;	//이런식으로는 사용안함 static은 아예 지역변수로 쓸 수 없음. 전역변수 전용
		System.out.println(x+"\t"+this.x+"\t"+y);
		System.out.println(value+"\t"+II.value);
		
		final int R=25;	//값이 치환하지 않는다.
		y=77;
		value=88;
//		R=50;	//ERROR
		
		System.out.println(R+"\t"+PI);
	}
	
	public static void fun() {
		int su=100;
		System.out.println(su);
		
//		System.out.println(x);	//ERROR:static함수 안에서 전역변수 호출은 static 전역변수만 호출 가능하다
		System.out.println(value);
		
//		System.out.println(PI);	//static함수에선 밖에서 선언된 final 변수는 호출 불가. static함수 내에서 생성된 final 변수는 가능
		System.out.println(RPI);
	}
	
}
public class Exam31 {

	public static void main(String[] args) {
		II ii=new II();
		ii.sub();
		System.out.println("------------------------------------------------");
		II.fun();
	}

}
