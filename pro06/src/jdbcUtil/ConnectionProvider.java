package jdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	public static Connection getConnection() {	//static 선언으로 다른 클래스에서 해당 함수에 접근하려면 Class로 접근 해줘야한다.(new 객체 생성 안해도 됨)
		Connection conn=null;
		try {
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pass="1234";
			
			conn=DriverManager.getConnection(url, id, pass);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return conn;	//return 해줌으로 getConnection은 Connection객체를 넘겨줌
	}
}
