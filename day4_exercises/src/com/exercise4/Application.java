package com.exercise4;

import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BookService service = new BookService();
		
		Book book1 = new Book(100,"Science","James",200);
		Book book2 = new Book(101,"Maths","Robert",300);
		
		service.addBook(book1,0);
		service.addBook(book2,1);
		
		//System.out.println(service.getBook(100).getBookName());
		
		//service.getBook(3);
		//service.getBook(100).setBookName(null);
		Book book3 = new Book(102,null,"Ron",120);
		//book1.setPrice(600);
		
	}

}
