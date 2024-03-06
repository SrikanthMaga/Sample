package com.test.reuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BasseClass {
public static WebDriver driver;
public static void launchDriver() {
	driver =new FirefoxDriver();
}
public static void setEnvironment() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ctc\\eclipse-workspace\\srikanth\\ReUseTest\\source\\geckodriver.exe");
}
public static void maximise() {
	driver.manage().window().maximize();
}
public static void sendData(WebElement element,String data) {
	element.sendKeys(data);
	
}
public static void click(WebElement element) {
	element.click();

}
public static void loadUrl(String url) {
	driver.get(url);
	

}



}
	
	
	


 