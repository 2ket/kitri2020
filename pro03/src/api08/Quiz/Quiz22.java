package api08.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> array=new ArrayList<Character>();
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 학점 입력: ");
			char ch=sc.next().charAt(0);
			array.add(ch);
		}
		System.out.println();
		
		for(int i=0; i<array.size(); i++) {
			String hakjum=null;
			switch(array.get(i)) {
			case 'A': hakjum="4.0"; break;
			case 'B': hakjum="3.0"; break;
			case 'C': hakjum="2.0"; break;
			case 'D': hakjum="1.0"; break;
			case 'F': hakjum="0"; break;
			default:System.out.println("학점을 잘못 입력하셨습니다.");
			}
			
			System.out.println((i+1)+"번째 학점: "+array.get(i)+"="+hakjum);
			
		}
	}
}
