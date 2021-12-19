package w_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b_POM2_PinPage {
	
//pom2
	
	@FindBy(id="pin")private WebElement Pin;
		
	@FindBy(xpath="//button[@type='submit']")private WebElement ContinueButton;
		
//step2 Initialize variable using constructor -->Page Factory class and initElements static methods
		
		public b_POM2_PinPage(WebDriver driver) //this parameterize constructor
		{
			PageFactory.initElements(driver, this);
		}
		
//step3 variable page
		
			public void SendPin()
			{
				Pin.sendKeys("092016");
			}
			
			public void ClickOnContinueButton()
			{
				ContinueButton.click();
			}
	

}
