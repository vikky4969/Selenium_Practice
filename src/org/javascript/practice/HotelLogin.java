package org.javascript.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement user=driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','Vignesh9694')", user);
		String text1=js.executeScript("return arguments[0].getAttribute('value')", user).toString();
		System.out.println(text1);
		WebElement pwd=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','Vikky4969')", pwd);
		String text2=js.executeScript("return arguments[0].getAttribute('value')", pwd).toString();
		System.out.println(text2);
		WebElement login=driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", login);
	}

}
