package org.Xpath.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//div[@class='form-group ']//input"));
		user.sendKeys("8667550570");
		WebElement cont=driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		cont.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement create=driver.findElement(By.xpath("//div[@class='linkPageCreate']"));
		create.click();
		WebElement pwd=driver.findElement(By.xpath("(//div[@class='form-group ']//input)[1]"));
		pwd.sendKeys("Vikky@96940");
		WebElement fullname=driver.findElement(By.xpath("(//div[@class='form-group ']//input)[2]"));
		fullname.sendKeys("vignesh");
		WebElement email=driver.findElement(By.xpath("(//div[@class='form-group ']//input)[3]"));
		email.sendKeys("vignesh123@gmail.com");
		WebElement gender=driver.findElement(By.xpath("(//div[@class='rbContainer'])[1]"));
		gender.click();
		WebElement altermobile=driver.findElement(By.xpath("(//div[@class='form-group ']//input)[4]"));
		altermobile.sendKeys("9876543210");
		WebElement hintname=driver.findElement(By.xpath("(//div[@class='form-group ']//input)[5]"));
		hintname.sendKeys("8667550570");
	}

}
