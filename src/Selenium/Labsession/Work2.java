package Labsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Work2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Action class is used to simulate the mouse related activities
		Actions act = new Actions(driver);
		
		WebElement mo = driver.findElement(By.xpath("//button[@id='mousehover']"));
		act.moveToElement(mo).perform();
		
		Thread.sleep(2000);
		WebElement top = driver.findElement(By.xpath("//a[@href='#top']"));
		act.click(top).perform();
		
		Thread.sleep(2000);
		String cUrl = driver.getCurrentUrl();
		if (cUrl.contains("#top")) {
		    System.out.println("Navigated to Top");
		} else {
		    System.out.println("URL did not change");
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
	/*public static WebDriver driver;
	public static void main(String[] args) {
		try {
			ChromeOptions co=new ChromeOptions();
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver(co);
			String url="https://rahulshettyacademy.com/AutomationPractice";
			driver.get(url);
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//Actions class is used to  simulate mouse related activities
			
			Actions act=new Actions(driver);
			
			WebElement mouseHover =driver.findElement(By.xpath("//button[@id='mousehover']"));
			act.moveToElement(mouseHover).perform();
			Thread.sleep(4000);
			WebElement top = driver.findElement(By.xpath("//a[@href ='#top']"));
			act.click(top).perform();
			Thread.sleep(4000);
			
			/*String cUrl = driver.getCurrentUrl();
			if (cUrl.contains("#top")) {
			    System.out.println("Navigated to Top");
			} else {
			    System.out.println("URL did not change");
			}
			
			Thread.sleep(2000);
				
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		finally {
			driver.close();
			
		}*/
