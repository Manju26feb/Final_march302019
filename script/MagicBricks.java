package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagicBricks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.magicbricks.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("keyword")).sendKeys("Bangalore South");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Budget']")).click();
		driver.findElement(By.xpath("(//li[text()=' 40 Lac'])[1]")).click();
		driver.findElement(By.xpath("(//li[text()=' 70 Lac'])[2]")).click();
		driver.findElement(By.xpath("(//div/span[text()='Property Type'])[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Flat'])[1]")).click();
		driver.findElement(By.xpath("(//input[@title='House/Villa'])[1]")).click();
		driver.findElement(By.xpath("(//input[@title='2 BHK'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> alinks = driver.findElements(By.xpath("//a/span[contains(text(),'2 BHK Apartment')]"));
		Thread.sleep(10000);
		int no_of_Property = alinks.size();
		System.out.println("***************************");
		System.out.println("No of Property" + no_of_Property);
		System.out.println("***************************");
		/*for(int i =0;i<No_of_Property;i++)
		{
			WebElement link = alinks.get(i);
			System.out.println(link.getText());
			
		}*/
		
		driver.findElement(By.partialLinkText("New Projects")).click();
		List<WebElement> NAlllinks = driver.findElements(By.xpath("//p/strong"));
		
		System.out.println("***************************");
		Thread.sleep(5000);
		int no_of_New_Property = NAlllinks.size();
		System.out.println("***************************");
		System.out.println("No of New Property" +no_of_New_Property);
		System.out.println("***************************");
		for(int i =0;i<no_of_New_Property;i++)
		{
			WebElement link1 = NAlllinks.get(i);
			System.out.println(link1.getText());
			
		}
		
		
		//Thread.sleep(3000);
		//driver.quit();
		//li[text()=' 70 Lac'])[2]
		//ul[@text=' RESIDENTIAL']/label[@text='Flat']
		//driver.findElement(By.xpath("//span[text()='Property Type']"));
		/*driver.findElement(By.xpath("//label[text(),'Flat']")).click();
		driver.findElement(By.xpath("(//input[@title='House/Villa'])[1]")).click();
		driver.findElement(By.xpath("(//input[@title='2 BHK'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Budget']")).click();
		//driver.findElement(By.xpath("//input[@tivaluetle='Budget']")).click();*/
		
		
	}

}
