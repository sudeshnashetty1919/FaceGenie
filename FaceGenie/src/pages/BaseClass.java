package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite  
    public void initializeWebDriver() throws IOException {  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neetu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();  
	     
        // To maximize browser  
        driver.manage().window().maximize();  
    
        // Implicit wait  
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://test-bams.web.app/"); 
	
	}
	
	 @AfterSuite
	 public void quitDriver() {  
         driver.quit();  
    }
	
}
