package com.app.login;

import java.sql.*;

public class DBLogin {
	
	private String userName;
	
	public String getUserName() {
		return userName;
	}

	public boolean verifyUser(UserProfile user) throws ClassNotFoundException{
		boolean userVerified = false;
		System.out.println("Trying to connect to MySQL database");
		
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywebapp?useSSL=false", "root", "akshay");
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where userEmail = ? and userPassword = MD5(?) ");    
			){
			preparedStatement.setString(1, user.getUseremail());
			preparedStatement.setString(2, user.getPassword());
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            // Get results
            userVerified = rs.next();
            this.userName = rs.getString("userName");
            System.out.println(userVerified + " User is: " + userName);
		}
		catch(SQLException  e) {
		e.printStackTrace();
		}
		
		return userVerified;
	}
	
	public boolean addUser(UserProfile user) throws ClassNotFoundException{
		boolean userAdded = false;
		
		System.out.println("Trying to connect to MySQL database");
		
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywebapp?useSSL=false", "root", "akshay");
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users VALUES (?,?,MD5(?)) ");    
			){
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getUseremail());
			preparedStatement.setString(3, user.getPassword());
            System.out.println(preparedStatement);
            int rowsAdded = preparedStatement.executeUpdate();
            if(rowsAdded == 1) userAdded = true;
//            userAdded = rs.next();	
            System.out.println("User added Successfully: "+ userAdded);
		}
		catch(SQLException  e) {
		e.printStackTrace();
		}
		
		return userAdded;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserProfile temp = new UserProfile();
		temp.setPassword("test");
		temp.setUsername("test2@gmail.com");
		DBLogin lg = new DBLogin();
		try{
			lg.verifyUser(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
