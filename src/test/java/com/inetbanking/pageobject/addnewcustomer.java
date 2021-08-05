package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addnewcustomer {

	WebDriver ldriver;

	public addnewcustomer(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	WebElement InkAddCustomer;

	@FindBy(name = "name")
	WebElement txtCustomerName;

	@FindBy(name = "rad1")
	WebElement rdGender;

	@FindBy(id = "dob")
	WebElement txtDOB;

	@FindBy(name = "addr")
	WebElement txtAdress;

	@FindBy(name = "city")
	WebElement txtCity;

	@FindBy(name = "state")
	WebElement txtState;

	@FindBy(name = "pinno")
	WebElement txtPinno;

	@FindBy(name = "telephoneno")
	WebElement txtTelphno;

	@FindBy(name = "emailid")
	WebElement txtEmail;

	@FindBy(name = "sub")
	WebElement txtSub;

	public void AddNewCustomer() {
		InkAddCustomer.click();
	}

	public void AddCustomerName(String cname) {
		txtCustomerName.sendKeys("Adie");
	}

	public void Gender(String cgender) {
		rdGender.click();
	}

	public void DoB(String mm, String dd, String yyyy) {
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(yyyy);

	}

	public void Address(String caddress) {
		txtAdress.sendKeys(caddress);

	}

	public void City(String ccity) {
		txtCity.sendKeys(ccity);

	}

	public void State(String cstate) {
		txtState.sendKeys(cstate);

	}

	public void Pinno(String cpinno) {
		txtPinno.sendKeys(cpinno);

	}

	public void Telephno(String ctelephno) {
		txtTelphno.sendKeys(ctelephno);
	}

	public void Email(String cemail) {
		txtEmail.sendKeys(cemail);
	}

	public void Submit() {
		txtSub.click();
	}
}
