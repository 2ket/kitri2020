package api11.MVC.Bank;

import java.util.Scanner;

public class AccountManager {
	
	public void makAccount() {	//계좌개설
	Account account=new Account();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("계좌번호: ");
	account.setId(sc.nextInt());
	
	System.out.println("이름: ");
	account.setName(sc.nextLine());
	
	System.out.println("입금액: ");
	account.setBalanace(sc.nextLong());
	
	}
}
