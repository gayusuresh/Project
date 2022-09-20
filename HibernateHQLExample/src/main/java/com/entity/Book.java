package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bookId")
	private long bookId;
	@Column(name="bookName")
	private String bookName;
	@Column(name="bookType")
	private String bookType;
	@Column(name="author")
	private String author;
	@Column(name="price")
	private double price;
	@Column(name="isbn")
	private long isbn;
	
	public Book()
	{
		
	}

	public Book(String bookName, String bookType, String author, double price, long isbn) {
		super();
		
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	


}
