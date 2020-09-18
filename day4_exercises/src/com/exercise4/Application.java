package com.exercise4;

import java.util.NoSuchElementException;

import com.exercise4.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Book book1 = new Book(100,"Science","James",120);
		Book book2 = new Book(101,"Maths","Robert",200);
		
		BookService service = new BookService();
		
		service.addBook(book1, 0);
		service.addBook(book2, 1);
		
		
		try
		{
			book1.setBookName(null);
		} 
		catch (MyCustomException e)
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		try
		{
			Book book3 = new Book(102,"English","Jon",8000);
		} 
		catch (RangeCheckException e)
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		catch (MyCustomException e)
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("All books: ");
		System.out.println(service.getAll());
		
		try
		{
			System.out.println(service.getBook(300));
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
