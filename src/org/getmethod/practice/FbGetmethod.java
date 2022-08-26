package org.getmethod.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbGetmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		WebElement enter=driver.findElement(By.id("email"));
		enter.sendKeys("vigneshrajendran9694@gmail.com");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("vikky96940");
		String mailid=	enter.getAttribute("value");
		System.out.println("emailid: "+mailid);
		String pass= pwd.getAttribute("value");
		System.out.println("pwd: "+pass);
		WebElement login=driver.findElement(By.name("login"));
		login.click();
	

	}

}
