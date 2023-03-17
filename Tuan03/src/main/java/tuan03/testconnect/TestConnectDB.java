package tuan03.testconnect;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnectDB {
	public static void main(String[] args) {
		Connection conn = null;

		try {
			String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Tuan03;encrypt=false";
			String user = "sa";
			String pass = "123456";
			conn = DriverManager.getConnection(dbURL, user, pass);
			if (conn != null) {
				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				System.out.println("Driver name: " + dm.getDriverName());
				System.out.println("Driver version: " + dm.getDriverVersion());
				System.out.println("Product name: " + dm.getDatabaseProductName());
				System.out.println("Product version: " + dm.getDatabaseProductVersion());
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
