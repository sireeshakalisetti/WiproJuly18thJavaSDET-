package com.wiprojuly.javasdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChromeBrowser {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();//list of commands given to chrome before opening it.
		WebDriverManager.chromedriver().setup();//web driver is like remote control which helps us to control web browsers
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

	}

}
