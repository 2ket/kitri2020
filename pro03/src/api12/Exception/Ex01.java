package api12.Exception;

import java.util.InputMismatchException;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : 	Exception - 예외처리, 예외전가, 예외발생
 */

import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		try {
			System.out.print("정수형을 입력하세요: ");
			int x=sc.nextInt();
			System.out.print("정수형을 입력하세요: ");
			int y=sc.nextInt();
			
			//유효성 검사가 필요. y에 0이들어오거나 정수형외의 숫자 혹은 문자가 들어올 시 대비
			//사용자가 실수로 에러를 낼 수 있을 곳을 대비하는것 - Exception
			//try-catch를 행단 정수점 해서 행단으로 뿌려주는 연습 할거에요(spring가서)
			int div=x/y;
			System.out.println("나눗셈: "+div);
		}catch(ArithmeticException e) {	//콘솔에 나오던 에러 메세지를 e객체에 담아 다른 화면을 보여주는 것
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("정수형만 입력할 수 있습니다.");
		}
		
		sc.close();
	}

}
