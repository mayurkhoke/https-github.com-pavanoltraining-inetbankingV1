package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	//https://demo.guru99.com/V1/index.php
	
	// lets create a constructor for the driver
	
	WebDriver ldriver;
	public loginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	// create webElement for the locators
	
	@FindBy (name="uid")
	WebElement txtUsername;
	
    @FindBy (name = "password")
    WebElement txtpassword;
    
    @FindBy (name = "btnLogin")
    WebElement buttonSubmit;
    
    // Now I have to create action methods for each of the Web-Elements.
    
    public void setUserName(String Uname)
    {
    	txtUsername.sendKeys(Uname);
    }
    
    public void setPassword (String Upassword)
    {
    	txtpassword.sendKeys(Upassword);
    }
    
    public void clickSubmit ()
    {
    	buttonSubmit.click();
    }

}
