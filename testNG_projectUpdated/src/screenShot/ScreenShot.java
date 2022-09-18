package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


//taking SCREEN SHOT from each element using (getScreenShotAs) method
public class ScreenShot {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\farha\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/login");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passCode = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement userName2 = driver.findElement(By.xpath("//input[@id='formly_1_input_username_0']"));
		
		userName.sendKeys("Ameer");
		passCode.sendKeys("12345");
		userName2.sendKeys("Khan");
		
		//we create a method below to call it here and pass every element 
		takeElementsScrnShot(userName, "userNameElement");
		takeElementsScrnShot(passCode, "passCodeElement");
		takeElementsScrnShot(userName2, "userName2Element");
		assertElemets(userName);  
		
		
		driver.quit();
	}
	
	
	public static void assertElemets(WebElement element) {
		Assert.assertEquals(element.isDisplayed(), true);
		
		
	}
	public static void takeElementsScrnShot(WebElement element, String fileName) throws IOException {
		
		File srcFile = element.getScreenshotAs(OutputType.FILE);
		 //OutputType is an interface that must be imported from Selenium
		// and getScreenshotAs is a method in Selenium
		File trg=new File ("./target/screenShots/" + fileName +".png");
		FileUtils.copyFile(srcFile, trg);
		

	}
	
}

