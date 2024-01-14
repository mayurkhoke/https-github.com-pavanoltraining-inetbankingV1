package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {

	Properties pro;
	public readConfig()
	{
		File src = new File ("./configuration/config.properties");
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		}
		catch (Exception e)
		{
			System.out.println("Exception is " +e.getMessage());
		}
		
		// Now you have to write methods to read each and every value, readconfig.java is like a page object class.
		
		
		
	}
	
	public String getApplicationUrl()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName()
	{
		String userID = pro.getProperty("userID");
		return userID;
	}
	
	public String getPassword()
	{
		String userPass= pro.getProperty("userPass");
		return userPass;
	}
	
	public String getChromePath()
	{
		String chromePath = pro.getProperty("cromePath");
		return chromePath;
	}
	
	public String getFirefoxPath()
	{
		String fireFox = pro.getProperty("fireFox");
		return fireFox;
	}
	
	
}
