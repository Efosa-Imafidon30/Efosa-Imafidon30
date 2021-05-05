package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	/****
	 * Locators will be created below
	 * - Create a constructor
	 * - Create locators
	 * - Create your methods
	 */

	By Username = By.id("user-name");
	By Password = By.name("password");
	By LoginButton = By.cssSelector("div[id='login_button_container']>div>form>input");
	
	
	public void enterUsername(String pass) {
		driver.findElement(Username).sendKeys(pass);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(Password).sendKeys(pass);
	}
	
	public void clickToLogin() {
		driver.findElement(LoginButton).click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
