package com.guru99bank.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99bank.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass

{
	@Test
	public void loginTest() 
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		
		
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		} 
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	

}
