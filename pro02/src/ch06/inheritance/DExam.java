package ch06.inheritance;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 7.
 * @Description : 생성자 상속
 */
public class DExam {

	public static void main(String[] args) {
		DSon a=new DSon();
		DSon b=new DSon(10);
		DSon c=new DSon(77,88);
		
		a.showPoint();
		b.showPoint();
		c.showPoint();
	}

}
