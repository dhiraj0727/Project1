package POM_test_base_utility;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kite_app_testing extends base {
	
		a_kitelogin_page login;
		b_kitepin_page pin;
		c_kitehome_page home;
		
		@BeforeClass
		public void launchbrowser() throws InterruptedException 
		{
			Reporter.log("Initailising browser", true);
			base_browserinitialise();
			
			login = new a_kitelogin_page(driver);
			pin =new b_kitepin_page(driver);
			home = new c_kitehome_page(driver);
		
		}
		@BeforeMethod
		public void loginToKite() throws EncryptedDocumentException, IOException, InterruptedException
		{
			Reporter.log("entering UseriD and Password", true);
			login.enterUserId(utility.getdatafromexcel(0, 0));
			login.enterPassword(utility.getdatafromexcel(0, 1));
			login.ClickOnLoginButton();
			Thread.sleep(1000);
			
			Reporter.log("Entering Pin", true);
			pin.enterPIN(utility.getdatafromexcel(0, 2));
			pin.clickOnContinueButton();
			Thread.sleep(1000);
		}
		@Test
		public void validateuserid() throws EncryptedDocumentException, IOException, InterruptedException
		{
			int TCID = 10;
			String actualuserid = home.userIDValidation();
			String expecteduserid = utility.getdatafromexcel(0, 0);
			
			Reporter.log("Validating UserID", true);
			Thread.sleep(2000);
			
			Assert.assertEquals(actualuserid, expecteduserid,"User ID not matching TC Failed");
			Reporter.log("User ID Matching TC "+TCID+" is passed",true);
			
			Reporter.log("Taking screenshot", true);
			Thread.sleep(1000);
			utility.getscreenshot(driver, TCID);
		}
		
		@AfterMethod
		public void LogOutFromKite() throws InterruptedException
		{
			Thread.sleep(1000);
			Reporter.log("logging out..", true);
			home.ClickOnUserID();
			Thread.sleep(1000);
			home.ClickOnLogout();
			Thread.sleep(1000);
			
		}
		
		@AfterClass
		public void closebrowser() 
		{
			Reporter.log("browser closed......", true);
			driver.close();
		}

}
