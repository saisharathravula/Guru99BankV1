package com.guru99bank.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99bank.pageObjects.AddCustomerPage;
import com.guru99bank.pageObjects.LoginPage;

public class TC_AddCustomerTest_002 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws Throwable
	{
	LoginPage lp=new LoginPage(driver);
	
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickSubmit();
	
	Thread.sleep(3000);
	
	AddCustomerPage acp=new AddCustomerPage(driver);
	Thread.sleep(9000);
	acp.clickNewCustomer();
	Thread.sleep(3000);
	acp.customerName("saiss");
	acp.gender("male");
	acp.custdob("10", "15", "1955");
	Thread.sleep(3000);

	acp.address("indians");
	acp.city("hyder");
	acp.state("Telanganas");
	acp.pincode("500044");
	//acp.mobilenumber("1234567809");
	String number=randomeNum();
	acp.mobilenumber(number);
	
	String email=randomestring()+"@gmail.com";
	acp.emailId(email);
	
	acp.password("abcdefghijkl");
	acp.submitBtn();
	Thread.sleep(3000);
	
	boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	if(res==true)
	{
		Assert.assertTrue(true);
	}else
	{
		Assert.assertTrue(false);
		
	}
	
	}
	
	//random emailId
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
	}
	
	//random number
	public String randomeNum()
	{
		String generatedString2=RandomStringUtils.randomNumeric(10);
		return generatedString2;
	}

}
