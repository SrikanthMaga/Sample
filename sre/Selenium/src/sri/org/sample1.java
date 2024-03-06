package sri.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ctc\\eclipse-workspace\\sre\\Selenium Task 1\\task source1\\geckodriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");	
	
	
}
}
