package api11.MVC.Bank;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 15.
 * @Description :	MVC : Model(Oracle, MSSQL, MySQL / RDBMS)
 */
public class Account {
	private int id;			//계좌번호
	private String name;	//이름
	private long balanace;	//잔액
	
	public Account() {}
	
	public Account(int id, String name, long balanace) {
		super();
		this.id = id;
		this.name = name;
		this.balanace = balanace;
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
	public long getBalanace() {
		return balanace;
	}
	public void setBalanace(long balanace) {
		this.balanace = balanace;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balanace=" + balanace + "]";
	}
	
	
}
