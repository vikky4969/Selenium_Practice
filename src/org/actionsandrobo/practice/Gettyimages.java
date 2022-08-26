package org.actionsandrobo.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gettyimages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		WebElement bankdrag=driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement bankdrop=driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		ac.dragAndDrop(bankdrag, bankdrop).perform();
		
		WebElement bankdebit=driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement bankdebitdrop=driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		ac.dragAndDrop(bankdebit, bankdebitdrop).perform();
		
		WebElement salesdrag=driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement salesdrop=driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[4]"));
		ac.dragAndDrop(salesdrag, salesdrop).perform();
		
		WebElement salescredit=driver.findElement(By.xpath("//li[@id='fourth'][2]"));
		WebElement salescreditdrop=driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
		ac.dragAndDrop(salescredit, salescreditdrop).perform();
	}

}
