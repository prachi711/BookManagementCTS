package com.cts.Dao;

import com.cts.Entity.Book;

public interface BookDao {
	
	boolean addBook(Book book) throws Exception;
	boolean viewBook(String bookType) throws Exception;
	boolean editBook(String bookCode) throws Exception;

}
