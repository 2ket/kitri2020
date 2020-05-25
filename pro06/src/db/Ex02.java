package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 25.
 * @Description : DB에 java를 통하여 입력하기
 */
public class Ex02 {

	public static void main(String[] args) {
		try {
			//1단계 : 데이터 베이스 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 : 연결을 관리하는 객체 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pass="1234";
			
			Connection conn=DriverManager.getConnection(url, id, pass);
			
			//3단계 : 작업관리
			Scanner sc=new Scanner(System.in);
			System.out.print("번호 : ");
			int bunho=sc.nextInt();
			
			System.out.print("이름 : ");
			String name=sc.next();
			
			System.out.print("키 : ");
			float ki=sc.nextFloat();
			
			//정적쿼리
//			String query="insert into person values("+bunho+", '"+name+"', "+ki+")";
//			Statement stmt=conn.createStatement();
//			stmt.executeUpdate(query);
			
			//동적쿼리
			String sql="insert into person values(?, ?, ?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, bunho);
			pstmt.setString(2, name);
			pstmt.setFloat(3, ki);
			
			//4단계 결과처리
//			pstmt.executeQuery();//select문은 쿼리실행 - 불러올땐 ResultSet 타입
			int check=pstmt.executeUpdate(); //삽입,수정,삭제는 update로	//집어넣을땐 int 타입.
			if(check>0) System.out.println("데이터 추가 성공");
			
			
			//5단계 : 종료
			pstmt.close();
			conn.close();
			sc.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
