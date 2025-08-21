package com.wiprojuly.javasdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.amazon.in/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(2000);
		WebElement aboutamz = driver.findElement(By.xpath("//a[normalize-space()='About Amazon']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.scrollToElement(aboutamz).perform();
		
		Thread.sleep(2000);
		aboutamz.click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
