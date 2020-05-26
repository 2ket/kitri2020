package jdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	public void getConnection() {
		try {
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pass="1234";
			
			Connection conn=DriverManager.getConnection(url, id, pass);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}
