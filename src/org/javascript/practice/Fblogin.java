package org.javascript.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement enter=driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].setAttribute('value','vignesh')", enter);
		String text1=	((JavascriptExecutor)driver).executeScript("return arguments[0].getAttribute('value')", enter).toString();
		WebElement pwd=driver.findElement(By.xpath("//div[@id='passContainer']//input"));
		js.executeScript("arguments[0].setAttribute('value','vikky@24740')", pwd);
		String text2=((JavascriptExecutor)driver).executeScript("return arguments[0].getAttribute('value')", pwd).toString();
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click()", login);
		System.out.println(text1);
		System.out.println(text2);
	}

}
