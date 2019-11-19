package com.cts.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.Entity.User;
import com.cts.helper.JdbcConnector;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcConnector jdbcConnector;
	
	public boolean registerUser(User user) throws Exception {
		
		Connection con=jdbcConnector.getConnection();
		String username=user.getUserName();
		String password=user.getPassword();
		String name=user.getName();
		String DOB=user.getDOB();
		String address=user.getAddress();
		String query="insert into user values('"+username+"','"+password+"','"+name+"' ,'"+DOB+"','"+address+"')";
		
		 Statement st = con.createStatement();
         int m = st.executeUpdate(query); 
         if (m == 1) 
         {     System.out.println("inserted successfully : ");
         return true;
         }
         else
         {
             System.out.println("insertion failed"); 
             return false;
         }
		  
		
	}

	@Override
	public boolean loginUser(User user) throws Exception {
		//Connection con=jdbcConnector.getConnection();
		String username=user.getUserName();
		String password=user.getPassword();
		
		
		/*String query="Select * from user where username=username and password= password";
		 Statement st = con.createStatement();    
		 ResultSet rs = null;
         int m = st.executeUpdate(query); 
         while ( rs.next() ) {
            String userName=rs.getString(username);
            if(userName.equalsIgnoreCase(username))
            {
            	return true;
            }
         }
		return false;*/
		
		if(username.equals("a")&&password.equals("a"))
		return true;
		else
			return false;
	}






	







}
