package POM_test_base_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b_kitepin_page {
	
	@FindBy(id="pin") private WebElement PIN;
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement ContinueButton;

		
		public b_kitepin_page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		

		public void enterPIN(String pin)
		{
			PIN.sendKeys(pin);
		}
		
		public void clickOnContinueButton()
		{
			ContinueButton.click();
		}


}
