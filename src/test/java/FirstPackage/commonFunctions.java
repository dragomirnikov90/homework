package FirstPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class commonFunctions {
	
	
	public static WebDriver driver;
		

	
	@BeforeMethod
	public static void browserSetUp() {
		
		 WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	      driver.get("https://finance.yahoo.com/quote/ZM?p=ZM");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      driver.findElement(By.cssSelector("button[name='agree']")).click(); //Accept cookies
	}
	
	@AfterMethod
	  public void afterMethod() {
		  
		  driver.quit();
		  
	  }
	
	public static void clickNextBtnCarrousel() {
		
	      driver.findElement(By.cssSelector("button[title='next']")).click(); //click on the carrousel next btn
	      

	}
	
	
}

//@BeforeMethod
//
// @Parameters ( {"BrowserType"} )
//  public void testExamplePageOnMultipleBrowsers (String browserType) {
//    if (browserType.equalsIgnoreCase("Chrome")) {
//      WebDriverManager.chromedriver().setup();
//      driver = new ChromeDriver();
//      
//    }
//  
//    driver.manage().window().maximize();
//    System.out.println(browserType + ": " + driver.getTitle());
//  }
//  
//  
//
//  
//  public static void starTest() {
//	  
//	  driver.get("https://finance.yahoo.com/quote/ZM?p=ZM");
//	  
//	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	  
//	  driver.findElement(By.cssSelector("button[name='agree']")).click(); //Accept cookies
//  }
