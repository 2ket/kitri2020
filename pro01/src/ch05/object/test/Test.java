package ch05.object.test;

public class Test {
	private String name;
	private int age;
	private float ki;
	
	//들어오는건 setter, 나가는건 getter
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setKi(float ki) {
		this.ki=ki;
	}
	public float getKi() {
		return ki;
	}
}
