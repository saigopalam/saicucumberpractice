package facebookdef;

import org.openqa.selenium.WebDriver;
import Entity.SetterGetters;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages2.facebookloginpage;

public class facbookdef {
	
	facebookloginpage lp=new facebookloginpage();
	
	@Given("i should opens the application")
	public void i_should_opens_the_application () {
	
		//System.out.println("Title of the page after loading: " + SetterGetters.getDriver().getTitle());
	
		
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

	@Then("alert close")
	public void alert_close() throws InterruptedException {
		Thread.sleep(2000);
		lp.alertclose();
		
		
	}


}
