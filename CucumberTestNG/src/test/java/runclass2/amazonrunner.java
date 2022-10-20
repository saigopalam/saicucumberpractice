package runclass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Entity.SetterGetters;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = "src/test/resources",
 glue = {"amazondefi"},
 dryRun = false,
 monochrome = false, 
 tags = "@amazonperfamance", 
 plugin = { "pretty",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 "html:Reports/HtmlReport/cucumber-reports.html",})
public class amazonrunner extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	

	@BeforeClass
	public void setup() throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ravit\\Downloads\\chromedriver\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		SetterGetters.setDriver(driver);		
	}
	
	@Test
	public void testclass()
	{
		
	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}

