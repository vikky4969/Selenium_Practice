package org.actionsandrobo.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleMouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement apps=driver.findElement(By.xpath("//div[@class='gb_yf']"));
		ac.click(apps).perform();
		driver.switchTo().frame("app");
		WebElement gmail=driver.findElement(By.xpath("(//a[@class='tX9u1b'])[7]"));
		ac.click(gmail).perform();
	}

}
