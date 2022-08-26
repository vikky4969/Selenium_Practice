package org.actionsandrobo.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopcluesMouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.shopclues.com/wholesale.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		Actions ac=new Actions(driver);
		WebElement Mobiles=driver.findElement(By.xpath("//li[@id='nav_44']"));
		ac.moveToElement(Mobiles).perform();
		WebElement mi=driver.findElement(By.xpath("((//div[@id='column_0'])[1]//a)[3]"));
		mi.click();
		Set<String> allwindows=	driver.getWindowHandles();
		
		for (String x : allwindows) {
			if(!x.equals(parentwindow)) {
				driver.switchTo().window(x);
			}
		}
		WebElement range=driver.findElement(By.xpath("//div[@id='mCSB_7_container']//li[1]"));
		range.click();
	}

}
