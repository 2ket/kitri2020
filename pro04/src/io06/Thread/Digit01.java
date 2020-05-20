package io06.Thread;

public class Digit01 extends Thread{
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.print(i+"\t");
			
			if(i%10==0) System.out.println();
		}
		System.out.println();
	}
}
