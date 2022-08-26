package org.scrollupdown.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BesantHomeScrolldown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.besanttechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement last=driver.findElement(By.xpath("(//div[@class='foo_navs'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)",last);
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Screenshot\\Besantscrolldown1.png"); 
		FileHandler.copy(src, dest);
		WebElement mid=driver.findElement(By.xpath("//div[@class='choose_box noborder_left noborder_bottom']"));
		js.executeScript("arguments[0].scrollIntoView(false)",mid);
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src1=screen.getScreenshotAs(OutputType.FILE);
		File dest1=new File("E:\\Screenshot\\Besantscrollmid.png"); 
		FileHandler.copy(src1, dest1);
		WebElement top=driver.findElement(By.xpath("//div[@id='navbarNavDropdown']"));
		js.executeScript("arguments[0].scrollIntoView(true)",top);
		TakesScreenshot sc1=(TakesScreenshot)driver;
		File src2=sc1.getScreenshotAs(OutputType.FILE);
		File dest2=new File("E:\\Screenshot\\Besantscrolltop.png"); 
		FileHandler.copy(src2, dest2);
	}

}
