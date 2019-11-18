package com.cts.helper;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;


@Component
public class JdbcConnector {

	
	
	    public Connection getConnection() throws Exception{
	     
	    	 Class.forName("com.mysql.jdbc.Driver"); 
	    	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookmanagement","root","508417");
	   
	        return con;
	    }
	    
	    
	
}
