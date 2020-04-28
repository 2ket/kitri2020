package ch03.array;

public class Exam14 {

	public static void main(String[] args) {
		int x=10;
		int y=x;
		int z=y;
		
		System.out.println(x+"\t"+y+"\t"+z);
		
		
		//new 로 선언하면 hep영역으로 넘어감
		int[] array = new int[] {1, 2, 3, 4, 5};
		int a = array[2];
		System.out.println(a);
		
		int[] b = array;
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+"\t");
			
		}
		System.out.println();
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+"\t");
		}
		
		array=null; //stack 공간 절약을 위해 null로 초기화
		b=null;
		
		
		
	}

}
