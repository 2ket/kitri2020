package api01.Object;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description : 	자료형 변수의 클래스형 선언, 함수 사용
 * 					getter/setter와 toString(데이터 누락 확인)
 */
public class StringExam {

	public static void main(String[] args) {
		String str="apple";
		//String은 형이 클래스형이다. str.후 Ctrl+space 눌렀을때 사용가능한 함수가 뜬다면 클래스. 안뜨면 자료형이다.
		int su=10;
		
		//자료형 변수를 클래스로서 쓰고싶다면 클래스 형태로 지정해야한다. int->Integer
		
		Integer value=new Integer(10);
		System.out.println(value.toString());
		
		Member member=new Member("abc123", "pw123");
		System.out.println(member.toString());
		
		Su s=new Su();
		s.setX(10);
		s.setY(20);
		s.setZ(30);
		
		System.out.println(s.toString());
	}

}
