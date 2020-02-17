package com.abc.parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void testcase(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
	}
 @Test	
 public void testcase3()
 {      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://www.magento.com");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("udkp14ec@cmrit.ac.in");
		driver.findElement(By.id("pass")).sendKeys("Welcome1234");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
 }
}
