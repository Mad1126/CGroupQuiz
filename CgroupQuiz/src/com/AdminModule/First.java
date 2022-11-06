package com.AdminModule;
 

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.ibatis.jdbc.ScriptRunner;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		Scanner sc=new Scanner(System.in);
		String user,pwd;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Enter Mysql username:-");
			user=sc.next();
			
			System.out.println("Enter Mysql Password:-");
			pwd=sc.next();
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false",user,pwd);
			ScriptRunner sr=new ScriptRunner(con);
			Reader reader= new BufferedReader(new FileReader("SQLQUERY.sql"));
			sr.runScript(reader);
			
			
		} catch (ClassNotFoundException |SQLException |FileNotFoundException e) {
 		 }  
		sc.close();
	}

}
