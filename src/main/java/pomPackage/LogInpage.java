package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInpage {
	static WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//*[@name='username']")
	private WebElement userName;
	
	@FindBy (xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement LoginButton;
	
	
	public LogInpage(WebDriver driver)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendUserName(String UserName)
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
		userName.sendKeys(UserName);
	}
	
	public void sendpassword(String pass)
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
	
	
	
}
