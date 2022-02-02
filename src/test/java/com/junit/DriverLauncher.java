package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverLauncher {
	
 static WebDriver driver;
 
 @BeforeClass
 public static void beforeclass() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
}
 
 @AfterClass
 
 public static void afterclass() {
	driver.quit();
}
 
 @Before
 public void before() {
	long start = System.currentTimeMillis();
	System.out.println(start);
	
}
 
 @After
 
 public void after() {
	 long end = System.currentTimeMillis();
		System.out.println(end);
		
}
 
 @Test
 public void login() {
	 WebElement txtusername = driver.findElement(By.id("username"));
	txtusername.sendKeys("vijay");
	WebElement txtpassword = driver.findElement(By.id("password"));
	txtpassword.sendKeys("vijay");
	WebElement btnlogin = driver.findElement(By.id("login"));
	btnlogin.click();

}
	
}
