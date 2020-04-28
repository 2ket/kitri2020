package ch02.control;

public class Exam10 {

	public static void main(String[] args) {

		int i=1;
		
		while(i<=10) {
			if(i==5) break;
			
			System.out.println(i);
			++i;
		}
		
		
		int j=0;
		
		while(j<=10) {
			++j;
			if(j==5) continue;
			
			System.out.println("j: "+j);
		}
		
		int k=0;
		do {
			++k;
			
			if(k==5) continue; //break;
			System.out.println(k);
		}while(k<=10);
	}

}
