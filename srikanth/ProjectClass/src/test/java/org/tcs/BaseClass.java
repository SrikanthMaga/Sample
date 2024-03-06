package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass{
	public static WebDriver driver;
public static void broweserLaunch() {
	driver = new ChromeDriver();
}
public static void maximize() {
	driver.manage().window().maximize();
}
public static void loadUrl(String url) {
	driver.get(url);
}
public static void sendKeys(WebElement element,String data) {
	element.sendKeys(data);
}
	
}

