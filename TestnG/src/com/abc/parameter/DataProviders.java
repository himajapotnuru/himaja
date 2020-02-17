package com.abc.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
      @DataProvider(name="initiation")
      public Object[][] testcase1()
      {
    	 Object[][] obj= new Object[2][2];
    	 obj[0][0]="udkp14ec@cmrit.ac.in";
    	 obj[0][1]="Welcome1234";
    	 obj[1][0]="saiprasanna.puppala@gmail.com";
    	 obj[1][1]="Welcome1234"; 
    	 return obj;
      }


@Test(dataProvider="initiation")
public void testcase2(String email,String pass) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.magento.com");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("pass")).sendKeys(pass);
	driver.findElement(By.id("send2")).click();
	driver.findElement(By.linkText("Log Out")).click();
}
}