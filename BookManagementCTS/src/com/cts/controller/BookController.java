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
	private UserService userService;
	@RequestMapping(value="registeruser.htm",method=RequestMethod.POST)
	private ModelAndView registerUser(@RequestParam("uname")String userName,@RequestParam("pname")String password,@RequestParam("dob") String DOB,@RequestParam("address") String address,@RequestParam("name")String name) throws Exception
	{
		User user=new User(userName,password,DOB,address,name);
		
		
		
			 boolean result = userService.registerUser(user);
		
		System.out.println(result);
		ModelAndView mv=new ModelAndView();
		
			mv.setViewName("login");
			return mv;
		
		
		
	}
	@RequestMapping(value="index.htm")//by default it is GET method
	private String welcomePage() {
		return "login";
	}
	
	
	@RequestMapping(value="registerpage.htm")
	private String registerPage() {
		return "register";
	}
	
	
	
	@RequestMapping(value="loginuser.htm",method=RequestMethod.POST)//frontend to backend
	private ModelAndView loginUser(@RequestParam("uname")String userName,@RequestParam("pname")String password) throws Exception
	{
		User user=new User(userName,password);
		
		
		
			 boolean result = userService.loginUser(user);
		
		System.out.println(result);
		ModelAndView mv=new ModelAndView();
		
			mv.setViewName("books");
			return mv;
		
		
		
	}
	
	@Autowired
	BookService bookService;
	
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
