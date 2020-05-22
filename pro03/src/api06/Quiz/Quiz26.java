package api06.Quiz;

import java.util.Scanner;

public class Quiz26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int answer=(int)(Math.random()*10)+1;
		System.out.println("answer: "+answer);
		
		int userNum=0;
		while(true) {
			System.out.print("1과 10사이의 값을 입력하세요: ");
			userNum=sc.nextInt();
			if(userNum==answer) {
				System.out.println("맞췄습니다. [입력값: "+userNum+", 랜덤값: "+answer+"]"); break;
			}else if(userNum<answer) {
				System.out.println("더 큰수를 입력하세요.");
			}else {
				System.out.println("더 작은수를 입력하세요.");
			}
		}
		
		sc.close();
	}
}
