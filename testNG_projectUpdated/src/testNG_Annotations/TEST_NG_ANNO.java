package testNG_Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TEST_NG_ANNO {
	
	static WebDriver driver;
	
	
	@BeforeTest
	public void launchingChrome() {
	
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\farha\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	}
	
		@Test   //(priority=2, enabled=false)
		public void searching () throws InterruptedException  {
			
			driver.findElement(By.xpath("//*[@name='search_query']")).click();
			driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys("TestNG Naveen");

		   Actions action = new Actions(driver);
	       action.sendKeys(Keys.ENTER).build().perform();
	       Thread.sleep(5000);
	       
	}
		
		@Test  //(dependsOnMethods= {"searching"})
		public void searchAgain ( ) throws InterruptedException {
			
			//action.sendKeys(Keys.RETURN).build().perform();
			 driver.findElement(By.xpath("//*[@name='search_query']")).click();
			 driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys("Tom and Jerry Cartoon");
			   Actions action = new Actions(driver);
		       action.sendKeys(Keys.ENTER).build().perform();
		       Thread.sleep(5000);
		    
		}
		
		@Test(priority=1)
		public void video () throws InterruptedException {
			Actions action = new Actions(driver);
		       action.sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.xpath("//*[@title='Music'][@id='text']")).click();
			Thread.sleep(5000);
		}
		
		
		@AfterTest
		public void tearDown () {
			driver.quit();
		}
	}
	
	
	
	
	
	
	

