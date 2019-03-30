package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().activeElement().sendKeys("selenium");
	
	List<WebElement> searchlist = driver.findElements(By.xpath("//span[text()='selenium']"));
	//List<WebElement> subsearchlist = driver.findElements(By.xpath("//span[text()='selenium']/text()"));
	int Rcount = searchlist.size();
	System.out.println("SearchResult"+Rcount);
	for(int i =0;i<Rcount;i++)
	{
		String SElement = searchlist.get(i).getText();
		System.out.println(SElement);
		
		
	}
	 searchlist.get(2).click();
	 
	 driver.navigate().back();
	 
	 driver.switchTo().activeElement().sendKeys("selenium");
		
	 List<WebElement> searchlist1 = driver.findElements(By.xpath("//span[text()='selenium']"));
	  Rcount = searchlist1.size();
	  System.out.println(Rcount);
	
	 for(int i=Rcount-1;i>=0;i--)
		{
			String RSElement = searchlist1.get(i).getText();
			System.out.println(RSElement);
			
			
		}
	 
	 
	 
	 
	
	}
	
	
}
