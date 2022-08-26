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

public class AmazonPrintpopup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Motorola");
		WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();
		WebElement search1=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
		search1.click();
		Set<String> allwindows=	driver.getWindowHandles();
		
		for (String x : allwindows) {
			if(!x.equals(parentwindow)) {
				driver.switchTo().window(x);
			}
		}
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=	screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Screenshot\\Motorola.png");
		FileHandler.copy(src, dest);
		WebElement addcart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addcart.click();
		WebElement text=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-padding-base attach-primary-atc-confirm-box']//h4)[1]"));
		String print1=text.getText();
		System.out.println(print1);
	}

}
