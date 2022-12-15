package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeTestleaf {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		//create object to launch ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//To find web element of Username textbox by id
		WebElement eleusername = driver.findElement(By.id("username"));
		eleusername.sendKeys("DemoSalesManger");
	
	
		
		//To find the web element of Password textbox by id
		WebElement elePassword = driver.findElement(By.id("password"));
		
		elePassword.sendKeys("crmsfa");
		
		//To find the web element of Login button 
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();
		

	}

}
