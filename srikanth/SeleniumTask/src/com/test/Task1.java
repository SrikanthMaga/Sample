package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Task1 {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\ctc\\eclipse-workspace\\srikanth\\SeleniumTask\\seleniumtasksource\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    WebElement search  = driver.findElement(By.id("twotabsearchtextbox"));
   search.sendKeys("Samsung galaxy s23");
    WebElement searchButton =  driver.findElement(By.xpath("//input[@type='submit']"));
   searchButton.click();   
   
	
}
}
