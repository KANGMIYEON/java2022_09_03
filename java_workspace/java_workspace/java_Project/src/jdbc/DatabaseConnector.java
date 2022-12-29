package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	// 싱글톤 사용
	
	private static DatabaseConnector dbc = new DatabaseConnector();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/javadb";
	
	// 생성자는 private
	private DatabaseConnector() {
		try {
			Class.forName(jdbcDriver); // 드라이버를 로드하기 위해 사용되는 메서드
			conn = DriverManager.getConnection(jdbcUrl, "javauser", "mysql"); // url, user, password 제공해야 함
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) { // 뭔가 안 맞음
			System.out.println("연결정보가 정확하지 않습니다.");
			e.printStackTrace();
		}
	}
	
	// if문 사용하지 않고 ~
	public static DatabaseConnector getInstance() {
		return dbc;
	}
	
	// 기존의 연결정보를 계속 사용
	public Connection getConnection() {
		return conn;
	}
}
