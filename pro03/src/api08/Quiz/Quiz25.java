package api08.Quiz;

import java.util.ArrayList;

public class Quiz25 {

	public static void main(String[] args) {
		Man a=new Man("홍길동", 25, "서울");
		Man b=new Man("임꺽정", 30, "광주");
		Man c=new Man("이순신", 23, "인천");
		
		ArrayList<Man> array=new ArrayList<Man>();
		array.add(a);
		array.add(b);
		array.add(c);
		
		for(int i=0;i<array.size(); i++) {
//			array.get(i).disp();
			//강사님 풀이
			Man result=array.get(i);
			result.disp();
		}
	}

}


class Man{
	private String name;
	private int age;
	private String address;
	
	public Man() {}
	
	
	public Man(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		
	}


	public void disp() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+address);
		System.out.println();
	}
}