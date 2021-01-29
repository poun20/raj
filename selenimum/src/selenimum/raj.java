package selenimum;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class raj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver Chrome = new ChromeDriver();
		Chrome.get("http://www.google.co.in");
		System.out.println(Chrome.getCurrentUrl());

	}

}
