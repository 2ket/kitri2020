package api12.Exception;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : Exception 상위클래스 Throwable
 */
public class Ex09 {

	public static void main(String[] args) {
		try {
			int su=Integer.parseInt(args[0]);
			int value=Integer.parseInt(args[1]);
			
			int div=su/value;
			System.out.println(div);
		}catch(Throwable e) {
			System.out.println("에러발생(숫자, 0, 배열수 확인)");
		}finally {
			System.out.println("모든 예외처리를 끝냈다.");
		}
	}

}
