package api11.MVC.Bank;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 15.
 * @Description :	MVC : Model(Oracle, MSSQL, MySQL / RDBMS)
 */
public class Account {
	private int id;			//계좌번호
	private String name;	//이름
	private long balance;	//잔액
	
	public Account() {}
	
	public Account(int id, String name, long balance) {
//		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getbalance() {
		return balance;
	}
	public void setbalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
