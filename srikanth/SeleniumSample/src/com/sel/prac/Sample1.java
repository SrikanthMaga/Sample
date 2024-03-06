package com.sel.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ctc\\eclipse-workspace\\srikanth\\SeleniumSample\\seleniumsource\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    WebElement login = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[2]"));
	    login.click();
	    WebElement phNo = driver.findElement(By.xpath("//input[@type='email']"));
	    phNo.sendKeys("8778432675");
	    WebElement button = driver.findElement(By.id("continue"));
	    button.click();
	    WebElement otp = driver.findElement(By.id("continue"));
	    otp.click();
	    Thread.sleep(5000);
	    WebElement button1 = driver.findElement(By.xpath("//input[@type='submit'])[1]"));
	    button1.click();
}
}