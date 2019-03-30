package gmail;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	
	@BeforeSuite
	public void Reportsetup()
	{
		extent = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\manjunath\\git\\repository3\\testyantra3\\Reports\\extentreport.html");
	    extent.attachReporter(htmlReporter);
	    extent.setSystemInfo("OS", "Windows 10");
        extent.setSystemInfo("Host Name", "Manju");
        extent.setSystemInfo("Environment", "local host");
        extent.setSystemInfo("User Name", "Manjunath G");
        
     
        htmlReporter.config().setDocumentTitle("AutomationTesting");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTheme(Theme.DARK);
     
	}
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
        {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
        	test.log(Status.PASS, "Pass");
        	test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
        else
        {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
		System.out.println(result.getStatus());
		System.out.println("After Method");
		
	}
	 @AfterSuite
	    public void tearDown()
	    {
	        extent.flush();
	    }
	

}
