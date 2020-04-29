package ch05.object.test;

class Birthday{
	private int year;
	private int month;
	private int day;
	private String name;
	
	public Birthday(int year, int month, int day, String name) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.name=name;
	}
	public void disp() {
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(name);
	}
	
}
//함수는 객체발생 후에 함수 선언 호출(초기화가 한번더 발생)
//생성자는 객체가 생성되면서 던져짐. 속도면에서 더 빠름 반드시 써야하는 경우가 있는데 다음주에 수업.(static)
//객체가 발생된 후 함수에 던져주는 방식 & 객체 발생되면 무조건 전달되는 방식
public class Exam22 {
	public static void main(String[] args) {
		Birthday b=new Birthday(2010, 12, 25, "홍길동");
		b.disp();
	}
}
