package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Repositary extends BaseClass{
public static WebElement userName() {
	WebElement userName = driver.findElement(By.id("username"));
	return userName;
}
public static WebElement passWord() {
	WebElement passWord = driver. findElement(By.id("password"));
	return passWord;
}
}
