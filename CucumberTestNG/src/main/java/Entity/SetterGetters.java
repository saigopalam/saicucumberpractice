package Entity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SetterGetters 
{
	
	// Constructor that will be automatically called as soon as the object of the
		// class is created
		public SetterGetters(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	public static WebDriver driver;

	public static WebDriver getDriver()
	{
		return driver;
	}

	public static void setDriver(WebDriver driver) 
	{
		SetterGetters.driver = driver;
	}

}
