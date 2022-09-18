package dataProvider;
 
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide extends TestUtilClass {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\farha\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver" , "C:\\Users\\farha\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
   
		driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
			Thread.sleep(2000);
	}
	
	@DataProvider
	public Object [][] getLoginData() throws IOException {
		Object [][] data = getTestData();
		return data;
		
	}
	
	//working with ExcelSheet we have to pass as much parameter as columns, like 20 columns there must be 
	//20 parameters passed in your method
	@Test(dataProvider="getLoginData")
	public void test(String firstName, String lastName, String Email, String password) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        Thread.sleep(2000);
	
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
	

}
