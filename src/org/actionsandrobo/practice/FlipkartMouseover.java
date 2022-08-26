package org.actionsandrobo.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		Actions ac=new Actions(driver);
		WebElement home=driver.findElement(By.xpath("(//div[@class='eFQ30H'])[6]"));
		ac.moveToElement(home).perform();
		Thread.sleep(3000);
		WebElement furniture=driver.findElement(By.xpath("//div[@class='_3XS_gI _7qr1OC']//a[3]"));
		ac.moveToElement(furniture).perform();
		WebElement diningset=driver.findElement(By.xpath("//div[@class='_3XS_gI']//a[4]"));
		diningset.click();
		WebElement selectset=driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[2]"));
		selectset.click();
		Set<String> allwindows=	driver.getWindowHandles();
		
		for (String x : allwindows) {
			if(!x.equals(parentwindow)) {
				driver.switchTo().window(x);
			}
		}
		WebElement addcart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		addcart.click();
	}

}
