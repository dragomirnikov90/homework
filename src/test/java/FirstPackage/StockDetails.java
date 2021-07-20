package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class StockDetails  extends commonFunctions  {
	
	

  @Test(priority = 4)
  public void GoldTest() {
	  
	 
	  WebElement gold = driver.findElement(By.cssSelector("a[title='Gold']"));
	  
	 Assert.assertEquals(true, gold.isDisplayed());
	 
	  if(gold.isDisplayed()) {
		  System.out.println("Gold is successfully displayed !");
	  }
   
  }
  
  @Test(priority = 2)
  public void SilverTest() throws InterruptedException {
	  
	  clickNextBtnCarrousel();
	  
	  WebElement silver = driver.findElement(By.cssSelector("a[title='Silver']"));
	  
      Thread.sleep(1000);

	  Assert.assertEquals(true, silver.isDisplayed());
		 
	  if(silver.isDisplayed()) {
		  System.out.println("Silver is successfully displayed !");
	  }
	  
	  
  }
  
  @Test(priority = 3)
  public void PoundDollar() {
	  
	  WebDriverWait wait = new WebDriverWait(driver,(50));
	  	  
	  clickNextBtnCarrousel();

	  WebElement poundDollar = driver.findElement(By.cssSelector("a[title='GBP/USD']"));

	  wait.until(ExpectedConditions.visibilityOf(poundDollar));
	  
	  Assert.assertEquals(true, poundDollar.isDisplayed());
		 
	  if(poundDollar.isDisplayed()) {
		  System.out.println("Pund/Dollar is successfully displayed !");
	  }
	  
  }
  
  @Test(priority = 1)
  	public void EarningChart() throws InterruptedException {
	  
	  WebElement revenuChart = driver.findElement(By.id("Col2-5-QuoteModule-Proxy"));
	  
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", revenuChart);
      
      Assert.assertEquals(true, revenuChart.isDisplayed());
      
      if(revenuChart.isDisplayed()) {
    	  System.out.println("Earning chart is successfully displayed !");
      }
      
      Thread.sleep(10000);


	  
  }
}
