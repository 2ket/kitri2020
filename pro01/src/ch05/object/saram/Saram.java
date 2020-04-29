package ch05.object.saram;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 29.
 * @Description : 클래스 3대 특징 : 은닉화, 함수중복, 상속성
 */
public class Saram {
	private String name;	//private는 내 소스 밖에서는 쓸 수 없음.-> 함수를 통해서만 접근가능
	public String address;
	public String phoneNumber;
	public String juminBunho;
	
	public void input(String n, String a, String p, String j) {
		name=n;
		address=a;
		phoneNumber=p;
		juminBunho=j;
	}
	
	public void output() {
		System.out.println(name+"\t"+address+"\t"+phoneNumber+"\t"+juminBunho);
		
	}
}
