package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPageScrnShot {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\farha\\Downloads\\"
				+ "chromedriver_win32 (5)\\chromedriver.exe");
		 driver = new ChromeDriver();
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
		
		 takeFullScreenShot();
		
		
		driver.close();
		
	}
		//in first below line with the help of  "TakesScreenshot" interface which we typecast it to the driver we
		//can take full screen shot
		public static void takeFullScreenShot() throws IOException {
		TakesScreenshot tss = (TakesScreenshot)driver;  //TakesScreenshot is an interface that must be imported from Selenium
		File srcFile = tss.getScreenshotAs(OutputType.FILE);//OutputType is an interface that must be imported from Selenium
		File trg=new File ("./target/screenShots/FSS"+".png");
		FileUtils.copyFile(srcFile, trg);
		}
		
		
		
		
		
		
		
		
}
