package api06.Quiz;

import java.util.Scanner;

public class Quiz27 {
	public static void main(String[] args) {
		String su1, su2;
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		su1=sc.nextLine();
		System.out.print("수를 입력하세요: ");
		su2=sc.nextLine();
		
		//내 풀이
		int num1, num2, sum;
		num1=Integer.parseInt(su1);
		num2=Integer.parseInt(su2);
		sum=num1+num2;
		System.out.println("sum: "+sum);
		sc.close();
		
		//더 간략한 강사님 풀이
		System.out.println("sum: "+(Integer.parseInt(su1)+Integer.parseInt(su2)));
	}
}
