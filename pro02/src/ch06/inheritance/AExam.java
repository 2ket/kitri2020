package ch06.inheritance;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 7.
 * @Description : 클래스 3대 특징 : 은닉화, 중복성, 상속성
 * 					자바에서 만들어진 모든 클래스는 Object 클래스를 상속받는다.
 */
public class AExam {

	public static void main(String[] args) {
		AParents ap=new AParents();
		ap.sub();
		
		ASon as=new ASon();
		as.setData(10, 20, 30, 40);
		as.disp();
//		as.hashCode();//Object 클래스에서 만들어진 함수를 자동으로 쓸 수 있는 이유. 클래스 상속을 받았기 때문
		
	}

}
