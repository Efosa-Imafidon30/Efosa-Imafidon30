package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {
	
	public static WebDriver launchBrowser(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		}
		return new ChromeDriver();
	}

}
