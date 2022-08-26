package org.windowshandle.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepotPrintCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='headerSearch']"));
		searchbox.sendKeys("ceiling fan");
		WebElement search=driver.findElement(By.xpath("//button[@id='headerSearchButton']"));
		search.click();
		Actions ac=new Actions(driver);
		WebElement search1=driver.findElement(By.xpath("(//img[@class='stretchy'])[1]"));
		ac.moveToElement(search1).build().perform();
		WebElement addcart=driver.findElement(By.xpath("(//button[@class='product-pod__add-to-cart bttn-outline bttn-outline--primary'])[2]"));
		addcart.click();
		//WebElement decline=driver.findElement(By.xpath("//button[@id='HDPPSelectionDeclineButton']//span"));
		//decline.click();
		WebElement text=driver.findElement(By.xpath("(//span[@class='u__bold'])[3]"));
		String print1=text.getText();
		System.out.println(print1);
	}

}
