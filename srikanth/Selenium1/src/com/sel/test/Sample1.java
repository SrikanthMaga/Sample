package com.sel.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01eduagaiwrjgn1dty6ef1ak9un580638.node0");

		WebElement SimpleAlert = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		SimpleAlert.click();
		
		Alert Al= driver.switchTo().alert();
		
		Al.accept();
		
		}
	
	
	
	
	
	
}

