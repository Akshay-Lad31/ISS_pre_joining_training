package core.java.jdbc;

import java.sql.*;

public class JDBCConnector {
	
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private Connection connector;
	
	private JDBCConnector(String db, String user, String pass) {
		
		
		System.out.println("Trying to connect to MySQL database");
		
		try{  
			Class.forName(JDBC_DRIVER);  
			this.connector = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db + "?useSSL=false",user,pass);  
		}catch(Exception e){
				System.out.println(e);
			} 
	}
	
	public ResultSet runQuery(Connection connector, String query) {
		ResultSet rs = null;
		try{
			Statement stmt = connector.createStatement();
			rs = stmt.executeQuery(query);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return rs;
		
	}
	
	public static void main(String[] args) {
		JDBCConnector myConnector = new JDBCConnector("mywebapp", "root", "akshay");
		try {
			myConnector.connector.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(myConnector.connector);
		
		
	}

}
