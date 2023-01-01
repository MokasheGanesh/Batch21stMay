package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriverWait wait;
	@FindBy (xpath="//*[@role=\"presentation\"]")
	private WebElement role;
	
//	@FindBy (xpath="//*[text()='PIM']")
//	private WebElement PIM;
//	
//	@FindBy (xpath="//*[text()='Leave']")
//	private WebElement leave;
	
	
	public HomePage(WebDriver driver)
	{
	 wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyAdminTab()
	{   
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role='presentation']")));
		
		boolean result=role.isDisplayed();
		System.out.println("git demo p");
		return result;
	}
	
//	public void verifyPIMTab()
//	{
//		PIM.isDisplayed();
//	}
//	
//	public void verifyleaveTab()
//	{
//		leave.isDisplayed();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
