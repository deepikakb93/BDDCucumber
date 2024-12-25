package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPage {
	public WebDriver driver;
	
	private By search=By.cssSelector("input.search-keyword");
	private By productName=By.cssSelector("h4.product-name");
	private By TopDeals=By.xpath("//a[contains(text(),'Top Deals')]");
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchtext() {
	 driver.findElement(search).getText();
	}
	
	public String getproductName() {
		return  driver.findElement(productName).getText();
	}

	public void selectTopDealsPage() {
		driver.findElement(TopDeals).click();
	}
	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
}
