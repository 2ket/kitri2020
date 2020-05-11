package api01.Object;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description : 	Member클래스의 업캐스팅/다운캐스팅으로 데이터값 비교, 
 * 					Object클래스의 함수들 오버라이딩
 */
public class Member {
	private String id;	//abc123, pw123
	private String pwd;
	
	public Member(String id, String pwd) {
		this.id=id;
		this.pwd=pwd;
	}
	@Override
	public boolean equals(Object obj) {//lee	abc123, pw123
		if(obj instanceof Member) {	//Member클래스가 obj 형태와 같니?
			Member mEq=(Member) obj;	//다운캐스팅
			if(id.equals(mEq.id) && pwd.equals(mEq.pwd)) {//Member class의 id와 mEq의 id와 같은지 확인
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return id+", "+pwd;
	}
}
