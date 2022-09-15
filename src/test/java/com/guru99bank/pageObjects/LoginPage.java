package com.guru99bank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver driver;

	public LoginPage(WebDriver driver) 
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")
	WebElement txtUsername;

	@FindBy(name = "password")
	WebElement txtPassword;

	@FindBy(xpath = " //input[@name='btnLogin']")
	WebElement loginBtn;
	
	@FindBy(css="a[href='Logout.php']")
	WebElement logoutBtn;

	public void setUserName(String uname) 
	{
		txtUsername.sendKeys(uname);
	}

	public void setPassword(String pwd) 
	{
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() 
	{
		loginBtn.click();
	}
	
	public void clickLogout()
	{
		logoutBtn.click();	
	}
}
