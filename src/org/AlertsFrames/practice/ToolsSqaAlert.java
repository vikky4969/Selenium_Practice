package org.AlertsFrames.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ToolsSqaAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		WebElement alert=driver.findElement(By.id("alertButton"));
		alert.click();
		Alert a1=driver.switchTo().alert();
		String text=a1.getText();
		a1.accept();
		System.out.println(text);
		WebElement waitalert=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		waitalert.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a3=driver.switchTo().alert();
		String text1=a3.getText();
		System.out.println(text1);
		a3.dismiss();
		WebElement confirm=driver.findElement(By.id("confirmButton"));
		confirm.click();
		Alert a2=driver.switchTo().alert();
		String gettext=a2.getText();
		System.out.println(gettext);
		a2.dismiss();
		WebElement prompt=driver.findElement(By.xpath("//button[@id='promtButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", prompt);
		Alert a4=driver.switchTo().alert();
		String prompttext=a4.getText();
		a4.sendKeys("Vignesh");
		a4.accept();
		System.out.println(prompttext);
	}


}
