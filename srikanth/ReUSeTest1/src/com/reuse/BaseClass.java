package com.reuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
		public static WebDriver driver;
		public static void browserLaunch() {
		driver = new ChromeDriver();
		}
		public static void maximize() {
		driver.manage().window().maximize();
		}
		public static void setEnvironment() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ctc\\eclipse-workspace\\srikanth\\ReUSeTest1\\reuessource\\chromedriver.exe");
			}
		public static void loadUrl(String url) {
		driver.get(url);
		}
		
			
		}

		

