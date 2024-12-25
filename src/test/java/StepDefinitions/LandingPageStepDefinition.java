package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.picocontainer.annotations.Inject;
import org.testng.Assert;

import PageObjects.LandingPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {
	
	public WebDriver driver;
	public String offerPageProductName;
	
	TestContextSetup testcontextsetup;
	
	public LandingPageStepDefinition(TestContextSetup testcontextsetup) {
		
		this.testcontextsetup=testcontextsetup;
	}
		
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		
		}
		
		
		@When("user searched with Shortname {string} and extracted actual product name")
		public void user_searched_with_shortname_and_extracted_actual_product_name(String name) throws InterruptedException {
			LandingPage landingPage=testcontextsetup.pageObjectManager.getLandingPage();
		landingPage.searchItem(name);
		Thread.sleep(4000);
		testcontextsetup.landingPageProductName=landingPage.getproductName().split("-")[0].trim();
		System.out.println("value: "+testcontextsetup.landingPageProductName);
		   
		}
		
	

}
