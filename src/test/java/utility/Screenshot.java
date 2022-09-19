package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	
	public static String captureScreenshot(WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path ="D:\\21st May S\\"+System.currentTimeMillis()+".jpg";
		
		 File  dest = new File(path);
		 
		 FileUtils.copyFile(source, dest);
		return path;
	}
}
