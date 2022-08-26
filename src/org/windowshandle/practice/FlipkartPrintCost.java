package org.windowshandle.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class FlipkartPrintCost {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		String parentwindow=driver.getWindowHandle();
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("iphone 12");
		WebElement search=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		WebElement search1=driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]"));
		search1.click();
		Set<String> allwindows=	driver.getWindowHandles();
		
		for (String x : allwindows) {
			if(!x.equals(parentwindow)) {
				driver.switchTo().window(x);
			}
		}

		WebElement addcart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		addcart.click();
		WebElement TotalCost=driver.findElement(By.xpath("//div[@class='_1dqRvU']//span"));
		String Totalamount=	TotalCost.getText();
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=	screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Screenshot\\iphone 12 Price.png");
		FileHandler.copy(src, dest);
		System.out.println("Iphone Total Cost: "+Totalamount);
	}

}
