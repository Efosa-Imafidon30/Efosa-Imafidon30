package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTests {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	driver = library.Browsers.launchBrowser("chrome");

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
}
	
	@AfterMethod
	public void teardown() {
		driver.quit();	
	}
	
	@Test(priority=1)
	public void loginWithValidUsernameAndPassword() {
		LoginPage test = new LoginPage(driver);
		test.enterUsername("standard_user");
		test.enterPassword("secret_sauce");
		test.clickToLogin();

	}
	
	@Test(priority=2)
	public void loginAsALockedUser() {
		LoginPage test = new LoginPage(driver);
		test.enterUsername("locked_out_user");
		test.enterPassword("secret_sauce");
		test.clickToLogin();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}