package org.Xpath.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealRegister {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		signin.click();
		WebElement register=driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		register.click();
		WebElement mobileno=driver.findElement(By.xpath("//input[@name='username']"));
		mobileno.sendKeys("8667550570");
		WebElement cont=driver.findElement(By.xpath("//button[@id='checkUser']"));
		cont.click();
		WebElement email=driver.findElement(By.xpath("//input[@id='j_username_new']"));
		email.sendKeys("vigneshrajendran9694@gmail.com");
		WebElement username=driver.findElement(By.xpath("//input[@id='j_name']"));
		username.sendKeys("Vikky");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='j_password']"));
		pwd.sendKeys("Vikky@96940");
		WebElement cont1=driver.findElement(By.xpath("//button[@id='userSignup']"));
		cont1.click();
	}

}
