package ch03.array;

import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 28.
 * @Description : 변수는 한개의 데이터만 저장하지만, 배열은 같은 타입의 데이터를 
 * 				     연속된 공간에 저장하므로 속도면에서 좋다. 각 데이터는 인덱스를 부여한다.
 */
public class Exam13 {

	public static void main(String[] args) {
		char[] ch = new char[] {'A', 'B', 'C'};
		
		for(int i=0; i<3; i++) {
			System.out.println(ch[i]);
		}
		System.out.println(ch.length);
		
		int[] array=new int[] {1, 2, 3, 4, 5};
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		int su;
		//System.out.println(su); //ERROR 초기화 안됨
		
		int[] b = new int[5]; //20byte 0으로 초기화됨
		System.out.println(b[1]);
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<b.length; i++) {
			System.out.print("정수형 입력: ");
			b[i]=sc.nextInt();
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		sc.close();
	}

}
