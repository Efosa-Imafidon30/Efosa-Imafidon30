package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepagePage {
	WebDriver driver;
	
	public HomepagePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By AddToCart = By.cssSelector("div[id='inventory_container']:nth-child(1)>div>div:nth-child(1)>div:nth-child(2)>div:nth-child(2)>button");
    By Basket = By.cssSelector("div[id='shopping_cart_container']");
    
    
    public void addItemToBasket(int num) {
    	//  div[id='inventory_container']:nth-child(1)>div>div:nth-child(5)>div:nth-child(2)>div:nth-child(2)>button
    	String beforeCSS = "div[id='inventory_container']:nth-child(1)>div>div:nth-child(";
    	String afterCSS = ")>div:nth-child(2)>div:nth-child(2)>button";
    	String actualCSS = beforeCSS+num+afterCSS;
    	
    	driver.findElement(By.cssSelector(actualCSS)).click();
    }
	
	public void clickToOpenBasket() {
		driver.findElement(Basket).click();
		
		
		System.out.println("New Update");
	}
	
	
	
	
	
	
}
