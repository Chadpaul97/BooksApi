package com.codingdojo.bookapi.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.bookapi.models.Book;
import com.codingdojo.bookapi.services.BookService;

@Controller
public class HomeController {
		
	
		private final BookService bookService;
	    
	    public HomeController(BookService bookService) {
	        this.bookService = bookService;
	    }
	    
	   

	    
	    @RequestMapping("/books")
	    public String index(Model model) {
	        List<Book> books = bookService.allBooks();
	        model.addAttribute("books", books);
	        return "index.jsp";
	    }
}
