package org.javascript.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement username=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		js.executeScript("arguments[0].setAttribute('value','mrvignesh.vikky9@gmail.com')", username);
		WebElement pwd=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		js.executeScript("arguments[0].setAttribute('value','Vikky@96940')", pwd);
		WebElement login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		js.executeScript("arguments[0].click()", login);
	}

}
