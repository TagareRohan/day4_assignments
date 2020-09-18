package com.exercise4;

import com.exercise4.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Book {

	private int bookId;
	private String bookName;
	private String author;
	private double price;
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) throws MyCustomException {
		
		try
		{
			if (bookName==null)
			{
				throw new NullPointerException();
			}
			
		}
		catch(NullPointerException e)
		{
			throw new MyCustomException("book name cannot be null",e);
		}
		this.bookName=bookName;
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
		
		if(price<100 || price>500)
		{
			try
			{
				throw new RangeCheckException("Price should be within range");
			}
			catch (RangeCheckException e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
		else
		{
			this.price = price;
		}
		
		
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, String author, double price) throws MyCustomException,RangeCheckException {
		super();
		this.bookId = bookId;
		
		try
		{
			if (bookName==null)
			{
				throw new NullPointerException();
			}
		}
		catch(NullPointerException e)
		{
			throw new MyCustomException("book name cannot be null",e);
			
		}
		this.bookName=bookName;
		this.author = author;
		
		if(price<100 || price>500)
		{
			throw new RangeCheckException("Price should be within range");
		}
		else
		{
			this.price = price;
		}
		
	}
	
	
}
