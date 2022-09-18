package log4j_Pack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Log4j_Reports {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void setup( ) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\farha\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	driver.get("http://www.google.com");

}
	@Test
	public void test() {
		System.out.println("test passed");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}