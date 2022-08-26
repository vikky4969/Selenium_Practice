package org.Xpath.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RebusSignup {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		WebElement icon=driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
		icon.click();
		WebElement signin=driver.findElement(By.xpath("//li[@id='signInLink']"));
		signin.click();
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame1);
		WebElement Mobileno=driver.findElement(By.xpath("//div[@class='mobileInput clearfix']//input"));
		Mobileno.sendKeys("8667550570");
		WebElement frame2=driver.findElement(By.xpath("//div[@id='recaptchaElement']//div//div//iframe"));
		driver.switchTo().frame(frame2);
		WebElement checkbox=driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]"));
		checkbox.click();
		driver.switchTo().parentFrame();
		WebElement Otp=driver.findElement(By.xpath("//div[@class='otpContainer clearfix border-r-3 otp-margin-fix']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Otp));
		Otp.click();
		} 
		
			}


