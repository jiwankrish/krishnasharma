package testTestng;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Locale.Category;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pages.TestPage;
import util.BrowserFactory;

public class AddCategoryTest {
	WebDriver driver;

	@Before
	public void startUp() {
		driver = BrowserFactory.startBrowser();
	}

	@Test
	public void testAddCategory() {
		// Instantiate TestPage Class
		TestPage testPage = PageFactory.initElements(driver, TestPage.class);
		
		//Call Add Category Method
		testPage.addCategory("KSharma5");
		
		//Get List of Categories to validate the Item just added is there
		List<WebElement> categoryList = testPage.validateCategoryList();
		System.out.println(categoryList.get(1).getText());
		// If Item is available check if selected or enable else print a message
			for (int i = 0; i < categoryList.size(); i++) {
				Assert.assertEquals(categoryList.get(i).getText(),"KSharma5");
				System.out.println(categoryList.get(i).getText());
			}	
	}

}
