package org.findelements.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//p-autocomplete[@id='origin']/span/input"));
		user.sendKeys("KUMBAKONAM");
		WebElement to=driver.findElement(By.xpath("//p-autocomplete[@id='destination']/span/input"));
		to.sendKeys("CHENNAI EGMORE");
	
	}

}
