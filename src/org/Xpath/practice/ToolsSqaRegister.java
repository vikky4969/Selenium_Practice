package org.Xpath.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsSqaRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
		firstname.sendKeys("Vignesh");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
		lastname.sendKeys("Kumar");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("mrvignesh.vikky9@gmail.com");
		WebElement mobile=driver.findElement(By.xpath("//input[@id='mobile']"));
		mobile.sendKeys("8667550570");
		WebElement textarea=driver.findElement(By.xpath("//textarea[@class='upcoming__registration--input']"));
		textarea.sendKeys("Hi...This is Vignesh...");
		WebElement signup=driver.findElement(By.xpath("//button[text()='Send']"));
		signup.click();
	}

}
