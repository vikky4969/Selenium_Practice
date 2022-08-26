package org.actionsandrobo.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwiggyRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/chennai/login-besant-nagar-adyar");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement signin=driver.findElement(By.xpath("(//div[@class='_2CgXb'])[2]"));
		ac.click(signin).perform();
		WebElement mobile=driver.findElement(By.xpath("//input[@id='mobile']"));
		ac.sendKeys(mobile, "8667550570").doubleClick().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		/*
		 * WebElement login=driver.findElement(By.xpath("//a[@class='a-ayg']"));
		 * ac.click(login).perform(); WebElement
		 * otp=driver.findElement(By.xpath("//input[@id='otp']"));
		 * r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_V);
		 * r.keyRelease(KeyEvent.VK_V); r.keyRelease(KeyEvent.VK_CONTROL);
		 */
	}

}
