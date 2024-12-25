package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.picocontainer.annotations.Inject;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class OffersPageStepDefinition {
	
	
TestContextSetup testcontextsetup;
PageObjectManager pageObjectManager;
public String offerPageProductName;


public OffersPageStepDefinition(TestContextSetup testcontextsetup) {
		
		this.testcontextsetup=testcontextsetup;
	}
	
	@Then("user searched for {string} shortname in offers page")
	public void user_searched_for_shortname_in_offers_page(String name) throws InterruptedException {
		
		switchToOffersPage();
		OffersPage offersPage=testcontextsetup.pageObjectManager.OffersPage();
		offersPage.searchItem(name);
		
		Thread.sleep(4000);
		offerPageProductName=offersPage.getProductName();
		System.out.println("offerpage value: "+offerPageProductName);
		System.out.println("landing value: "+testcontextsetup.landingPageProductName);
	    
	}
	
	public void switchToOffersPage() {
		
		LandingPage landingPage=testcontextsetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		testcontextsetup.genericUtils.SwitchToChildWindow();
	}
	
	@Then("validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
	    Assert.assertEquals(offerPageProductName, testcontextsetup.landingPageProductName);
	}
}
