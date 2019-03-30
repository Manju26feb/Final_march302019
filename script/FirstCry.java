package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstCry {
	
	WebDriver driver;
	@BeforeMethod
	public void beforetest()
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.firstcry.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void test()
	{
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//div[@class='_pop_close _pop_reg_bg']")).click();
		List<WebElement> mainCategory = driver.findElements(By.xpath("//ul/li[@class='double']/a"));
		int count_mainCategory = mainCategory.size();
		System.out.println(count_mainCategory);
		for(int i =0;i<count_mainCategory;i++)
		{
			WebElement category = mainCategory.get(i);
			System.out.println(category.getText());
			Actions action = new Actions(driver);
			action.moveToElement(category).click().perform();
			String path = "//div[@class='option-container submenu1-1']/ul/li/a[@class='bold spacedown']";
			System.out.println(path);
			//driver.findElements(By.xpath(""));
			//div[@class='option-container submenu1-1']/ul/li/a
			
						
		}
		
		
				
	}
	@AfterMethod
	public void aftertest()
	{
		
	}

}
