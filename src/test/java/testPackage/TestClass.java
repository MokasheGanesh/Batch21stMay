package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.HomePage;
import pomPackage.LogInpage;



public class TestClass
{
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		//(verify login functionality)
		LogInpage login= new LogInpage(driver);
				  login.sendUserName();
				  login.sendpassword();
				  login.clickOnLoginButton();
	
			//(verify home page)
		 HomePage home = new HomePage(driver);
					  home.verifyAdminTab();
					  home.verifyleaveTab();
					  home.verifyPIMTab();
					
	
			
		
	}
	
	
	
}
