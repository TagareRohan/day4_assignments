package com.exercise4;

import java.util.NoSuchElementException;

import com.exercise4.exceptions.MyCustomException;

public class BookService {

	Book[] bookList = new Book[100];
	
	public void addBook(Book book, int i)
	{
		bookList[i] = book;
	}
	
	public Book getBook(int bookId) 
	{

		
		for(int i=0;i<bookList.length;i++)
		{
			if(bookList[i].getBookId()==bookId)
			{
				
				return bookList[i];
			}
		}
		
		throw new NoSuchElementException();
	}
	
	public Book[] getAll()
	{
		return bookList;
	}
	
}
