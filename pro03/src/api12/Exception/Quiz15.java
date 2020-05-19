package api12.Exception;

import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 19.
 * @Description : 예외만들기 예제
 */
public class Quiz15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		try {
			String su=sc.next();
			if(su.length()!=10) {
				NumberFormatException ex=new NumberFormatException();
				throw ex;
			}
			System.out.println("입력하신 수는 "+su+" 입니다.");
		}catch(NumberFormatException e) {
			System.out.println("에러발생!! 정확히 10자리만 입력 가능합니다.");
		}
	}

}
