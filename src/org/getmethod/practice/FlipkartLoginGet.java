package org.getmethod.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("8667550570");
		String text1=email.getAttribute("value");
		WebElement pwd=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pwd.sendKeys("Vikky9694");
		String text2=pwd.getAttribute("value");
		WebElement login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		System.out.println("Email: "+text1);
		System.out.println("pwd: "+text2);
		String loginurl=driver.getCurrentUrl();
		System.out.println(loginurl);
	}

}
