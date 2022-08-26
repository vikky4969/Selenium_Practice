package org.Xpath.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement signin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		ac.moveToElement(signin).build().perform();
		WebElement start=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']//a"));
		start.click();
		WebElement firstname=driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		firstname.sendKeys("Vikky@24740");
		WebElement mobileno=driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		mobileno.sendKeys("8667550570");
		WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("vigneshrajendran9694@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='ap_password']"));
		pwd.sendKeys("Vikky@24740");
		
	}

}
