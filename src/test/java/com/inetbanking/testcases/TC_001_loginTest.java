package com.inetbanking.testcases;

import org.testng.annotations.Test;

import com.inetbanking.pageobject.loginPage;

public class TC_001_loginTest extends baseClass {
	
	
	@Test
	public void loginTest()
	{
		// Url get opend from your base class
		logger.info("url is opened");
		loginPage lp = new loginPage(driver);
		lp.setUserName(userID);
		logger.info("loginID passed");
		lp.setPassword(userPass);
		logger.info("user password passed");
		lp.clickSubmit();
		logger.info("successfully login to the webpage");
		System.out.println(driver.getTitle());
		logger.info("tile captured");
		
	}
	
	
	

}
