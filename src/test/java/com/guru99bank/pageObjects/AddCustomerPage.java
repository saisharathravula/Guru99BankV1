package com.guru99bank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver driver;
	public 	AddCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//a[normalize-space()='New Customer']")
	WebElement newCustomerLink;
	
	@FindBy(xpath=" //input[@name='name']")
	WebElement customerName;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pincode;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement submitbtn;
	
	public void clickNewCustomer()
	{
		newCustomerLink.click();
	}
	
	public void customerName(String cname)
	{
		customerName.sendKeys(cname);
	}
	
	public void gender(String cgender)
	{
		gender.click();
	}
	
	public void custdob(String mm,String dd,String yy)
	{
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	
	public void address(String caddress)
	{
		address.sendKeys(caddress);	
	}
	
	public void city(String custcity)
	{
		city.sendKeys(custcity);
	}
	
	public void state(String custstate)
	{
		state.sendKeys(custstate);
	}
	
	public void pincode(String custpincode)
	{
		pincode.sendKeys(custpincode);
	}
	
	public void mobilenumber(String custmobilenumber)
	{
		mobilenumber.sendKeys(custmobilenumber);
	}
	
	public void emailId(String custemailId)
	{
		emailId.sendKeys(custemailId);
	}
	
	public void password(String custpassword)
	{
		password.sendKeys(custpassword);
	}
	
	public void submitBtn()
	{
		submitbtn.click();
	}
}


