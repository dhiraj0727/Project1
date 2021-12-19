package POM_with_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class c_kitehomepage {
	
	@FindBy(xpath ="//span[@class='user-id']") private WebElement UserId;
	
	@FindBy(xpath = "//span[@class='icon icon-exit']") private WebElement LogoutButton;
	
	
	public c_kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String userIDValidation()
	{
		String ActualUserid =UserId.getText();
		return ActualUserid;
		
//		if (ActualUsID.equals(ExpUseriD))
//		{
//			System.out.println("TC passed");
//		}
//		else {
//			System.out.println("TC failed");
//		}
	}
		public void ClickOnUserID()
		{
			
			UserId.click();
		}
		
		public void ClickOnLogout()
		{
			LogoutButton.click();
		}
		
		
	



}
