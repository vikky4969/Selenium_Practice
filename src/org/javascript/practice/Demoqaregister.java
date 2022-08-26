package org.javascript.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqaregister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		js.executeScript("arguments[0].setAttribute('value','Vignesh')", firstname);
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		js.executeScript("arguments[0].setAttribute('value','kumar')", lastname);
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		js.executeScript("arguments[0].setAttribute('value','mrvignesh.vikky9@gmail.com')", email);
		WebElement gender=driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		js.executeScript("arguments[0].click()", gender);
		WebElement mobile=driver.findElement(By.xpath("//input[@id='userNumber']"));
		js.executeScript("arguments[0].setAttribute('value','8667550570')", mobile);
		/*
		 * WebElement subject=driver.findElement(By.
		 * xpath("(//div[@class='css-12jo7m5 subjects-auto-complete__multi-value__label'])[1]"
		 * )); subject.sendKeys("e");
		 */
		WebElement sports=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		js.executeScript("arguments[0].click()", sports);
		WebElement reading=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		js.executeScript("arguments[0].click()", reading);
		WebElement music=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		js.executeScript("arguments[0].click()", music);
		WebElement address=driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[8]//textarea"));
		address.sendKeys("kumbakonam");
	}

}
