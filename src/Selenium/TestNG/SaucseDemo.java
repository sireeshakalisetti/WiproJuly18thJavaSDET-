package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



	public class SaucseDemo
	{
		public static void main(String[] args) throws Exception
		{
			ChromeOptions chromeOptions = new ChromeOptions();

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver(chromeOptions);

			driver.get("https://www.saucedemo.com/");
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
			username.sendKeys("standard_user");
			
			Thread.sleep(2000);
			
			WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("secret_sauce");
			
			Thread.sleep(2000);
			
			WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
			loginbutton.click();
			
			Thread.sleep(2000);
			
			WebElement addToCart =driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
			addToCart.click();
			
			Thread.sleep(2000);
	
			WebElement cart =driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
			cart.click();
			
			Thread.sleep(2000);
	
			WebElement checkOut =driver.findElement(By.xpath("//button[@id='checkout']"));
			checkOut.click();
			
			Thread.sleep(2000);
			
			WebElement firstName= driver.findElement(By.xpath("//input[@id='first-name']"));
			firstName.sendKeys("standard");
			
			Thread.sleep(2000);
			
			WebElement lastName= driver.findElement(By.xpath("//input[@id='last-name']"));
			lastName.sendKeys("user");
			
			Thread.sleep(2000);
			
			WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
			postalCode.sendKeys("534341");
			
			Thread.sleep(2000);
			
			WebElement continueButton =driver.findElement(By.xpath("//input[@id='continue']"));
			continueButton.click();
			
			Thread.sleep(2000);
			
			WebElement finishButton =driver.findElement(By.xpath("//button[@id='finish']"));
			finishButton.click();
			
			Thread.sleep(2000);
			
			WebElement backToHomeButton =driver.findElement(By.xpath("//button[@id='back-to-products']"));
			backToHomeButton.click();
			
			Thread.sleep(2000);
			
			WebElement menu =driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
			menu.click();
			
			Thread.sleep(2000);
			
			WebElement logOutButton =driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
			logOutButton.click();
			
			Thread.sleep(2000);
		}
	}