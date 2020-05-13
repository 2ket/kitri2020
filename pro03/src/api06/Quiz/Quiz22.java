package api06.Quiz;

class Member{
	private String id;
	private String name;
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+":"+name;
	}
}

public class Quiz22 {
	public static void main(String[] args) {
		Member member=new Member("blue", "이파란");
		System.out.println(member.toString());
	}
}
