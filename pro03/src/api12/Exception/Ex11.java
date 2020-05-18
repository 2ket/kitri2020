package api12.Exception;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : 	예외 전가
 */

class Sub{
	public void fun() throws Throwable{
		Throwable ex=new Throwable();
		throw ex;
		
//		System.out.println("Sub Fun 입니다.");
	}
	
	public void method() throws Throwable{
		System.out.println("Sub Method입니다.");
		fun();
	}
}
public class Ex11 {
	public static void main(String[] args) throws Throwable{
		Sub sub=new Sub();
		
		sub.method();
	}

}
