package testng_exercises;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Inside test method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside before method");
		 // System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			

		  driver = new org.openqa.selenium.chrome.ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
			System.out.println(driver.getCurrentUrl());
  }

  @AfterTest
  public void afterSuite()  {
	  System.out.println("Inside after method");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("txtUsername")).sendKeys("rajpoun");
	  driver.findElement(By.id("txtPassword")).sendKeys("poun@#1234");
	  Thread.sleep(2000);
	  driver.findElement(By.name("Submit")).click();
	  
  }

}
