package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pomPackage.HomePage;
import pomPackage.LogInpage;
import utility.Pojo;
import utility.Screenshot;

public class TestClassA_TestNG extends Pojo{
	WebDriver driver;
	SoftAssert s= new SoftAssert();
	HomePage home;
	ExtentTest logger;
	ExtentReports extent;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		WebDriver driver=openChromeBrowser();
		this.driver= driver;
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("./test-output/velocity.html");
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("verifyLoginPage");
		 logger = extent.createTest("verifyHomePage");
		 
		 Thread.sleep(2000);
	}
	
	@Test (priority=0)
	public void verifyLoginPage() throws InterruptedException, IOException
	{
		String UN="Admin";
		String PW="admin123";
		LogInpage login= new LogInpage(driver);
		  login.sendUserName(UN);
		  login.sendpassword(PW);
		  login.clickOnLoginButton();	
		  Thread.sleep(2000);
		
		  String ActualURL = driver.getCurrentUrl();
		  System.out.println(ActualURL);
		  String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		  SoftAssert s= new SoftAssert();
		  s.assertEquals(ActualURL, ExpectedURL);
		  s.assertAll();
		  
		  
		 
	}
	
	
	@Test (priority=1)
	public void verifyHomePage() throws InterruptedException
	{
		
		System.out.println("Hello");
	}
	

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path =Screenshot.captureScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
		
		extent.flush();
	}
	
	
}
