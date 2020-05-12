package api02.Class;

public class ActionMain {

	public static void main(String[] args) throws Exception{
		ReceiveAction r=new ReceiveAction();
		r.execute();
		
		SendAction s=new SendAction();
		s.execute();
		
		Action action=new ReceiveAction();
		action.execute();
		action=new SendAction();
		action.execute();
		
		System.out.println("----------------------");
		
		Class<?> clazz=Class.forName("api02.Class.ReceiveAction");
		ReceiveAction obj=(ReceiveAction) clazz.getDeclaredConstructor().newInstance();
		obj.execute();
		
		String[] classArray=new String[] {"api02.Class.ReceiveAction", "api02.Class.SendAction"};
		System.out.println("======================");
		for(int i=0; i<classArray.length;i++) {
			Class<?> cla=Class.forName(classArray[i]);
			Action ac=(Action)cla.getDeclaredConstructor().newInstance();	//인터페이스 Action으로 업캐스팅
			ac.execute();
		}//천개의 클래스를 다 담을수 있게 오버라이딩이 필수
	}

}
