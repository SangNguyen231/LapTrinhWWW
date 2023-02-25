package session04.db;

import java.sql.Statement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import session04.objs.ItemList;
import session04.objs.ProductItem;

public class ConnectDB {
	
	private Connection con;
	
	public ConnectDB() {
//		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QLSP;"
//				+ "username=sa;password=12345678";
        try {
//			con = DriverManager.getConnection(connectionUrl);
        	InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myDB");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ItemList getAllProducts(){
		ItemList lst=new ItemList();
		try {
			Statement stmt = con.createStatement();
			String SQL = "SELECT * from Product";
			ResultSet rs = stmt.executeQuery(SQL);

			while (rs.next()) {
				ProductItem item =new ProductItem(
						rs.getString("productID"),
						rs.getNString("productName"),
						rs.getNString("description")
						);
				lst.addProductItem(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}
		
}
