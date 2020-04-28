package ch03.array;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 28.
 * @Description : DS에서 heap의 데이터는 stack 참조하고 있으면 소멸되지 않는다.
 * 				  stack은 블럭단위로 데이터가 생성과 소멸을 반복한다.
 */

public class Exam15 {
//static int value; 전역변수
	public static void main(String[] args) {
		int su=10;
		{
			int value=20; //지역변수
			System.out.println(su);
			System.out.println(value);
		}//블록이 끝남과 동시에 데이터 사라짐
		//웹브라우저 끝날때까지(혹은 끝나도) 데이터 유지하는 경우 : 인터넷 쿠키. 로그인 아이디, 구글.
		System.out.println(su);
//		System.out.println(value);
		//heap 영역과 stack 영역 차이 알아둘것
		
		int value=30;
		
		// 배열 선언 방법
		char[] a=new char[] {'A', 'B', 'C'};
		char b[] = new char[] {'A', 'B', 'C'};
		char[] c = {'A', 'B', 'C'};
//		char[] d=new char[]; ERROR new char[5]
		char[] d = new char[5];
		for(int i=0; i<5; i++) {
		System.out.println(d[i]);
		}
	}

}
