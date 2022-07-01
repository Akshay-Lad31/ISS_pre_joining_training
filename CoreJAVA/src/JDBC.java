import java.sql.*;   

//
public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trying to connect to MySQL database");
		try{ 
			//Find jdbc driver class
			Class.forName("com.mysql.jdbc.Driver");  
			//connecting to db
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/mywebapp?useSSL=false","root","akshay");  
			//here sonoo is database name, root is username and password  
			//create and query statement
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select userName from users limit 5");  //run query statement 
			
			while(rs.next())  
			System.out.println(rs.getString("userName"));  
			//Close connection once work is done and release the resources
			con.close();  
			}
		catch(Exception e){
				//Print errors
				System.out.println(e);
				} 

	}

}
