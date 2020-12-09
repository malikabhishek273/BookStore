package com.bookstore.Book_Store;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookStoreService {
	
	@Autowired
	BookStoreRepo bookrepo;

	public void addBook(Book book) {
		book.setIssueDate(new Date());
		bookrepo.save(book);
	}

	public Book getBook(int bookId) {
		Book book=bookrepo.findById(bookId).get();
		return book;
	}

	public List<Book> getBooks(int userId) {
		List<Book>bookrepoList=bookrepo.findByissueUserId(userId);
		return bookrepoList;
	}

}
