package cross_browser_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertest1 {
	
	@Parameters("browserName")
	@Test
  public void f(String browserName) throws InterruptedException {
		
		WebDriver driver = null;
	  
	  if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		 driver = new ChromeDriver();
		 ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(opt);
	
		  
	  }
	  else if(browserName.equals("firefox")) {
		  
			System.setProperty("webdriver.gecko.driver", "D:\\automation testing\\geckodriver.exe");
		 driver = new FirefoxDriver();
	  
	}
	  	Reporter.log("launchng kite app",true);
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		Reporter.log("logging in kite ",true);
		driver.findElement(By.id("userid")).sendKeys("YT2353");
		Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Pass@123");
   		Thread.sleep(2000);
   		driver.findElement(By.xpath("//button[@type='submit']")).click();
   		Thread.sleep(2000);
   		
   		Reporter.log("entering pin ",true);
   		driver.findElement(By.id("pin")).sendKeys("092016");
   		Thread.sleep(2000);
   		driver.findElement(By.xpath("//button[@type='submit']")).click();
   		Thread.sleep(2000);
        Reporter.log("visiting homepage",true);
        
        String ExpectedUserId = "YT2353";
        WebElement ActualUserId1 = driver.findElement(By.xpath("//span[@class='user-id']"));
		String ActualUserId = ActualUserId1.getText();
		Reporter.log("Validating UserID ",true);
		Thread.sleep(2000);
		Assert.assertEquals(ExpectedUserId, ActualUserId,"UserID not Matching TC is Failed");
		Reporter.log("TC is passed", true);
		
		Reporter.log("Validation done...Logging out... ",true);
		ActualUserId1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='icon icon-exit']")).click();
		Thread.sleep(3000);
		Reporter.log("Closing browser ",true);
		driver.close();
	  
	 
	}
}
