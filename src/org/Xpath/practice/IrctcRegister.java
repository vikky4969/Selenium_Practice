package org.Xpath.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		WebElement alert=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		alert.click();
		WebElement register=driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[2]"));
		register.click();
		WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
		username.sendKeys("Vikky");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='usrPwd']"));
		pwd.sendKeys("Vikky@96940");
		WebElement confpwd=driver.findElement(By.xpath("//input[@id='cnfUsrPwd']"));
		confpwd.sendKeys("Vikky@96940");
	
	}

}
