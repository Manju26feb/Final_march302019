package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> listLinks = driver.findElements(By.xpath("//a"));
		int linkcount = listLinks.size();
		System.out.println("CountOfLinks"+linkcount);
		List<WebElement> listimages = driver.findElements(By.xpath("//img"));
		int imagecount = listimages.size();
		System.out.println("CountOfImages"+imagecount);
		
		List<WebElement> listbuttons = driver.findElements(By.xpath("//buttons"));
		int buttoncount = listbuttons.size();
		System.out.println("CountOfRadiobuttons"+buttoncount);
		
		List<WebElement> listtextboxes = driver.findElements(By.xpath("//input[@type='text']"));
		int textboxcount = listtextboxes.size();
		System.out.println("CountOfTextBoxes"+textboxcount);
		
		List<WebElement> listradiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));
		int radiobuttoncount = listradiobuttons.size();
		System.out.println("CountOfRadiobuttons"+radiobuttoncount);
		
		

	}

}
