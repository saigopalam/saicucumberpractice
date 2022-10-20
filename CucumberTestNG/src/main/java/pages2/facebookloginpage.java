package pages2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Entity.SetterGetters;

public class facebookloginpage {
WebDriver driver;
	
@FindBy(xpath="//input[@id='email']")public  WebElement username;
@FindBy(xpath="//input[@id='pass']") public WebElement password;
@FindBy(xpath="//button[@name='login']")public  WebElement loginbtn;
@FindBy(xpath="//div[@class='_9ai5']")public WebElement close;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public facebookloginpage() 
	{
		this.driver = SetterGetters.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String user) {
		username.sendKeys(user);
	}

	// Method to enter password
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	// Method to click on Login button
	public void clickLogin() {
		loginbtn.click();
	}
	public void alertclose() {
		/*Alert alert=driver.switchTo().alert();
		   alert.dismiss();*/
		close.click();
	}

}
