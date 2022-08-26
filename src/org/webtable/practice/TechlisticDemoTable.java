package org.webtable.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechlisticDemoTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		
		  WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		  List<WebElement> col=table.findElements(By.tagName("th"));
		  System.out.println("No.of columns: "+col.size());
		  
		 List<WebElement> rows=table.findElements(By.tagName("tr"));
		  System.out.println("No.of rows: "+rows.size());
		  System.out.println(rows.get(2).getText());
		  
		  List<WebElement>
		  col3=table.findElements(By.xpath("//table[@id='customers']//td[3]"));
		  for(WebElement webElement : col3) {
			  System.out.println(webElement.getText());
			  }
		 
	
		WebElement text1=table.findElement(By.xpath("//td[text()='Meta']//parent::tr"));
		System.out.println(text1.getAttribute("style"));
		WebElement text2=table.findElement(By.xpath("//td[text()='Meta']//ancestor::table"));
		System.out.println(text2.getAttribute("id"));
		WebElement text=table.findElement(By.xpath("//td[contains(text(),'Chang')]"));
		System.out.println(text.getText());
		WebElement text3=table.findElement(By.xpath("//td[starts-with(text(),'Francisco')]"));
		System.out.println(text3.getText());
		WebElement text4=table.findElement(By.xpath("//table[contains(@id,'customers')]"));
		System.out.println(text4.getAttribute("id"));
	}

}
