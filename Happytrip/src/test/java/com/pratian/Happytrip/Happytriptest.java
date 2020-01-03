package com.pratian.Happytrip;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Happytriptest {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\veeranjaneyulu\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		baseUrl = "https://uatint-wellcare.mirrahealthcare.com/";
		//baseUrl = "http://localhost:8085/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testHappytrip() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("userId")).clear();
		driver.findElement(By.id("userId")).sendKeys("bjoy@ahcpllc.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
	}

	@After
	public void tearDown() throws Exception {

		// Close the browser
		driver.close();

	}
}
