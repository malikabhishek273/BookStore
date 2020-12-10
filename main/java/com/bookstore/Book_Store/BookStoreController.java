package com.bookstore.Book_Store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> addBook(@RequestBody Book book) {
		String msg=book.getBookName()+" "+"Book has been added successfully";
		bookStoreService.addBook(book);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/getBook/{bookId}")
	public ResponseEntity<Book> getBook(@PathVariable("bookId") int bookId) {
		Book book=new Book();
		book=bookStoreService.getBook(bookId);
		HttpHeaders header=new HttpHeaders();
		header.add("testHeader","This is header value");
		header.add("testheader2","This is test header2");
		return new ResponseEntity<Book>(book,header,HttpStatus.OK);
	}
	
	@GetMapping("/getBooks/{userId}")
	public List<Book> getBookIssuers(@PathVariable("userId") int userId){
		List<Book>issuers=bookStoreService.getBooks(userId);
		return issuers;
	}
}
