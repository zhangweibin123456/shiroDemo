package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomatedTesting {

	@Test
	public void test_case3() {
		System.setProperty("webdriver.firefox.bin", "E:/Program Files (x86)/Mozilla Firefox/firefox.exe");

		WebDriver driver=  new FirefoxDriver();
		
		//driver.get("https://www.baidu.com");

//		WebElement element = driver.findElement(By.name("q"));
//
//		element.sendKeys("hello Selenium!");
//
//		element.submit();

	}

}
