package ch06.inheritance;

class Parent{
	public String nation;
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	public Parent(String nation) {
		this.nation=nation;
		System.out.println("Parent(String nation) call");
	}
}

class Child{
	private String name;
	public Child() {
		this("홍길동");
		System.out.println("child() call");
	}
	public Child(String name) {
		this.name=name;
		System.out.println("child(String name) call");
	}
}

public class QChildExample {
	public static void main(String[] args) {
		Child child=new Child();
	}

}
