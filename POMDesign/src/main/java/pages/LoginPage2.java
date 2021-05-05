package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage2 {
	
	WebDriver driver;
	
	public LoginPage2(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="user-name")
	WebElement Username;
	
	By Password = By.name("password");
	
	public void enterUsername(String pass) {
		Username.sendKeys(pass);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(Password).sendKeys(pass);
	}
	

}
