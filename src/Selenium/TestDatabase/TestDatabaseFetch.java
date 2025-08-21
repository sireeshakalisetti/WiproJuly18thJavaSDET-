package testDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import com.wiprojuly.testng.TestngTestcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerHelper;

public class TestDatabaseFetch {
	
	private static final org.apache.logging.log4j.Logger log = LoggerHelper.getLogger(TestngTestcases.class);
	@Test
	public void readfromDBTest() throws ClassNotFoundException, SQLException, InterruptedException {

	// fetch the db url , password and username of the my sql db 
		String dbURL = "jdbc:mysql://localhost:3306/Studentrepo";
		String username = "root";
		String password = "Sireesha@2002";
		Class.forName("com.mysql.cj.jdbc.Driver");

		// load the my sql driver file 
		// The line Class.forName("com.mysql.cj.jdbc.Driver"); in Java is used to explicitly load and register the MySQL JDBC driver within your Java application.
		// create a connection to the data base - connecting the database to java application
		// In JDBC (Java Database Connectivity), a Connection represents an active session between a Java application and a specific database
		Connection con = DriverManager.getConnection(dbURL,username,password);
		// create the statement object 
		//In JDBC (Java Database Connectivity), a Statement object is an interface used to execute SQL statements against a relational database. It serves as a fundamental component for interacting with databases from Java applications.
 
		
		Statement st = con.createStatement();
		String selectquery = "select * from students;";
		//pass the query to the result
		ResultSet rs = st.executeQuery(selectquery);
		while(rs.next()) {
			String usrname = rs.getString("name");
			String paswd = rs.getString("class");

			ChromeOptions chromeOptions = new ChromeOptions();
			 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			// name locator 
			// enter text in username field 
			Thread.sleep(4000);
			log.info("Invoking the browser");

			WebElement us1 = driver.findElement(By.xpath("//input[@name = 'username']"));
			log.info("Entering the username");
			us1.sendKeys(usrname);
			Thread.sleep(4000);
			// enter text in password field
			WebElement pwd1 = driver.findElement
					(By.xpath("//input[@name = 'password']"));
			log.info("Entering the password");

			pwd1.sendKeys(paswd);
			// click on login button
			Thread.sleep(2000);
			WebElement loginbutton = driver.findElement
					(By.xpath("//button[@type = 'submit']"));

			loginbutton.click();
			Thread.sleep(2000);

		}
	}
}