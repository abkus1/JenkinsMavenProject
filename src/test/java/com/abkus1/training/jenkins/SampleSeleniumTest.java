package com.abkus1.training.jenkins;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//--import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleSeleniumTest {
	WebDriver driver;
	
  @BeforeClass
	  public void startBrowser() {
	        System.setProperty("webdriver.chrome.silentOutput","true");
			System.setProperty("webdriver.chrome.driver","/Users/abhaykushwaha/chromedriver");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			driver = new ChromeDriver(chromeOptions);
		}	
  @Test
  public void validateGoogleId() throws Exception {
		System.out.println("Opening Browser");
		driver.get("http://www.google.com");
		System.out.println("Clicking Gmail Link");
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		System.out.println("Clicking Sign In link");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		Thread.sleep(5000);
	}
  
  @AfterClass
  public void closeBrowser() {
		driver.quit();
		}
}