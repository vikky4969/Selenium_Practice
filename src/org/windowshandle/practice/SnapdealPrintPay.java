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

public class SnapdealPrintPay {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		searchbox.sendKeys("Hp Laptop");
		WebElement search=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		search.click();
		WebElement search1=driver.findElement(By.xpath("(//div[@class='product-desc-rating '])[1]"));
		search1.click();
		Set<String> allwindows=	driver.getWindowHandles();
		
		for (String x : allwindows) {
			if(!x.equals(parentwindow)) {
				driver.switchTo().window(x);
			}
		}
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=	screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Screenshot\\Hp Laptop.png");
		FileHandler.copy(src, dest);
		WebElement addcart=driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		addcart.click();
		WebElement text=driver.findElement(By.xpath("(//span[@class='price'])[2]"));
		String print1=text.getText();
		System.out.println("You Pay: "+print1);
	}

}
