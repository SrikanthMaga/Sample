package com.alert;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ctc\\eclipse-workspace\\srikanth\\Seleninum4\\alertsourcr\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01maahu9c6cibhwzm9yjqf4ssz627767.node0");
WebElement simpleAlert = driver.findElement(By.xpath("(//button[@role='button'])[1]"));
simpleAlert.click();
 Alert data = driver.switchTo().alert();
data.accept();

}
}
