package org.findelements.practice;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement enter=driver.findElement(By.id("email"));
enter.sendKeys("mrvignesh.vikky9@gmail.com");
WebElement pwd=driver.findElement(By.id("pass"));
pwd.sendKeys("vikky24740");
WebElement login=driver.findElement(By.name("login"));
login.click();
String s=driver.getTitle();
System.out.println(s);
String s1=driver.getCurrentUrl();
System.out.println(s1);
	}

}
