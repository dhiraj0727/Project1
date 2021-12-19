package y_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class a_test1 {
  @Test
  public void test() {
	  
	  
		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		
		System.out.println("test case is passed");
		
		Reporter.log("test case is passed", true);
		
		 Reporter.log("case is passed", true);
  }
}
