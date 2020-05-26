package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 26.
 * @Description :	얘가 실질적으로 DB로 들어가는 명령문 적어주는 파일 
 */
public class AccountDao {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private String sql=null;
	private Scanner sc=null;
	private AccountDto accountDto=null; 
	
	public void makAccount() {
		sc=new Scanner(System.in);
		accountDto=new AccountDto();
		
		System.out.print("계좌번호 : ");
		accountDto.setId(sc.next());
		
		System.out.print("이름 : ");
		accountDto.setName(sc.next());
		
		System.out.println("입금액 : ");
		accountDto.setBalance(sc.nextLong());
		
		System.out.println(accountDto.toString());
	}
	
}
