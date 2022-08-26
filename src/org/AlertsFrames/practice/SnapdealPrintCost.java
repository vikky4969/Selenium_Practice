package org.AlertsFrames.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealPrintCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		WebElement enter=driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		enter.click();
		WebElement sportsshoes=driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"));
		sportsshoes.click();
		WebElement pincode=driver.findElement(By.xpath("(//input[@class='sd-input'])[2]"));
		pincode.sendKeys("612001");
		WebElement check=driver.findElement(By.xpath("//button[@class='pincode-check']"));
		check.click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Asianshoe=driver.findElement(By.xpath("(//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[1]"));
		Asianshoe.click();
	//	Set<String> windows=driver.getWindowHandles();
		
		//driver.navigate().to("https://www.snapdeal.com/product/asian-white-mesh-textile-sport/662912850947#bcrumbLabelId:255");
		WebElement AddCart=driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		AddCart.click();
		driver.navigate().to("https://www.snapdeal.com/products/mens-footwear-sports-shoes?sort=plrty");
		WebElement JQRshoe=driver.findElement(By.xpath("//div[@id='7493990464015886500']"));
		JQRshoe.click();
		driver.navigate().to("https://www.snapdeal.com/product/jqr-moj-402-outdoor-green/7493990464015886500#bcrumbLabelId:255");
		WebElement Addcart2=driver.findElement(By.xpath("(//span[@class='intialtext'])[1]"));
		Addcart2.click();
		WebElement cart=driver.findElement(By.xpath("//div[@class='cartInner']"));
		cart.click();
		WebElement cost=driver.findElement(By.xpath("//span[@class='rfloat']"));
		String Totalcost=cost.getText();
		System.out.println(Totalcost);
	}

}
