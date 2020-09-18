package com.exercise4;

import java.util.NoSuchElementException;

import com.exercise4.exceptions.MyCustomException;

public class BookService {

	Book[] bookList = new Book[100];
	int count=0;
	
	public void addBook(Book book, int i)
	{
		bookList[i] = book;
		count++;
	}
	
	public Book getBook(int bookId) throws NoSuchElementException
	{

		
		for(int i=0;i<count;i++)
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
