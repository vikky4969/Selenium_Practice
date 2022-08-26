package org.Xpath.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Vikky");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("kumar");
		WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
		email.sendKeys("vikkyworld4969");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='Passwd']"));
		pwd.sendKeys("Vikky@96940");
		WebElement confpwd=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		confpwd.sendKeys("Vikky@96940");
		WebElement next=driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		next.click();
	}

}
