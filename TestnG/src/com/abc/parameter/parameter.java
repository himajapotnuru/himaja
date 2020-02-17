package com.abc.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
      WebDriver driver;
      @Test
      @Parameters({"url","email","pass"})
      public void d1(String url,String email,String pass)
      {
    	  driver=new ChromeDriver();
    	  driver.get(url);
    	  driver.findElement(By.linkText("My Account")).click();
    	  driver.findElement(By.id("email")).sendKeys(email);
    	  driver.findElement(By.id("pass")).sendKeys(pass);
    	  driver.findElement(By.id("send2")).click();
    	  driver.findElement(By.linkText("Log Out")).click();
      }
      
}
