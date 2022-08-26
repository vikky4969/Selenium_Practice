package org.getmethod.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelAppGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("vigneshkumar");
		String getvalue=user.getAttribute("value");
		System.out.println("Google Search : "+getvalue);
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("vikky4548");
		String pass= pwd.getAttribute("value");
		System.out.println("pwd: "+pass);
		WebElement login=driver.findElement(By.id("login"));
		login.click();
	}

}
