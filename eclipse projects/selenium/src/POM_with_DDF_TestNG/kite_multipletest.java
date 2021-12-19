package POM_with_DDF_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class kite_multipletest {
 
	WebDriver driver = null;
	Sheet Mysheet;
	a_Kiteloginpage login;		//declare object
	b_kitepinpage pin;
	c_kitehomepage home;
	
	@Parameters("browserName")
	@BeforeClass
	public void launchbrowser(String browserName) throws InterruptedException, IOException 
	{
		 if(browserName.equals("chrome")) 
		 {
				System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
	
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
		
			  
		  }
		  else if(browserName.equals("firefox")) 
		  {
			  
		System.setProperty("webdriver.gecko.driver", "D:\\automation testing\\geckodriver.exe");
		driver = new FirefoxDriver();
		  
		  }
		 

		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching browser ",true);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		FileInputStream Myfile = new FileInputStream("d:\\zerodha.xlsx");
		 Mysheet = WorkbookFactory.create(Myfile).getSheet("sheet1");
		
		 login = new a_Kiteloginpage(driver);
		 pin = new b_kitepinpage(driver);
		 home = new c_kitehomepage(driver);
	
		String UserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();	
		
		login.enterUserId(UserID);
		login.enterPassword(PWD);
		login.ClickOnLoginButton();
		Thread.sleep(1000);
		
		Reporter.log("Entering UserID and Password", true);
		
		pin.enterPIN(PIN);
		pin.clickOnContinueButton();
		Thread.sleep(1000);
		
		Reporter.log("Entering pin ", true);

	}

	@Test
	public void take_screenshot() throws IOException 
	{
		Reporter.log("Launched Home Page", true);
		
		String random = RandomString.make(4);
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\zerodha"+random + ".png");
		FileHandler.copy(source, destination);
		
		Reporter.log("screenshot captured", true);
	}
	
	@Test
	public void validate_kite_userid() 
	{
		String Expecteduserid = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String Actualuserid = home.userIDValidation();
	
		Assert.assertEquals(Actualuserid, Expecteduserid,"tc is failed user id is not matching");
		Reporter.log("user id matched tc is passed ", true);
	
	}
	
	@AfterClass
	public void logoutkite() 
	{
		
		home.ClickOnUserID();
		home.ClickOnLogout();
		Reporter.log("logging out ....",true);

		Reporter.log("closing browser",true);	
		driver.close();
	}
	
}
