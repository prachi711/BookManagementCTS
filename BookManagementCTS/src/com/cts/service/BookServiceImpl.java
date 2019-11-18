package com.cts.service;

import org.springframework.stereotype.Service;

import com.cts.Dao.BookDao;
import com.cts.Entity.Book;
@Service
public class BookServiceImpl implements BookService {

	BookDao bookDao;
	
	@Override
	public boolean addBook(Book book) throws Exception {
		
		return bookDao.addBook(book);
	}

	@Override
	public boolean viewBook(String bookType) throws Exception {
		// TODO Auto-generated method stub
		return bookDao.viewBook(bookType);
	}

	@Override
	public boolean editBook(String bookCode) throws Exception {
		// TODO Auto-generated method stub
		return bookDao.editBook(bookCode);
	}

}
