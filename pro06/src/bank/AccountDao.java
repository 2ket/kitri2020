package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import jdbcUtil.ConnectionProvider;
import jdbcUtil.JdbcUtil;

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
		try {
			conn=ConnectionProvider.getConnection();	//ConnectionProvider의 getConnection함수를 static선언
			sql="select num from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, accountDto.getId());
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("같은 계좌번호가 이미 있습니다. 다른 계좌 번호를 입력하세요.");
			}else {
				sql="insert into bank values(bank_num_seq.nextval, ?, ?, ?)";
				JdbcUtil.close(pstmt);
				JdbcUtil.close(rs);
				pstmt=conn.prepareStatement(sql);
				
				pstmt.setString(1, accountDto.getId());
				pstmt.setString(2, accountDto.getName());
				pstmt.setLong(3, accountDto.getBalance());
				
				int check=pstmt.executeUpdate();
				System.out.println("Insert result: "+check);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
	}
	
	public void deposit() {				//입금
		accountDto=new AccountDto();
		sc=new Scanner(System.in);
		
		System.out.print("계좌번호 : ");
		accountDto.setId(sc.next());
		
		try {
			conn=ConnectionProvider.getConnection();
			sql="select balance from bank where id=?";	//입력받은 계좌번호를 가져오는 sql
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, accountDto.getId());
			rs=pstmt.executeQuery();
			
			if(rs.next()) {				//가져와지면
//				System.out.println(rs.getLong("balance"));//제대로 연결되서 해당 계좌 금액 나오는지 확인
				System.out.print("입금액 : ");
				long money=sc.nextLong();
				
				accountDto.setBalance(rs.getLong("balance")+money);//기존 금액+입력된 금액
				JdbcUtil.close(pstmt);
				sql="update bank set balance=? where id=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setLong(1, accountDto.getBalance());
				pstmt.setString(2, accountDto.getId());
				
				int check=pstmt.executeUpdate();
				System.out.println("Deposit Up : "+check);
			}else {						//안가져와지면
				System.out.println("계좌번호가 존재하지 않습니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
	}
	
	public void withdraw() { 			//출금
		accountDto=new AccountDto();
		sc=new Scanner(System.in);
		
		System.out.print("계좌번호 : ");
		accountDto.setId(sc.next());
		
		System.out.print("출금액 : ");
		long money=sc.nextLong();
		
		try {
			conn=ConnectionProvider.getConnection();
			sql="select balance from bank where id=? and balance >= ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, accountDto.getId());
			pstmt.setLong(2, money);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				accountDto.setBalance(rs.getLong("balance")-money);
				JdbcUtil.close(pstmt);
				sql="update bank set balance=? where id=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setLong(1, accountDto.getBalance());
				pstmt.setString(2, accountDto.getId());
				int check=pstmt.executeUpdate();
				 System.out.println("Withdraw Up : "+check);
			}else {
				System.out.println("계좌번호가 틀리거나 잔액을 확인하세요.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
	}
	
	public void view() {				//잔액조회
		accountDto=new AccountDto();
		sc=new Scanner(System.in);
		
		System.out.print("계좌번호 : ");
		accountDto.setId(sc.next());
		
		try {
			conn=ConnectionProvider.getConnection();
			sql="select * from bank where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, accountDto.getId());
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				accountDto.setNum(rs.getInt("num"));
				accountDto.setId(rs.getString("id"));
				accountDto.setName(rs.getString("name"));
				accountDto.setBalance(rs.getLong("balance"));
				
				System.out.println("No. \t계좌번호\t이름\t잔액");
				System.out.println(accountDto.getNum()+"\t"+accountDto.getId()+"\t"+accountDto.getName()+"\t"+accountDto.getBalance());
				
			}else {
				System.out.println("계좌번호를 확인하세요");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
			JdbcUtil.close(conn);
		}
		
	}
	
	public void showData() {			//전체출력	//한행의 데이터가 나가면 AccountDto리턴, //두행 이상의 데이터가 나가면 ArrayList<AccountDto>리턴
		conn=ConnectionProvider.getConnection();
		ArrayList<AccountDto> list=new ArrayList<AccountDto>();	//ArrayList는 출력/입력하려는 데이터가 두개 이상일때
		try {
			sql="select * from bank order by num asc";	//select는 한행의 데이터가 나가던가, 두행 이상의 데이터가 나가던가
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				accountDto=new AccountDto();
				accountDto.setNum(rs.getInt("num"));
				accountDto.setId(rs.getString("id"));
				accountDto.setName(rs.getString("name"));
				accountDto.setBalance(rs.getLong("balance"));

				list.add(accountDto);
			}
			
			System.out.println("No. \t계좌번호\t이름\t잔액");
			for(int i=0; i<list.size();i++) {
				AccountDto dto=list.get(i);
				System.out.println(dto.getNum()+"\t"+dto.getId()+"\t"+dto.getName()+"\t"+dto.getBalance());
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
	}
	
}
