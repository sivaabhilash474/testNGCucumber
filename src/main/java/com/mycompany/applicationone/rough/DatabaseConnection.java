package com.mycompany.applicationone.rough;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	
	public static void main(String[] args) {
		// 1. Create connection object
		// 2. Create statement object
		// 3. Create result set object
		
		for(int i=1; i<=13; i++) {
			System.out.println(i);
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "abhi_123");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("Select * from customers limit 5");
			ResultSetMetaData metaData = rs.getMetaData();
			System.out.println("Column count: "+metaData.getColumnCount());
			for(int i=1; i<=metaData.getColumnCount(); i++) {
				System.out.println(metaData.getColumnName(i));
				
			}
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
