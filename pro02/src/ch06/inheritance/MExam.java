package ch06.inheritance;
/**
 * @Author : 김경은
 * @Date : 2020. 5. 8.
 * @Description : 클래스 상속과 인터페이스 상속 동시에 하기
 */

interface AB{}
interface BC{}

class DF{
	
}
class sub extends DF implements AB,BC{//클래스는 두개 상속 못받음. 인터페이스는 여러개 상속가능
	
}

public class MExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
