package org.individuallogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaDataBaseConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Loading the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create the DataBase Connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "10Aero50!");
		//Write a Query
		String s = "Select * from Employees";
		//Convert the Query into Statement
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		//Execute the Query
		ResultSet executeQuery = prepareStatement.executeQuery();
		//Iterate the Table - row by row
		while(executeQuery.next()) {
			String string = executeQuery.getString("first_name");
			String string2 = executeQuery.getString("last_name");
			System.out.println(string+"\t"+string2);
			
		}
		connection.close();
	}

}
