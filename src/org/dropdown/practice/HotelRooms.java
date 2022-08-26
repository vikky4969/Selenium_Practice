package org.dropdown.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("Vignesh9694");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("Vikky@4969");
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		WebElement room=driver.findElement(By.xpath("//select[@id='room_type']"));
		Select dd2=new Select(room);
		List<WebElement> list=dd2.getOptions();
		for (WebElement x : list) {
			String text1=x.getText();
			System.out.println(text1);
		}
	}

}
