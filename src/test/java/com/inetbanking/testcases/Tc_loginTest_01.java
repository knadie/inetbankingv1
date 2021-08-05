package com.inetbanking.testcases;


import org.testng.annotations.Test;

import com.inetbanking.pageobject.loginpage;

import junit.framework.Assert;

public class Tc_loginTest_01 extends Baseclass {
	@Test
	public  void logintest() {
		driver.get(Baseurl);
		logger.info("Url is opened");

		loginpage lpn = new loginpage(driver);

		lpn.setusername(username);
		logger.info("Username Entered");
		lpn.setpass(password);
		logger.info("Password Entered");
		lpn.submit();
		logger.info("Submitted");

		if (driver.getTitle().equals("Guru99 Bank Manager Homepage"))
		{
			Assert.assertTrue(true);
			logger.info("Test passed");

		}

	}
}
