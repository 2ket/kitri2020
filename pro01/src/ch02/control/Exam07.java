package ch02.control;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 28.
 * @Description : 반복문 
 */
public class Exam07 {
	public static void main(String[] args) {
		for(int i=1; i<=10;i++) {//(초기값;조건값;마지막값){}
			System.out.println("How are you?");
		}
		for(int i=1; i<=10; i++) {
			System.out.print(i+ "\t");
		}
		
		for(int i=10; i>=0; i-=3) {
			//System.out.println("How are you?");
			System.out.print(i+ "\t");
		}
		System.out.println();
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		
		int hap=0;
		for(int i=1; i<=10; i++) {
			hap+=i;
		}
		System.out.println(hap);
		
		//배열은 추가 삭제가 안됨 수치반복에 쓰는게 배열. linked list가 그래서 나옴
		//
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+"-"+j+" ");
			}
			System.out.println();
		}
		
	}
}
