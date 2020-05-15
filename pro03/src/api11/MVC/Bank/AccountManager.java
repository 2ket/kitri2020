package api11.MVC.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private Scanner sc;
	private ArrayList<Account> list;
	
	public AccountManager(){
		list=new ArrayList<Account>();
		sc=new Scanner(System.in);
	}
	public void makAccount() {	//1.계좌개설 
		Account account=new Account();
		
		System.out.print("계좌번호: ");
		account.setId(sc.nextInt());
		
		System.out.print("이름: ");
		account.setName(sc.next());
		
		System.out.print("입금액: ");
		account.setbalance(sc.nextLong());
		
		list.add(account);
		
		System.out.println("계좌가 개설되었습니다.");
//		System.out.println(list.toString()+"\n");
	}
	
	public void disp() {	//전체 출력
		for(int i=0; i<list.size();i++) {
			Account account=list.get(i);
			System.out.println(account.getId()+"\t"+account.getName()+"\t"+account.getbalance());
		}
	}
	public void deposit() { //입금액
		System.out.print("계좌번호 : ");
		int id=sc.nextInt();
		System.out.print("입금액 : ");
		long money=sc.nextLong();
		
		for(int i=0; i<list.size(); i++) {
			Account account=list.get(i);
			if(account.getId()==id) {
				long balance=account.getbalance();
				money+=balance;
				
				account.setbalance(money);
				System.out.println("입금 완료");
				return;
				
			}
			
		}
		System.out.println("해당계좌가 존재하지 않습니다.");
	}
	public void withdraw() {	//출금
		System.out.print("계좌번호 : ");
		int id=sc.nextInt();
		System.out.print("출금액 : ");
		long money=sc.nextLong();
		
		for(int i=0; i<list.size();	i++) {
			Account account=list.get(i);
			
			if(account.getId()==id) {
				if(account.getbalance()<money) {
					System.out.println("잔액부족입니다.");
					return;
				}else {
					long balance=account.getbalance()-money;
					account.setbalance(balance);
					System.out.println("출금이 완료되었습니다.");
					return;
				}
			}
		}
		System.out.println("해당계좌가 존재하지 않습니다.");
	}
	
	public void inquire() {	//잔액조회
		System.out.print("계좌번호 : ");
		int id=sc.nextInt();
		
		for(int i=0; i<list.size(); i++) {
			Account account=list.get(i);
			if(account.getId()==id) {
				System.out.println(account.getId()+"\t"+account.getName()+"\t"+account.getbalance());
				return;
			}
		}
		System.out.println("해당 계좌번호가 없습니다.");
	}
	
	
}
