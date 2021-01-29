package selenimum;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("success");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.google.co.in");
		System.out.println(driver.getCurrentUrl());
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside After calss method");
  }

}
