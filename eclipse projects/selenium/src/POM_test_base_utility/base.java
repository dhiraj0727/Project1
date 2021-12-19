package POM_test_base_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;


public class base {
	
	WebDriver driver = null;

	public void base_browserinitialise () throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	driver = new ChromeDriver(opt);
	
	driver.get("https://kite.zerodha.com/");
	Reporter.log("launching browser ",true);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	}

}
