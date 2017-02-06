package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LandingPage {

	public static void GoTo() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rlgw\\workspace\\SeleniumTest\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://phptravels.net/");
	}

	
	
}
