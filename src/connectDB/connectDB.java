package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class connectDB {
	  private static connectDB instance = new connectDB();
	public static connectDB getInstance() throws SQLException {
        return instance;
    }
	public static Connection getConnection() {
		Connection c = null;
		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			String url = "jdbc:sqlserver://localhost:1433;databaseName=QLBANVEPHIM;encrypt=false";
			String tk = "sa";
			String mk = "sa";
			c = DriverManager.getConnection(url, tk, mk);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public static void close(Connection c) {
		try {
			if(c != null)
				c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}