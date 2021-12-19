package cross_browser_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import w_POM.A_POM1_ZerodaLoginPage;
import w_POM.b_POM2_PinPage;
import w_POM.c_POM3_homepage;

public class kitelogin {
 @Parameters("browser")
  @Test
  public void crossbrotest (String browser) throws InterruptedException {
	 
	 WebDriver d = null;
	 
	 if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		 d = new ChromeDriver();

	  }
	  else if(browser.equals("firefox")) {
		  
		System.setProperty("webdriver.gecko.driver", "D:\\automation testing\\geckodriver.exe");
		 d = new FirefoxDriver();
	  
	}
	 Reporter.log("launchng kite app",true);
		d.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		Reporter.log("logging in kite ",true);
		A_POM1_ZerodaLoginPage login = new A_POM1_ZerodaLoginPage(d);
		login.enterUsername();
		Thread.sleep(1000);
		login.enterpassword();
		Thread.sleep(1000);
		login.ClickOnLoginButton();
		Thread.sleep(1000);
		
		Reporter.log("entering pin ",true);
		b_POM2_PinPage pin = new b_POM2_PinPage(d);
		pin.SendPin();
		Thread.sleep(1000);
		pin.ClickOnContinueButton();
		Thread.sleep(1000);
		
		Reporter.log("visiting homepage",true);
		c_POM3_homepage user = new c_POM3_homepage(d);
		user.userid();
		Reporter.log("TC is passed", true);	
		
		user.click();
		Thread.sleep(2000);
		user.loggedout();
		Thread.sleep(3000);
		Reporter.log("Closing browser ",true);
		d.close();
	 
	 
  }
}
