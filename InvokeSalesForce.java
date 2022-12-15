package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeSalesForce {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		//Open the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open the application
		driver.get("https://login.salesforce.com/");
		
		//To locate the username
		WebElement username = driver.findElement(By.id("username"));
		
		//To enter the username in text
		username.sendKeys("hari.radhakrishnan@qeagle.com");
		
		//To locate the password 
		WebElement pwd = driver.findElement(By.id("password"));
		
		//to enter the password in the text
		pwd.sendKeys("Testleaf$321");
		
		//to locate Login button
		WebElement Login = driver.findElement(By.name("Login"));
		
		//to click Log In button
		Login.click();
		
	}

}
