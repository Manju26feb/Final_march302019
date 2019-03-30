package fildownloadpopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ExecuteAsyncScript;

public class demo {
static
{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	  //  JavascriptExecutor je = (JavascriptExecutor)driver;
	 //   je.executeScript("window.scrollBy(0,500)");
	 //   Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
	
	    Set<String> wh = driver.getWindowHandles();
//	   int count =  wh.size();
//	   System.out.println(count);
		ArrayList<String> wh1 = new ArrayList<>(wh);
		driver.switchTo().window(wh1.get(1));
		Thread.sleep(3000);
		
		driver.get("http://www.yahoomail.com");
		int count = wh1.size();
		for(int i =0;i<count;i++)
		{
		System.out.println(driver.switchTo().window(wh1.get(i)).getTitle());
		
		
		}
		
	
		
		
		

	}

}
