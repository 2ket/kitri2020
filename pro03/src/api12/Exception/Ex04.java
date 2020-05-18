package api12.Exception;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : ArrayIndexOutOfBoundsException 에러
 */
public class Ex04 {

	public static void main(String[] args) {
		
		try {
		String su=args[0];
		String value=args[1];
		
		System.out.println(su);
		System.out.println(value);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열수가 제대로 입력되지 않습니다.");
		}
		//args에 전달되는 값이 출력하려는 것보다 갯수가 적을경우 ArrayIndexOutOfBoundsException 에러 발생
		//에러 처리 -  에러가 발생했을때 생성된 Exception 에러 문구를 try/catch로 처리해주는 것.
	}

}
