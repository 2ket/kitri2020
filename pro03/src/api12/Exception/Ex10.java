package api12.Exception;

import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : 	예외발생(에러 만들어주기)
 */
public class Ex10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("수를 입력(숫자 5는 입력불가) : ");
			int su=sc.nextInt();
			
			if(su==5) {
				NumberFormatException ex=new NumberFormatException();
				throw ex;	//에러발생
				
			}
			System.out.println(su);
		}catch(NumberFormatException e) {
			System.out.println("5는 입력 불가합니다.");
		}finally {
			sc.close();
		}
	}

}
