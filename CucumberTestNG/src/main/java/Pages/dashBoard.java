package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Entity.SetterGetters;

public class dashBoard {

	WebDriver driver;
	
	@FindBy(xpath = "//a[@id='welcome' and contains(text(),'Welcome')]")
	public WebElement heading;
	
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logoutBtn;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public dashBoard() {
		this.driver = SetterGetters.getDriver();
		PageFactory.initElements(driver, this);
	}

	// Method to click on Logout button
	public void clickLogout() throws InterruptedException 
	{
		Thread.sleep(5000);
		heading.click();
		Thread.sleep(5000);
		logoutBtn.click();
	}
}
