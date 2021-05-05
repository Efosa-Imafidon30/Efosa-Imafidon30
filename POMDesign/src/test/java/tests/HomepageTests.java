package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomepagePage;
import pages.LoginPage;

public class HomepageTests {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
	driver = library.Browsers.launchBrowser("chrome");

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
}
	
//	@AfterMethod
//	public void teardown() {
//		driver.quit();	
//	}
	
	@Test
	public void verifyItemsCanBeAddedToBasket() throws Exception{
		LoginPage test = new LoginPage(driver);
		test.enterUsername("standard_user");
		test.enterPassword("secret_sauce");
		test.clickToLogin();
		
		HomepagePage home = new HomepagePage(driver);
		Thread.sleep(1000);
		home.addItemToBasket(4);
		Thread.sleep(1000);
		home.clickToOpenBasket();
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.cssSelector("div[class='cart_item']"));
		Assert.assertTrue(element.isDisplayed());
		
		WebElement title = driver.findElement(By.cssSelector("div[class='cart_item']>div:nth-child(2)>a>div"));
		String colour = title.getCssValue("color");
		Assert.assertEquals(colour, "rgba(226, 35, 26, 1)");
		
		String fontSize = title.getCssValue("font-size");
		Assert.assertEquals(fontSize, "20px");
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
