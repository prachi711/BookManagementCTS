package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.Entity.Book;
import com.cts.Entity.User;
import com.cts.service.BookService;
import com.cts.service.UserService;

@Controller
public class BookController {

	
	
	@Autowired
	BookService bookService;
	
	
	@RequestMapping(value="addBook.htm")
	private String addBookPage() {
		return "addBook";
	}
	
	@RequestMapping(value="viewBook.htm")
	private String viewBookPage() {
		return "viewBook";
	}
	
	@RequestMapping(value="addBook.htm",method=RequestMethod.POST)
	private ModelAndView addBook(@RequestParam("bcode")String bookCode,@RequestParam("bname")String bookName,@RequestParam("btype") String bookType,@RequestParam("price") String price,@RequestParam("description")String description) throws Exception
	{
		Book book=new Book(bookCode,bookName,bookType,price,description);
		
		
		
		 boolean result = bookService.addBook(book);
	
	System.out.println(result);
	ModelAndView mv=new ModelAndView();
	
		mv.setViewName("added");
		return mv;
	
	}
		
		
	//private ModelAndView viewBook()	
		
		
	
	
}
