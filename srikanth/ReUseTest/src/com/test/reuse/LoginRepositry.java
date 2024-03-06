package com.test.reuse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginRepositry extends BasseClass {
public static WebElement userName() {
	WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
	return userName;

}
public static WebElement password() {
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	return password;	
}
public static WebElement click() {
	WebElement click =  driver.findElement(By.xpath("//button[@type='submit']"));
return click;
}
}


  
