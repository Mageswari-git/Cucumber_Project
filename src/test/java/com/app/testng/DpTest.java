package com.app.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DpTest {
	
	@Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupllier.class)
	public void TestLogin(String userName, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(userName);

		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		//Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		Thread.sleep(5000);
	//	driver.quit();
	}
	
}


