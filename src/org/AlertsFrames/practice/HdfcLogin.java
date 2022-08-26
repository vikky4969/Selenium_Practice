package org.AlertsFrames.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		WebElement customerid=driver.findElement(By.name("fldLoginUserId"));
		customerid.sendKeys("65161");
		WebElement cont=driver.findElement(By.linkText("CONTINUE"));
		cont.click();
		WebElement pwd=driver.findElement(By.id("fldPasswordDispId"));
		pwd.sendKeys("vikky6515");
		WebElement login=driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		login.click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		alert.dismiss();
		System.out.println(text);
	}

}
