package org.AlertsFrames.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SprintLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement privacy=driver.findElement(By.xpath("//div[@class='xpr-button']//button"));
		privacy.click();
		WebElement account=driver.findElement(By.linkText("Continue to Sprint"));
		account.click();
		WebElement login=driver.findElement(By.id("loginHeaderButton"));
		login.click();

	}

}
