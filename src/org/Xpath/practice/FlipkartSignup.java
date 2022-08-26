package org.Xpath.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String actualurl=driver.getCurrentUrl();
		WebElement create=driver.findElement(By.xpath("//a[@class='_14Me7y']"));
		create.click();
		WebElement mobileno=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		mobileno.sendKeys("8667550570");
		System.out.println(mobileno.getAttribute("value"));	
		WebElement cont=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		cont.click();
		WebElement pwd=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pwd.sendKeys("Vikky9694");
		WebElement login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
	}

}
