package org.AlertsFrames.practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QavboxDemoFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://qavbox.github.io/demo/iframes/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		WebElement username=driver.findElement(By.xpath("//input[@id='input1']"));
		username.sendKeys("VigneshKumar");
		driver.switchTo().frame("Framename1");
		List<WebElement> click=driver.findElements(By.tagName("a"));
		for (WebElement y : click) {
			y.click();
		}
		//Thread.sleep(5000);
		Set<String> multiple=driver.getWindowHandles();
		int i=0;
		for (String x : multiple) {
			if(i!=0) {
				driver.switchTo().window(x);
				//Thread.sleep(5000);
				driver.close();
			}
			i++;
		}

		driver.switchTo().window(parent); 
		driver.switchTo().frame(1); 
		WebElement  enter=driver.findElement(By.xpath("//input[@id='frameinput']"));
		enter.sendKeys("Vignesh");
		WebElement click3=driver.findElement(By.xpath("//a[text()='Category3']"));
		click3.click();
		Set<String> multiples=driver.getWindowHandles();
		for (String z : multiples) {
			if(z!=parent) {
				driver.switchTo().window(z);
			}
		}
		driver.close();
	}
}
