package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Entity.SetterGetters;

public class LeavePage {
WebDriver driver;
	
	@FindBy(id="menu_leave_viewMyLeaveList") public WebElement leaveList;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public LeavePage() {
		this.driver = SetterGetters.getDriver();
		PageFactory.initElements(driver, this);
	}

	// Method to click on Logout button
	public void Leavelist() throws InterruptedException 
	{
		leaveList.click();
	}

}
