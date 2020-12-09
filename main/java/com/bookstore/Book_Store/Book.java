package com.bookstore.Book_Store;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Component
@Entity(name = "Book")
public class Book implements Serializable{
    @Id
	@Column(name = "bookId")
	private int bookId;

	@Column(name = "bookName")
	private String bookName;

	@Column(name = "issueDate")
	@Temporal(value = TemporalType.DATE)
	private Date issueDate;

	@Column(name = "issueUserId")
	private int issueUserId;

	public int getBookId() {
		return bookId;
	}

	public Book() {

	}

	public Book(int bookId, String bookName, Date issueDate, int issueUserId) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.issueDate = issueDate;
		this.issueUserId = issueUserId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public int getIssueUserId() {
		return issueUserId;
	}

	public void setIssueUserId(int issueUserId) {
		this.issueUserId = issueUserId;
	}

}
