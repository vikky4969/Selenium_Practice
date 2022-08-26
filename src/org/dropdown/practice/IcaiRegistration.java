package org.dropdown.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IcaiRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.icaionlineregistration.org/Admin_Module/login.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		WebElement reg=driver.findElement(By.xpath("//a[text()='Register as Faculty']"));
		reg.click();
		WebElement pou=driver.findElement(By.xpath("//select[@id='ddlPOU']"));
		Select dd=new Select(pou);
		dd.selectByValue("115");
		WebElement sal=driver.findElement(By.xpath("//select[@id='ddlSalutation']"));
		Select dd1=new Select(sal);
		dd1.selectByIndex(4);
		WebElement firstname=driver.findElement(By.xpath("//input[@id='txt_name']"));
		firstname.sendKeys("Vignesh");
		WebElement midname=driver.findElement(By.xpath("//input[@id='txtSecName']"));
		midname.sendKeys("Kumar");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='txt_lastname']"));
		lastname.sendKeys("Rajendran");
		WebElement dob=driver.findElement(By.xpath("//input[@id='txt_dob']"));
		dob.click();
		WebElement today=driver.findElement(By.xpath("//div[@id='CalExt_DOB_today']"));
		today.click();
		WebElement address=driver.findElement(By.xpath("//textarea[@id='Txt_add']"));
		address.sendKeys("fsghouoouogfhno");
		WebElement state=driver.findElement(By.xpath("//select[@id='ddl_state']"));
		Select dd2=new Select(state);
		dd2.selectByValue("64");
		WebElement city=driver.findElement(By.xpath("//select[@id='ddl_City']"));
		Select dd3=new Select(city);
		dd3.selectByValue("73");
		WebElement email=driver.findElement(By.xpath("//input[@id='txt_mail']"));
		email.sendKeys("vigneshrajendran9694@gmail.com");
		WebElement landline=driver.findElement(By.xpath("//input[@id='txt_lndln']"));
		landline.sendKeys("04352424740");
		WebElement mobile=driver.findElement(By.xpath("//input[@id='txt_mbl']"));
		mobile.sendKeys("8667550570");
		WebElement pincode=driver.findElement(By.xpath("//input[@id='txt_pin']"));
		pincode.sendKeys("612001");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='txt_pswd']"));
		pwd.sendKeys("vignesh123");
		WebElement confpwd=driver.findElement(By.xpath("//input[@id='txt_Repswd']"));
		confpwd.sendKeys("vignesh123");
		WebElement next=driver.findElement(By.xpath("//input[@id='Button1']"));
		next.click();
	}

}
