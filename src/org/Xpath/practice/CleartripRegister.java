package org.Xpath.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CleartripRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement Register=driver.findElement(By.xpath("//a[text()='Register']"));
		Register.click();
		WebElement email=driver.findElement(By.xpath("//input[@id='username1']"));
		email.sendKeys("vigneshrajendran9694@gmail.com");
		WebElement create=driver.findElement(By.xpath("//button[@id='registerButton']"));
		create.click();
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("Vikky@96940");
		WebElement title=driver.findElement(By.xpath("//select[@id='profile_title']"));
		title.sendKeys("Mr");
		WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("Vignesh");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("Kumar");
		WebElement mobileno=driver.findElement(By.xpath("//input[@id='mobile_number']"));
		mobileno.sendKeys("8667550570");
		WebElement submit=driver.findElement(By.xpath("//button[@id='signUpButton']"));
		submit.click();
	}

}
