package com.inetbanking.testcases;

import org.testng.annotations.Test;

import com.inetbanking.pageobject.addnewcustomer;
import com.inetbanking.pageobject.loginpage;

public class Tc_addnewcustomer_02 extends Baseclass {
	
	
	@Test
	public void addnewcust() throws InterruptedException {
		driver.get(Baseurl);
		
		loginpage lpn = new loginpage(driver);
		lpn.setusername(username);
		lpn.setpass(password);
		lpn.submit();

		Thread.sleep(5000);

		addnewcustomer anc = new addnewcustomer(driver);
		anc.AddNewCustomer();
		anc.AddCustomerName("Adie");
		logger.info("Customer name entered");
		anc.Gender("male");
		anc.DoB("23", "03", "1995");
		logger.info("DOB entered");
		Thread.sleep(5000);
		anc.Address("Balighat");
		anc.City("Puri");
		anc.State("Odisha");
		logger.info("Address entered");
		anc.Pinno("1234567");
		anc.Telephno("1344566456");
		String email = Randomstring() + "@gmail.com";
		anc.Email(email);
		logger.info("email id entered");
		anc.Submit();

	}

}
