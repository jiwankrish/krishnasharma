package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage {
	WebDriver driver;

	public TestPage(WebDriver driver) {
		this.driver = driver;
	}

	// Find Toggle all box
	@FindBy(name = "allbox")
	WebElement TOGGLEALL;

	// Find the list of the Items
	@FindBy(xpath = "//*[contains(@id,'todos-content')]/form/ul")
	WebElement TODO_CONTENT;

	// Find Remove button
	@FindBy(xpath = "//html/body/div[3]/input[1]")
	WebElement REMOVE;
		
	// Find find add category field
	@FindBy(name = "categorydata")
	WebElement CATEGORY_DATA;

	// Find Add Category button
	@FindBy(xpath = "//*[@id='extra']/input[2]")
	WebElement ADD_CATEGORY_BUTTON;
	
	// Find find list category field
	@FindBy(xpath = "//*[@id='extra']/select[1]")
	WebElement CATEGORY_LIST;
	
	//Find SetSkyBlue Background Button
	@FindBy(xpath = "//*[@id='extra']/button[1]")
	WebElement SKY_BLUE_BUTTON;	
	
	//Find SetSkyBlue Background Button
	@FindBy(xpath = "//*[@id='extra']/button[2]")
	WebElement WHITE_BUTTON;	
	
	// Click Toggle All Box
	public void clickToggleAll() {
		TOGGLEALL.click();
	}
	
	//Add Category 

	// Return the list of TODO items check-boxes
	public <WebElements> WebElements validateSelection() {
		List<WebElement> checkBoxesList = TODO_CONTENT.findElements(By.tagName("input"));
		return (WebElements) checkBoxesList;
	}

	// Return the list of actual items
	public <WebElements> WebElements listofItems() {
		List<WebElement> itemLists = TODO_CONTENT.findElements(By.tagName("li"));
		return (WebElements) itemLists;
	}

	public WebElement validateToDoContent() {
		return TODO_CONTENT;
	}
	
	public <WebElements> WebElements validateCategoryList() {
		List<WebElement> categoryList = CATEGORY_LIST.findElements(By.tagName("option"));
		return (WebElements) categoryList;
	}

	// Click Remove button
	public void clickRemove() {
		REMOVE.click();
	}
	
	// Click Remove button
	public void addCategory(String category) {
		CATEGORY_DATA.sendKeys(category);
		ADD_CATEGORY_BUTTON.click();
	}
	//Validate SkyBlue Button
	public WebElement validateSkyBlueButton() {
		return SKY_BLUE_BUTTON;
	}
	
	// Click Remove button
	public void clickSkyBlueButton() {
		SKY_BLUE_BUTTON.click();
	}
	
	//Validate SkyBlue Button
	public WebElement validateWhiteButton() {
		return WHITE_BUTTON;
	}
	
	// Click Remove button
	public void clickWhiteButton() {
		WHITE_BUTTON.click();
	}

}
