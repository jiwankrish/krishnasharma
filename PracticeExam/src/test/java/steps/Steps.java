package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestPage;
import util.BrowserFactory;

public class Steps {
	WebDriver driver;
	TestPage testPage;
	
	@Given("Set background button available")
	public void set_SkyBlueBackground_button_available() {
		driver = BrowserFactory.startBrowser();
		// Instantiate TestPage Class
		testPage = PageFactory.initElements(driver, TestPage.class);
		testPage.validateSkyBlueButton().isDisplayed();
		testPage.validateWhiteButton().isDisplayed();
	}

	@When("The user click the blue button")
	public void the_user_click_the_blue_button() {
	    testPage.clickSkyBlueButton();
	}

	@Then("The background change")
	public void the_background_change() {
	}

	@When("The user click the white button")
	public void the_user_click_the_white_button() {
		testPage.clickWhiteButton();
	}

}
