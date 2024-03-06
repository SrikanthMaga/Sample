package com.alert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Caleneder {

public static void main(String[] args){	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ctc\\eclipse-workspace\\srikanth\\Seleninum4\\alertsourcr\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/login/");
	    WebElement userName = driver.findElement(By.id("email"));
	    userName.sendKeys("srikanth");
	    WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("1234");
	    WebElement login = driver.findElement(By.id("loginbutton"));
	   login.click();
	   
	   Select s =new Select(userName);
	   System.out.println(s);
}



}