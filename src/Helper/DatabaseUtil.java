package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.mysql

import Model.DTO;

public class DatabaseUtil {

	private static DatabaseUtil instance;
	private static String DB_URL = "jdbc:sqlserver://localhost:1433;" + "databaseName=library;"
			+ "integratedSecurity=false";
	private static String USER_NAME = "sa";
	private static String PASSWORD = "123456";

	private Connection conn;

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	private DatabaseUtil() {
		conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("Connect sc");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DatabaseUtil getInstance() {
		if (instance == null) {
			instance = new DatabaseUtil();

		}
		return instance;

	}
	
	public void end() throws Exception {
		if (conn != null) {
			conn.close();
		}
	}
	
	
}
