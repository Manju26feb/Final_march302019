package yatra.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Yatra {
	
	WebDriver driver ;
	String url = "http://www.yatra.com";
	@BeforeMethod
	public void getdriverexecutables()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
public void book()
{
	     driver.findElement(By.id("booking_engine_hotels")).click();
	     driver.findElement(By.id("BE_hotel_destination_city")).sendKeys("bangalore");
	     driver.findElement(By.xpath("//div[@class='ac_results origin_ac']/descendant::li[@class='active ac_over'and contains(.,'Bangalore')]")).click();
	    // driver.findElement(By.xpath("//i[@class='font-icon icon-inside icon-calendar blur_class BE_hotel_checkin_date']")).click();
	     
	    
	    
	
}
}

