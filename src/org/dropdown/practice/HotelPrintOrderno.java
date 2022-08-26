package org.dropdown.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelPrintOrderno {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("Vignesh9694");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("WW40NP");
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		WebElement location=driver.findElement(By.xpath("//select[@name='location']"));
		Select dd=new Select(location);
		dd.selectByIndex(2);
		WebElement hotel=driver.findElement(By.xpath("//select[@id='hotels']"));
		Select dd1=new Select(hotel);
		dd1.selectByIndex(2);
		WebElement room=driver.findElement(By.xpath("//select[@id='room_type']"));
		Select dd2=new Select(room);
		dd2.selectByIndex(2);
		WebElement roomno=driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select dd3=new Select(roomno);
		dd3.selectByIndex(2);
		WebElement adultroom=driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select dd4=new Select(adultroom);
		dd4.selectByIndex(2);
		WebElement childroom=driver.findElement(By.xpath("//select[@id='child_room']"));
		Select dd5=new Select(childroom);
		dd5.selectByIndex(2);
		WebElement search=driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
		WebElement select=driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		select.click();
		WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		WebElement firstname=driver.findElement(By.xpath("//input[@id='first_name']"));
		firstname.sendKeys("Vignesh");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys("kumar");
		WebElement address=driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("jdngjsngjnsknlnglsn");
		WebElement creditcardno=driver.findElement(By.xpath("//input[@id='cc_num']"));
		creditcardno.sendKeys("4569956212165262");
		WebElement credittype=driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select dd6=new Select(credittype);
		dd6.selectByIndex(2);
		WebElement expdate=driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select dd7=new Select(expdate);
		dd7.selectByIndex(12);
		WebElement expyear=driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select dd8=new Select(expyear);
		dd8.selectByIndex(12);
		WebElement cvv=driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("135");
		WebElement book=driver.findElement(By.xpath("//input[@id='book_now']"));
		book.click();
		Thread.sleep(10000);
		WebElement itenary=driver.findElement(By.id("my_itinerary"));
		itenary.click();
		WebElement order=driver.findElement(By.xpath("(//input[@class='select_text'])[1]"));
		 String text=order.getAttribute("value");
		System.out.println("Order no. "+text);
	
	}

}
