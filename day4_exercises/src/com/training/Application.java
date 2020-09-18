package com.training;

import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Customer ram = new Customer();
			
			ram.setCustomerId("202");
			ram.setEmail("ram@abc.com");
			ram.setMobileNumber(2888800);
			ram.setCustomerName("Ram");
			
			CustomerService service = new CustomerService();
			
			service.printCustomerService(ram);
			System.out.println("hello");
			
			Customer shyam = new Customer();
			shyam.setCustomerId("65657567");
			shyam.setCustomerName("Shyam");
			shyam.setEmail("shyamabc.com");
			shyam.setMobileNumber(998787879);
			
			
			System.out.println(service.encryptEmail(ram));
			
			System.out.println(service.generateUserId(shyam));
		}
		catch (RangeCheckException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
