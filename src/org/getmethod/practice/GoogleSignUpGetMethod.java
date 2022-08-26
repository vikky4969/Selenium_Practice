package org.getmethod.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignUpGetMethod {

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
		WebElement showpwd=driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
		showpwd.click();
		WebElement next=driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		next.click();
		String get1=firstname.getAttribute("value");
		String get2=lastname.getAttribute("value");
		String get3=email.getAttribute("value");
		String get4=pwd.getAttribute("value");
		String get5=confpwd.getAttribute("value");
		System.out.println("Firstname: "+get1);
		System.out.println("lastname: "+get2);
		System.out.println("email: "+get3);
		System.out.println("pwd: "+get4);
		System.out.println("Confpwd: "+get5);
		
	}

}
