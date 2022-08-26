package org.actionsandrobo.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopcluesWeightgainer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.shopclues.com/wholesale.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		Actions ac=new Actions(driver);
		WebElement sports=driver.findElement(By.xpath("//li[@id='nav_45']"));
		ac.moveToElement(sports).perform();
		WebElement weight=driver.findElement(By.xpath("//div[@id='rightpanel_45']//div//div[1]//ul//li[3]//a"));
		weight.click();
		Set<String> allwindows=	driver.getWindowHandles();
		
		for (String x : allwindows) {
			if(!x.equals(parentwindow)) {
				driver.switchTo().window(x);
			}
		}
		WebElement search1=driver.findElement(By.xpath("(//div[@class='column col3'])[1]"));
		search1.click();
		Set<String> newwindows=	driver.getWindowHandles();
		int i=0;
		for (String x1 : newwindows) {
			if(i==2) {
				driver.switchTo().window(x1);
						}
			i++;
		}
		WebElement addcart=driver.findElement(By.xpath("//button[@id='add_cart']"));
		addcart.click();
		WebElement cart=driver.findElement(By.xpath("(//div[@class='sc_rlinks_btm']//li)[4]"));
		ac.moveToElement(cart).perform();
		WebElement viewcart=driver.findElement(By.xpath("//div[@class='buttonContainer']//a[1]"));
		viewcart.click();
		WebElement price=driver.findElement(By.xpath("//div[@id='gt-cart-price']//p[2]"));
		String text=price.getText();
		System.out.println(text);
	}

}
