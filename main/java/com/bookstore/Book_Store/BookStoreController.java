package com.bookstore.Book_Store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookStoreController {
	
	@Autowired
	BookStoreService bookStoreService;
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book) {
		bookStoreService.addBook(book);
		return book.getBookName()+" "+"Book has been added sucessfully";
	}
	
	@GetMapping("/getBook/{bookId}")
	public Book getBook(@PathVariable("bookId") int bookId) {
		Book book=bookStoreService.getBook(bookId);
		return book;
	}
	
	@GetMapping("/getBooks/{userId}")
	public List<Book> getBookIssuers(@PathVariable("userId") int userId){
		List<Book>issuers=bookStoreService.getBooks(userId);
		return issuers;
	}
}
