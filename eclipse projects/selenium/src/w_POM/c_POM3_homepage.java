package w_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class c_POM3_homepage {

//pom3
	
		@FindBy(xpath="//span[@class='user-id']")private WebElement UserIDtext;
		@FindBy(xpath="//span[@class='icon icon-exit']")private WebElement logout;	
		
		public c_POM3_homepage(WebDriver driver) 
		{
	         PageFactory.initElements(driver, this);	       
	     }
		
	  public void userid() throws InterruptedException 
	  {
		  String expecteduserid = "YT2353";
		  String actualid = UserIDtext.getText();	

		Reporter.log("Validating UserID ",true);
		Thread.sleep(2000);
		Assert.assertEquals(actualid, expecteduserid,"userid mismatched tc failed");
		Reporter.log("tc passed", true);
		
	  }
	  
	  public void click()
	  {
		UserIDtext.click();
	  }
	  
	  public void loggedout()
	  {
		 logout.click(); 
	  }
	  
}
