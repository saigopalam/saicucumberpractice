package amazonpage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Entity.SetterGetters;


public class amazonepage {
WebDriver driver;
	


@FindBy(id="twotabsearchtextbox")public  WebElement searchbox;
@FindBy(id="nav-search-submit-button")public  WebElement searchbutton;
@FindBy(xpath="//*[@id=\"p_89/HP\"]/span/a/div/label/i")public  WebElement filterselecthp;
@FindBy(xpath="//span[text()='HP 14s, 5th Gen AMD Ryzen 3- 8GB RAM/512GB SSD 14 inches(35cm) Laptop, FHD IPS Micro-Edge Display/ Backlit Keyboard/Alexa/Windows 11/Fast Charge/Radeon Graphics/1.46Kg/Natural Silver) -14s-fq1089AU']")public  WebElement selectproduct;
@FindBy(xpath="//a[text()=' Add to Wish List ']")public  WebElement addwishlist;
@FindBy(xpath="//input[@name='email']")public  WebElement userid;
@FindBy(xpath="//input[@id='continue']")public  WebElement continuebutton;
@FindBy(xpath="//input[@type='password']")public  WebElement password;
@FindBy(xpath="//input[@id='signInSubmit']")public  WebElement submitbutton;
@FindBy(xpath="//*[@id=\"body\"]/div/div/div[2]/span")public  WebElement experttext;

	
	public amazonepage() 
	{
		this.driver = SetterGetters.getDriver();
		PageFactory.initElements(driver, this);
	}
	public void searchbox() {
		searchbox.sendKeys("laptops");
	}

	
	public void searchbutton() {
		searchbutton.click();
	}

	
	public void filterselecthp() {
		filterselecthp.click();
		
	}
	public void selectproduct() throws InterruptedException {
		Thread.sleep(5000);
		
		selectproduct.click();
		
	}
	
public void addwishlist() throws InterruptedException {
	Set<String>windows=driver.getWindowHandles();
	 Iterator<String> it=windows.iterator();
	  
	  String p=it.next();
	  String c=it.next();
	  
	  driver.switchTo().window(c);	
	  Thread.sleep(1000);
	  
	addwishlist.click();
	}
	
public void userid(String user) throws InterruptedException {
	Thread.sleep(1000);
	userid.sendKeys(user);
}
public void continuebutton() throws InterruptedException {
	Thread.sleep(2000);
	continuebutton.click();
}

public void password(String pass) throws InterruptedException {
	Thread.sleep(2000);
	password.sendKeys(pass);
}

public void submitbutton() throws InterruptedException, IOException {
	Thread.sleep(2000);
	submitbutton.click();
	
 File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
     FileUtils.copyFile(scrfile,new File("C:\\Users\\ravit\\Dropbox\\Screenshots\\fullscreen01.jpg"));
}
public void experttext() throws IOException, InterruptedException {
	Thread.sleep(2000);
	 String text=experttext.getText();
	 
	 org.testng.Assert.assertEquals(text, "For your security, approve the notification sent to:");
	 
File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
     FileUtils.copyFile(scrfile,new File("C:\\Users\\ravit\\Dropbox\\Screenshots\\fullscreen12.jpg"));
    

	

}
	
	
}
