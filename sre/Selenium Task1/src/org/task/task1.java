package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class task1 {
public static void main(String[] args) {
	System.getProperty("webdriver.gecko.driver", "C:\\Users\\ctc\\eclipse-workspace\\sre\\Selenium Task1\\task 1 source\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}
}
