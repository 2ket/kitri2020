package ch05.object.saram;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 29.
 * @Description : 클래스 3대 특징 : 은닉화, 함수중복, 상속성
 */
public class Exam19 {

	public static void main(String[] args) {
		Saram hong = new Saram();
		hong.input("홍길동", "구로구", "010-123-1234", "123456-1234567");
		
		hong.output();
		
		Saram cho=new Saram();
//		cho.name="조인성"; private name 이라서 에러남
		cho.address="이태원";
		cho.phoneNumber="010-2222-4444";
		cho.juminBunho="123456-1234567";
//		System.out.println(cho.name); ERROR
		System.out.println(cho.address);
		
		
	}

}
