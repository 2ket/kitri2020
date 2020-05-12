package api02.Class;

public class CarMain {

	public static void main(String[] args) throws Exception{
		Car car=new Car("그랜저", "강사");
		System.out.println(car.toString());
		
		Class<?> a=car.getClass();
		System.out.println(a.getName());
		System.out.println(a.getSimpleName());
		System.out.println(a.getPackageName());

		
		Car c=new Car();
		c.setModel("소나타");
		c.setOwner("김경은");
		System.out.println(c.getModel()+"\t"+c.getOwner());
		System.out.println(c.toString());
		
		//동적객체생성 - 풀패키지명 문자열
		String str="api02.Class.Car";	//클래스명
		Class<?> cls=Class.forName(str);	//str의 클래스명을 가진 클래스 찾기. 뭐로 넘어올지 모르니까 ?로 받기
		Car obj=(Car)cls.newInstance();	//동적객체생성
		Car obj1=(Car)cls.getDeclaredConstructor().newInstance();
		
		obj.setModel("아반떼");
		obj.setOwner("지명관");
		System.out.println(obj.toString());
	}

}
