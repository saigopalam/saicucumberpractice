package stepDefinations;

import Entity.SetterGetters;
import Pages.LeavePage;
import Pages.dashBoard;
import Pages.loginPage;
import io.cucumber.java.en.*;

public class stepDefination
{
	loginPage lp = new loginPage();
	dashBoard dB = new dashBoard();
	LeavePage page=new LeavePage();
	
	

	@Given("when user opens the application")
	public void when_user_opens_the_application() 
	{
		//System.out.println("Title of the page after loading: " + SetterGetters.getDriver().getTitle());
	}

	@When("user provides required {string} and {string} credentials")
	public void user_provides_required_and_credentials(String name, String pwd) {
		lp.enterUsername(name);
		lp.enterPassword(pwd);
	}
	
	@When("user provides required username and password credentials")
	public void user_provides_required_and_credentials() {
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
	}

	@And("log in to the application")
	public void log_in_to_the_application() {
		lp.clickLogin();
	}

	@Then("logout of the application")
	public void logout_of_the_application() throws InterruptedException {
		dB.clickLogout();
	}
    
	@And("User click on leave button")
	public void User_click_on_leave_button() throws InterruptedException {
		page.Leavelist();
		
	}

	
	
	
}
