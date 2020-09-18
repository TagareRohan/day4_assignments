package com.IOexample;

import java.io.File;

import com.training.Customer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ram=new Customer("123","ram",2323,"abc@xyz.com");
		FilesExample service = new FilesExample();
		File file=new File("customer.txt");
		//service.writeToFile(file, ram);
		service.readFromFile(file);

	}

}
