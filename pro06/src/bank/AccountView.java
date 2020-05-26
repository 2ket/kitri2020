package bank;

import java.util.Scanner;

import jdbcUtil.DriverProvider;

public class AccountView {
	public static void main(String[] args) {
		DriverProvider dp=new DriverProvider();
		dp.getDriver();
		
		AccountDao jbank=new AccountDao();

		Scanner sc=new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.println("선택 : ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				jbank.makAccount();
				break;
			case 2:
				jbank.deposit();
				break;
			case 3:
				jbank.withdraw();
				break;
			case 4:
				jbank.view();
				break;
			case 5:
				jbank.showData();
				break;
			case 6:
				System.out.println("종료합니다");
				if(sc!=null) sc.close();
				System.exit(0);//0아니면 1쓰면 정상 종료
			}
		}
	}
	public static void printMenu() {
		System.out.println("Menu------------");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액조회");
		System.out.println("5. 전체출력");
		System.out.println("6. 프로그램 종료");
		System.out.println();
	}
}
