package com.training;

public class CustomerService {

	public String generateUserId(Customer cust)
	{
		String userID="";
		try {
			int firstPart = Integer.parseInt(cust.getCustomerId());
			String secondPart = cust.getEmail().substring(1,3);
			userID=firstPart + secondPart;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("ID should be number");
			e.printStackTrace();
		}
		System.out.println("hello");
		return userID;
	}
	
	public void printCustomerService(Customer cust)
	{
		//System.out.println(cust.getCustomerName().length());
		
		try {
			System.out.println(cust.getCustomerName().length());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("name should be valid");
			e.printStackTrace();
			
		}
	}
	
	public String encryptEmail(Customer cust)
	{
		String email = cust.getEmail();
		String encrypted="";
		
		boolean status=email.contains("@");
		if(!status)
		{
			try {
				throw new Exception("Invalid email");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				
			}
			finally
			{
				System.out.println("inside finally");
			}
		}
		
		else
		{
			encrypted="abcde"+email+"!2231!";
		}
		
		return encrypted;
	}
	
}
