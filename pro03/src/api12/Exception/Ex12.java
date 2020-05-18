package api12.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("정수형을 입력하세요: ");
			int x=sc.nextInt();
			System.out.print("정수형을 입력하세요: ");
			int y=sc.nextInt();
			
			int div=x/y;
			System.out.println("나눗셈: "+div);
		}catch(Exception e) {
			System.out.println("에러발생");
		}
		
		sc.close();
//		함수 하나에 try/catch 하나라고 생각하시면 좋아요
	}

}
