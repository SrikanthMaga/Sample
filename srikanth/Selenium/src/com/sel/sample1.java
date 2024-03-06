package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ctc\\eclipse-workspace\\srikanth\\Selenium\\selenium source\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}
}
