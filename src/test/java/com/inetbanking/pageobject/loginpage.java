package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{

	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver)
	{	
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}	
				
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	public void setusername(String uid) 
	{
		txtUserName.sendKeys(uid);
	}
	public void setpass(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	public void submit() 
	{
		btnlogin.click();
	}
}
