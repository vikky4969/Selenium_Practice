package org.actionsandrobo.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealFootwear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement womensfashion=driver.findElement(By.xpath("//div[@class='leftNavWrapperRevamp']//ul//li[2]"));
		ac.moveToElement(womensfashion).perform();
		WebElement heels=driver.findElement(By.xpath("(//div[@class='colDataInnerBlk'])[4]//p[10]//a"));
		heels.click();
	}

}
