package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.partialLinkText("Create New Account")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Giri");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bala");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("1010101010");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("newPassword");

		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayValues = new Select(dayDropDown);
		dayValues.selectByVisibleText("31");

		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthValues = new Select(monthDropDown);
		monthValues.selectByVisibleText("Dec");

		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearValues = new Select(yearDropDown);
		yearValues.selectByVisibleText("2002");

		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}
