package ch06.inheritance;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 7.
 * @Description : 
 */

class AA{
	public void aa() {}
	public void bb() {}
	public void cc() {}
	public void dd() {}
	
	public void disp() {	//함수 선언
		System.out.println("hahahahaha"); //함수 내용
	}
}

class BB extends AA{	//aa(), bb(), cc(), dd() 필요하다면
	public void disp() {	//함수재정의(Overriding)	/ 함수중복(Overloading): 함수에 쓰이는 파라미터 다른거
		System.out.println("하하하하하");
		//상속받아서 부모의 함수를 고쳐쓰는 방식. 똑같이 쓰는경우 있긴하지만 고쳐쓰는 경우가 더 많음.
	}
}

//class CC extends BB{
//	
//}


public class GExam {
	public static void main(String[] args) {
		BB b=new BB();
		b.disp();
	}

}
