package org.findelements.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		WebElement enter=driver.findElement(By.name("text"));
		enter.sendKeys("mrvignesh.vikky9@gmail.com");
		/*
		 * WebElement pwd=driver.findElement(By.id("pass")); pwd.sendKeys("vikky24740");
		 * WebElement login=driver.findElement(By.name("login")); login.click();
		 */
	}

}
