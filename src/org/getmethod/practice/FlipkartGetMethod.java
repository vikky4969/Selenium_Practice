package org.getmethod.practice;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		WebElement Mobile=driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
		String text1=Mobile.getText();
		WebElement fashion=driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		String text2=fashion.getText();
		WebElement electronics=driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		String text3=electronics.getText();
		WebElement beauty=driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		String text4=beauty.getText();
		WebElement home=driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		String text5=home.getText();
		WebElement large=driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		String text6=large.getText();
		WebElement furniture=driver.findElement(By.xpath("(//div[@class='xtXmba'])[7]"));
		String text7=furniture.getText();
		WebElement travel=driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]"));
		String text8=travel.getText();
		WebElement grocery=driver.findElement(By.xpath("(//div[@class='xtXmba'])[9]"));
		String text9=grocery.getText();
		WebElement topoffers=driver.findElement(By.xpath("//h2[@class='_2cAig-']"));
		String text10=topoffers.getText();
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
		System.out.println(text5);
		System.out.println(text6);
		System.out.println(text7);
		System.out.println(text8);
		System.out.println(text9);
		System.out.println(text10);

		
	}

}
