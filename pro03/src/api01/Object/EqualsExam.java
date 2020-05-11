package api01.Object;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description :	주소값과 데이터값 비교. Member 클래스의 오버라이딩
 */
public class EqualsExam {

	public static void main(String[] args) {
		String a="hi";
		String b="hi";	//String은 값이 같으면 동일 주소를 갖는다.
		
		if(a==b) {	//data값 비교가 아닌 data 주소 비교
			System.out.println("주소값 비교");
		}
		
		if(a.equals(b)) {
			System.out.println("데이터비교");
		}
		String x=new String("hi");
		String y=new String("hi");	//new 사용시 새로운 주소값 할당
		
		if(x==y) {
			System.out.println("주소값 비교");
		}
		if(x.equals(y)) {
			System.out.println("데이터비교");
		}
		System.out.println("=================================");
		Member kim=new Member("abc123", "pw123");
		Member lee=new Member("abc123", "pw123");
		
		if(kim==lee) {
			System.out.println("주소값 비교 같음");
		}else {
			System.out.println("주소값 비교 같지 않음");
		}
		
		if(kim.equals(lee)) {
			System.out.println("데이터 비교");
		}
	}

}
