package ch06.inheritance;

public class CExam {

	public static void main(String[] args) {
		CaptionTV ctv=new CaptionTV(true, 11, true);
		ctv.channelUp();
		ctv.display("캡처화면을 보여줍니다");
		
		CaptionTV ct=new CaptionTV(true,7,false);
		ct.channelDown();
		ct.display("캡처화면을 보여줍니다.");
		
		System.out.println(CaptionTV.su);
		System.out.println(++CTV.su);
		//static은 this super개념이 아니라 클래스로 접근하기 떄문에 상속하는 클래스던 상속받는 클래스던 둘다 클래스로 접근하면 호출이 가능하다
	}

}
