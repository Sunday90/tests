package utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElements {

	public static WebElement findElement(WebDriver driver, String locator, String value)
	{
		WebElement element = null;
		By by = null;
		try{
			switch (locator)
			{
				case "xpath": by = By.xpath(value);
							  break;
				case "id": 	  by = By.id(value);
							  break;
				case "css":   by = By.cssSelector(value);
				  		 	  break;
				case "name":  by = By.name(value);
				  			  break;
				case "linkText": by = By.linkText(value);
								 break;
				case "partialLinkText": by = By.partialLinkText(value);
										break;
				case "tagName":  by = By.tagName(value);
								 break;	
				default: throw new Exception("Unsupported locator type");
			}
			
			element = driver.findElement(by);
			return element;
		}
		catch (Exception e)
		{
			return element;
		}
	}
	
}
