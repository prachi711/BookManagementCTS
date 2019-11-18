package com.cts.Dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.Entity.Book;
import com.cts.helper.JdbcConnector;

@Repository
public class BookDaoImpl implements BookDao {

	
	@Autowired
	private JdbcConnector jdbcConnector;
	
	@Override
	public boolean addBook(Book book) throws Exception {
		
		Connection con=jdbcConnector.getConnection();
		String bookCode=book.getBookCode();
		String bookName=book.getBookName();
		String bookType=book.getBookType();
		String price=book.getPrice();
		String description=book.getDescription();
		
		String query="insert into user values('"+bookCode+"','"+bookName+"','"+bookType+"' ,'"+price+"','"+description+"')";
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
	public boolean viewBook(String bookType) throws Exception {
		
		Connection con=jdbcConnector.getConnection();
		
		String query="select bookCode, bookName, price, description from book where bookType=?";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		try {
		if(rs.next())
		{
			System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));
			return true;
		}
		
		else
		{
			System.out.println("Record Not Found...");
			
		}
		con.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
		
		return true;
		
}
	

	@Override
	public boolean editBook(String bookCode) throws Exception {
		 
		Connection con=jdbcConnector.getConnection();
		String query="update book set bookName=?, price=?, descrition=? where bookCode=? ";
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery(query);
        return true;
	}

}
