package gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import reports.ExtendReporter;

public class Gmail extends BaseTest{
	WebDriver driver ;
	String url = "http://www.gmail.com";
	//ExtendReporter Extent;
	@BeforeMethod
	public void getdriverexecutables()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
public void login() throws InterruptedException
{
//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Manju23032019@gmail.com");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("a$12345678");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
//	    try
//	    {
//	    WebDriverWait wait1 = new WebDriverWait(driver,10);
//	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3'and contains(.,'Compose')]")));
//
//	    driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3'and contains(.,'Compose')]")).click();
//	    
//	    driver.findElement(By.xpath("//span[@class='gb_ya gbii']")).click();
//	    driver.findElement(By.linkText("Sign out")).click();
//       }
//	    catch (Exception e)
//	    {
//	    	e.printStackTrace();
//	    }
	  
	    test = extent.createTest("gmailTest1");
        Assert.assertTrue(0 > 0);
	   // Assert.assertTrue(true);
	    
	
}
	@Test
	public void Test2()
	{
		extent.createTest("Testcase2");
		Assert.assertTrue(2>1);
	}
	/*@AfterMethod
	public void AfterMethod()
	{
		
		driver.close();
		
	}*/
}
