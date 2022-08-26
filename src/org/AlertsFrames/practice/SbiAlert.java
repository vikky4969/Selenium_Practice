package org.AlertsFrames.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		login.click();
		WebElement login1=driver.findElement(By.id("Button2"));
		login1.click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		alert.dismiss();
		System.out.println(text);
	}

}
