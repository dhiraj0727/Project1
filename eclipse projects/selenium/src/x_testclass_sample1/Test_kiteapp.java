package x_testclass_sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import w_POM.A_POM1_ZerodaLoginPage;
import w_POM.b_POM2_PinPage;
import w_POM.c_POM3_homepage;

public class Test_kiteapp {

	public static void main(String[] args) throws InterruptedException {


	System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
	
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
	
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
	
//Create object of POM1 class and call methods in sequence
		A_POM1_ZerodaLoginPage login= new A_POM1_ZerodaLoginPage(driver);
				
				login.enterUsername();
				login.enterpassword();
				login.ClickOnLoginButton();

//Create object of POM2 class and call methods in sequence
				Thread.sleep(1000);
				b_POM2_PinPage pin= new b_POM2_PinPage(driver);
				pin.SendPin();
				pin.ClickOnContinueButton();
				
				
//Create object of POM3 class and call methods in sequence
				Thread.sleep(1000);
				c_POM3_homepage Home= new c_POM3_homepage(driver);
				
			Home.userid();
	
			driver.close();
			
	
	
	}

}
