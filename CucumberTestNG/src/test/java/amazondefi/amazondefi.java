package amazondefi;

import java.io.IOException;

import amazonpage.amazonepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class amazondefi {


	amazonepage ap=new amazonepage();
	
	@Given("i should opens the application")
	public void i_should_opens_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
	}


	
	
	@When("in search box search laptops")
	public void in_search_box_search_laptops() {
		ap.searchbox();
		ap.searchbutton();
		
	}

	@And("in filter box select hp and select one product")
	public void in_filter_box_select_hp_and_select_one_product() throws InterruptedException {
		ap.filterselecthp();
		Thread.sleep(5000);
		
		ap.selectproduct();
	}
	@And("slected product add into wishlist")
	public void slected_product_add_into_wishlist() throws InterruptedException {
		Thread.sleep(1000);
		ap.addwishlist();
		
	}
	@And("user provides required username and password credentials")
	public void user_provides_required_username_and_password_credentials() throws InterruptedException, IOException {
		Thread.sleep(1000);
		ap.userid("9000268182");
		ap.continuebutton();
		ap.password("9989983131");
		ap.submitbutton();
		
	}
	
	
	

	@Then("user get text For your security approve the notification sent to")
	public void user_get_text_For_your_security_approve_the_notification_sent_to() throws InterruptedException, IOException {
		Thread.sleep(2000);
		ap.experttext();
		
		
	}
}
