package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Entity.SetterGetters;

public class loginPage {

	WebDriver driver;
	
	@FindBy(id="txtUsername")
	public WebElement uName;
	
	@FindBy(id="txtPassword")
	public WebElement pswd;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public loginPage() 
	{
		this.driver = SetterGetters.getDriver();
		PageFactory.initElements(driver, this);
	}
	// Method to enter username
	public void enterUsername(String user) {
		uName.sendKeys(user);
	}

	// Method to enter password
	public void enterPassword(String pass) {
		pswd.sendKeys(pass);
	}

	// Method to click on Login button
	public void clickLogin() {
		loginBtn.click();
	}

}
