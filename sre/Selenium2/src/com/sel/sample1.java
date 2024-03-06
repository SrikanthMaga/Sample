package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample1 {
public static void main(String[] args) {
	System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\ctc\\eclipse-workspace\\sre\\Selenium2\\supportingdocs2\\geckodriver.exe");
	WebDriver dri = new FirefoxDriver();
	dri.get("https://www.youtube.com/");
	
	
}
}
