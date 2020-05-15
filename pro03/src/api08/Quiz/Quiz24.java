package api08.Quiz;

import java.util.Scanner;
import java.util.Vector;

public class Quiz24 {
	public static void main(String[] args) {
		Vector<Double> vec=new Vector<Double>();
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 수를 입력하세요 : ");
			vec.add(sc.nextDouble());
		}
		double max=0;
		for(int i=0; i<vec.size();i++) {
			if(vec.get(i)>max) {
				max=vec.get(i);
			}
		}
		System.out.println("가장 큰수는 : "+max);
	}
}
