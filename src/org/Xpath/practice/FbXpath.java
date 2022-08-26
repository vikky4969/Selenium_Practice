package org.Xpath.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement enter=driver.findElement(By.xpath("//input[@id='email']"));
		enter.sendKeys("mrvignesh.vikky9@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("//div[@id='passContainer']//input"));
		pwd.sendKeys("vikky24740");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	}

}
