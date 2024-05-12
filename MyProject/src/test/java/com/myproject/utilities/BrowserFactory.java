package com.myproject.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	//cretae two methods for
	
	
	public static WebDriver StartApplication(WebDriver driver,String Browsername,String URL) 
	{
		if(Browsername.equals("chrome"))
		{
		System.setProperty("webDriver.chrome.driver","./Driver/");
		driver=new ChromeDriver();
		}
		else if(Browsername.equals("firefox"))
		{
			System.setProperty("webDriver.chrome.driver","./Drivers/");
			//driver=new gecko();
		}
		else if(Browsername.equals("IE"))
		{
			System.setProperty("WebDriver.Chrome.driver","./Drivers/chromedriver.exe");
			//driver=new IEDriver();
		}
		else
		{
			System.out.println("Do not support this browser");
	
		}
	      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      driver.get(URL);
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	      return driver;
	}
	public static void quitBrowser(WebDriver driver)
	{
		driver.close();
		driver.quit();
	}
	
}
