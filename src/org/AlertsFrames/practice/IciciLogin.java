package org.AlertsFrames.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement userdummy=driver.findElement(By.id("DUMMY1"));
		userdummy.click();
		WebElement username=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		username.sendKeys("vignesh");
		WebElement pwd=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pwd.sendKeys("vikky6515");
		WebElement checkbox=driver.findElement(By.id("AuthenticationFG.REMEMBER_USERID_CHECKBOX"));
		checkbox.click();
		WebElement login=driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		login.click();
	}

}
