package ch02.control;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 28.
 * @Description : 구구단을 입력받아서 출력(계속 입력 받을지 말지 물어볼것, N=중지, do while로 진행) 
 */
import java.util.Scanner;
public class Exam12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char ch=0;
		do {
			System.out.print("구구단을 입력하세요: ");
			int dan=sc.nextInt();
			
			for(int i=1; i<=9 ; i++) {
				System.out.println(dan + " * " + i + " = "+(dan*i));
			}
			System.out.println();
			
			System.out.println("다시 하겠습니까? (중지 N)");
			String str=sc.next();
			ch=str.charAt(0);
		}while(ch != 'N');
		System.out.println("종료되었습니다.");
		
		sc.close();
	}

}
