package com.inetbanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.readConfig;

public class baseClass {
	
	// common stuff required for all the test-cases we keep it here only.
	readConfig ReadConfig = new readConfig();
	
	
	public String baseURL = ReadConfig.getApplicationUrl();
	public String userID = ReadConfig.getUserName();
	public String userPass = ReadConfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	// apart from that I required setup method and tear down method for my every test-case.
	
	@Parameters ("browser")
	@BeforeClass
	public void Setup(String br)
	{
		
		
//		 System.setProperty("webdriver.chrome.driver",ReadConfig.getChromePath());
//		 driver=new ChromeDriver();
		 
		// you need to add the logs for each of your test-cases so create the object for looger here. and configuration for log4j properties file.
		// log4j.properties file is blank, later on i will copy it from Github url.
		
		
		 logger = Logger.getLogger("ebanking_actual");
		 PropertyConfigurator.configure("log4j.properties");
		 
		 // To run test-cases on desired brower we have to pass the paramerter which it taken from the testNG xml File.
		
		 if (br.equals("chrome"))
		 {
		 System.setProperty("webdriver.chrome.driver",ReadConfig.getChromePath());
		 driver=new ChromeDriver();
		 }
		 else if (br.equals("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver",ReadConfig.getFirefoxPath());
			 driver=new FirefoxDriver();
		 }
		 driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
