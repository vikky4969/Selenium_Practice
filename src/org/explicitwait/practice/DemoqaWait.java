package org.explicitwait.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoqaWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement enable=driver.findElement(By.xpath("//button[@id='enableAfter']"));
		String text=enable.getText();
		System.out.println(text);
		WebElement color=driver.findElement(By.xpath("//button[@id='colorChange']"));
		String text1=color.getCssValue("color");
		System.out.println(text1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='visibleAfter']")));
		WebElement visible=driver.findElement(By.xpath("//button[@id='visibleAfter']"));
		//wait.until(ExpectedConditions.elementToBeClickable(visible));
		String text2=visible.getText();
		System.out.println(text2);
	}

}
