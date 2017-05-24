package pageclasses;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page{

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		this.Url = "https://staging.workflowsoft.com";
	}
	
	public WebElement loginField = findElement("id", "Email");
	public WebElement passwordField = findElement("id", "Password");
	public WebElement emailLoginButton = findElement("xpath", ".//input[@value='Войти']");
	public WebElement windowsLoginButton = findElement("id", "Windows");
	public WebElement rememberMeCheckBox = findElement("id", "RememberMe");
	public WebElement forgotPasswordLink = findElement("xpath", "//a[contains(text(),'Забыли пароль?')]");
	
	public void mailLogon (String email, String password)
	{
		loginField.sendKeys(email);
		passwordField.sendKeys(password);
		emailLoginButton.click();
	}
	
	public void windowsLogon (String userName, String password) throws IOException
	{
		windowsLoginButton.click();
		Runtime.getRuntime().exec("scripts:\\WindowsLogon.exe"+ " "+userName+" "+password);
	}
}
