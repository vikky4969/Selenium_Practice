package org.windowshandle.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LVBprintStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		WebElement forgotpwd=driver.findElement(By.xpath("(//a[text()='Forgot Password'])[1]"));
		forgotpwd.click();
		WebElement username=driver.findElement(By.xpath("//input[@id='uid|input']"));
		username.sendKeys("Vignesh");
		String text=username.getAttribute("value");
		System.out.println("Print Statement: "+text);
	}

}
