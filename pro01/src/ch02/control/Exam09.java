package ch02.control;

public class Exam09 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;//if문을 제외한 가장 가까운 블럭 밖으로 빠진다.
			}
			
			System.out.println(i);
		}
		int su=5;
		if(su==5) {
			//break;  	//if문 단독으로 break 사용할 수 없다
		}
		
		
		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
