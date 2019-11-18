package com.cts.service;

import com.cts.Entity.Book;

public interface BookService {
	
	boolean addBook(Book book) throws Exception;
	boolean viewBook(String bookType) throws Exception;
	boolean editBook(String bookCode) throws Exception;

}
