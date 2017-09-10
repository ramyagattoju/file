package com.svk.jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTutorial {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySql Driver is available");
		
		} catch (ClassNotFoundException e) {
			System.out.println("I dont have a MySql Driver");
			e.printStackTrace();
		}
		
		System.out.println("MySql Driver is Registered");
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
		} catch (SQLException e) {
			System.out.println("Connection Failed !!");
			e.printStackTrace();
		}
		
		if(connection !=null){
			System.out.println("Hey I just connected to MySql DataBase");
		}
		
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from svk.persons");
			
			while(rs.next()){
				System.out.println("Result :" +rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
