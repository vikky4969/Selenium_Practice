package org.findelements.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		WebElement enter=driver.findElement(By.id("userName"));
		enter.sendKeys("8667550570");
		WebElement login=driver.findElement(By.xpath("//*[@id=\'checkUser\']"));
		login.click();
		WebElement email=driver.findElement(By.xpath("//*[@id=\'j_username_new\']"));
		email.sendKeys("mrvignesh.vikky9@gmail.com");
		WebElement name=driver.findElement(By.id("j_name"));
		name.sendKeys("Vignesh");
		WebElement pwd=driver.findElement(By.id("j_password"));
		pwd.sendKeys("Vikky45989");
		WebElement signup=driver.findElement(By.id("userSignup"));
		signup.click();
	}

}
