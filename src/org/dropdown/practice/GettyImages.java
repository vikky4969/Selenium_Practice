package org.dropdown.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettyImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.gettyimages.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.xpath("//div[@class='DesktopMediaFilter-module__mainLabel___h1cMI']"));
		searchbox.click();
		WebElement click1=driver.findElement(By.xpath("(//li[@class='DesktopMediaFilter-module__headerOption___Sl3Pf'])[2]"));
		click1.click();
	}

}
