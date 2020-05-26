package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 26.
 * @Description :	Person Table : Update 
 */
public class Ex03 {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner sc=null;
	//데이터베이스 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	//연결관리 객체 Connection 객체 생성
		try {
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pass="1234";
			
			conn=DriverManager.getConnection(url, id, pass);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	//작업관리 - preparedStatement, 결과처리 - ResultSet/int , 종료-close
		try {
			sc=new Scanner(System.in);
			System.out.println("번호 : ");
			int bunho=sc.nextInt();
			System.out.println("");
			
			String sql="SELECT * FROM PERSON WHERE bunho=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bunho);
			
			rs=pstmt.executeQuery();
			
			
			
			if(rs.next()) {
				System.out.println(rs.getInt(bunho)+"\t"+rs.getString("name")+"\t"+rs.getFloat("ki"));
				
				System.out.println("키 수정:");
				float ki=sc.nextFloat();
				String sqlUp="update person set ki=? where bunho=?";
				pstmt=conn.prepareStatement(sqlUp);
				pstmt.setFloat(1, ki);
				pstmt.setInt(2, bunho);
				
				int check=pstmt.executeUpdate();
				if(check>0)System.out.println("수정확인: "+check);
			}else {
				System.out.println("해당번호가 존재하지 않습니다.");
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sc!=null) sc.close();
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
		
}
