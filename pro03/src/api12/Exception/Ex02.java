package api12.Exception;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : Exception 예제
 */
public class Ex02 {

	public static void main(String[] args) {
		String su="100";
		String value="a200";
		
		try {
			int isu=Integer.parseInt(su);
			int ivalue=Integer.parseInt(value);
			int result=isu+ivalue;
		
			System.out.println("result: "+result);
		}catch(NumberFormatException e) {
			System.out.println("숫자를 정확히 입력하세요.");
		}
	}

}
