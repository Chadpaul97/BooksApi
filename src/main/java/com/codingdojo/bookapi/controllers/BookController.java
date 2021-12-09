package com.codingdojo.bookapi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.bookapi.models.Book;
import com.codingdojo.bookapi.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/books/{bookId}")
	public String onebook(Model model,@PathVariable("bookId") Long bookId) {
	
		Book book = bookService.findBook(bookId);
		
		model.addAttribute("book",book);
		
		return "show.jsp";
	}

}
