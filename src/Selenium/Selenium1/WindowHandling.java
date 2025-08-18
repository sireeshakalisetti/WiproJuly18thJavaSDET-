package com.wiprojuly.javasdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
		public static WebDriver driver;
		public static void main(String[] args) {
			try {
				ChromeOptions co=new ChromeOptions();
				
				WebDriverManager.chromedriver().setup();
				
				driver= new ChromeDriver(co);
				String url="https://the-internet.herokuapp.com/windows";
				driver.get(url);
				
				Thread.sleep(2000);
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				WebElement clickhere = driver.findElement(By.xpath("//a[contains[text(),'Click Here']"));
				clickhere.click();
				
				Thread.sleep(2000);
				
				Object [] windowHandles = driver.getWindowHandles().toArray();
				
				System.out.println(windowHandles);
				
				driver.switchTo().window((String) windowHandles[1]);
				
				//assert on tiltle of new window 
				String title = driver.getTitle();
				System.out.println(title);
				
				Thread.sleep(2000);
				
				driver.close();
				
				driver.switchTo().window((String) windowHandles[0]);
				
					
				
			}catch(Exception e){
				System.out.println(e);
				
			}
			finally {
				driver.quit();
				
			}
		}
	}

