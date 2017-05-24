package pageclasses;

import java.net.URI;
import utilities.FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {

	public WebDriver driver;
	public String Url;
	
	public void Open()
	{
		if (Url != null)
		{			
			driver.navigate().to(Url);
		}
	}
	
	public WebElement findElement(String locator, String value)
	{
		return FindElements.findElement(driver, locator, value);
	}
	
	public Boolean CheckElementExist(String locator, String value)
	{
		try
		{
			WebElement element = findElement(locator, value);
			return true;
		}
		
		catch (Exception e)
		{
			return false;
		}
	}
		
	
}
