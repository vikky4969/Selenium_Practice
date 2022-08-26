package org.findelements.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("vignesh");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("vikky4548");
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		
	}

}
