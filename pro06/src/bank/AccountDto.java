package bank;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 26.
 * @Description : MVC	//뷰에서 DTO통해서 오면 DTO의 데이터를 DAO를 통해서 DB로 넘어가는것.
 * 			DTO는 변수같은 개념.
 * 			DTO가 하는 역할 : DB에서 받아와서 뿌리고 / 뷰에서 받아와서 DB에 뿌리고 -> 
 */
public class AccountDto {	//Data Access Object dao
	private int num;			//자동 증가번호(PK)
	private String id;			//계좌번호
	private String name;		//이름
	private long balance;		//잔액
	
	
	public AccountDto() {}
	
	public AccountDto(int num, String id, String name, long balance) {
		this.num = num;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountDto [num=" + num + ", id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
