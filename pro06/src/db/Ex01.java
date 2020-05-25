package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex01 {

	public static void main(String[] args) {
		//1단계 : 데이터베이스 연결
		try {
			String className="oracle.jdbc.driver.OracleDriver";
			Class.forName(className);		//해당 문자열의 이름을 가진 클래스를 생성해줌
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//2단계 : 연결을 관리하는 객체 생성
		try {
			String url="jdbc:oracle:thin:@192.168.0.8:1521:xe";	//localhost 자리에 원하는 아이피/1521자리에 포트번호
			String id="java";
			String pass="1234";
			
			Connection conn=DriverManager.getConnection(url, id, pass);
			
		//3단계 : 작업관리(Query)
			PreparedStatement pstmt=conn.prepareStatement("select * from dept");
			ResultSet rs=pstmt.executeQuery();
			
			//4단계 : 결과처리
			while(rs.next()) {
				int deptNo=rs.getInt("DEPTNO");
				String deptName=rs.getString("dname");
				String location=rs.getString("loc");
				System.out.println(deptNo+"\t"+deptName+"\t\t"+location);
			}
			
			//5단계 : 종료
			rs.close();
			pstmt.close();
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
