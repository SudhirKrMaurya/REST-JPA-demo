package com.jpa.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("/book")
	public List<Book> getAllBook()
	{
		return Arrays.asList(new Book(1,"master in spring boot","Sudhir maurya"));
		
	}
	
}
