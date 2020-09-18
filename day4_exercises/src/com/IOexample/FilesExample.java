package com.IOexample;

import java.io.*;

import com.training.Customer;

public class FilesExample {

	
	public void writeToFile(File file, Customer cust)
	{
		PrintWriter writer=null;
		try {
			writer = new PrintWriter(new FileWriter(file,true));
			writer.println(cust.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			writer.close();
		}
	}
	
	public void readFromFile()
	{
		
	}
}
