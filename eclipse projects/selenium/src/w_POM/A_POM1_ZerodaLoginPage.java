package w_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_POM1_ZerodaLoginPage {

	
//Pom 1
	
	
//Step1. Declaration of variables
		@FindBy(id="userid") private WebElement UserID;
				
		@FindBy(id="password") private WebElement Password;
				
		@FindBy(xpath="//button[@class='button-orange wide']") private WebElement LoginButton;

//Step2. Initialize variables using Constructor-->PageFactory class and initElements static method
	
		public  A_POM1_ZerodaLoginPage(WebDriver d) 
		{
		
			PageFactory.initElements(d, this);
		}
	
//Step3. variable usage--> using Methods
		
		public void enterUsername()
		{
			UserID.sendKeys("YT2353");
		}
		
		public void enterpassword()
		{
			Password.sendKeys("Pass@123");
		}
		
		public void ClickOnLoginButton()
		{
			LoginButton.click();
		}	
	
	
	
	
	
}
