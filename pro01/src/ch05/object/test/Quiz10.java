package ch05.object.test;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 6.
 * @Description : 
 */

class Member{
	private String name;
	private String id;
	private String password;
	int age;
	
	public Member(){
	}
	
	public boolean login(String id, String password) {
		this.id=id;
		this.password=password;
		if(id=="hong" && password=="1234") {
			return true;
		}else {
			return false;
		}
	}
	public void logout(String id) {
		this.id=id;
		System.out.println(id+" 로그아웃되었습니다");
	}
	
}
public class Quiz10 {

	public static void main(String[] args) {
		Member m=new Member();
		boolean check=m.login("hong", "1234");
		if(check==true) {
			m.logout("hong");
		}
	}

}
