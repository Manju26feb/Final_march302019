package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReporter {
	
	public void createReport(String Testcase,String classname,String status1)
	{
		ExtentReports extent = new ExtentReports();
		ExtentHtmlReporter re = new ExtentHtmlReporter("C:\\Users\\manjunath\\git\\repository3\\testyantra3\\Reports\\extentreport.html");
		extent.attachReporter(re);
		ExtentTest test = extent.createTest(Testcase);
		 test.log(Status.INFO, "extent report is working fine");
		 extent.flush();
		
		
	   
	}

}
