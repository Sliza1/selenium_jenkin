package com.ibm.jenkins.com.ibm.jenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class launchappTest {
	public WebDriver driver;
  @Test
  public void launchtest() {
	  System.out.println("browser launch");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://realestate.hommelle.com");
	  String actual=driver.getTitle();
	  String expected="Real Estate";
	  assertEquals(actual, expected);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
