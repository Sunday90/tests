package ru.wfs.tests;

import org.testng.annotations.Test;

import pageclasses.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class LoginTest {
	private WebDriver driver;
	
	
  @BeforeTest
  public void beforeMethod() {
	  //System.setProperty(“webdriver.gecko.driver”, “путь_к_exe_файлу_браузера”);
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  
  @Test
  public void testLogin() {
LoginPage lp = new LoginPage(driver);
lp.Open();
lp.mailLogon("test@test.ru", "Test");

  }
  
  
  @AfterTest
  public void afterMethod() {
  }

}
