package webDriver_basics.TestFiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SauceLabSiteTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void site_header_is_on_home_page() {   
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\StayRealChill\\chromedriver.exe");   
	       WebDriver browser = new ChromeDriver();
	       browser.get("https://www.saucelabs.com");       
	       WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
	       assertTrue((href.isDisplayed()));  
	       browser.close();
	}

}
