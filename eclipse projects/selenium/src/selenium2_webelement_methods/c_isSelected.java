package selenium2_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_isSelected {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		Thread.sleep(1000);
		d.manage().window().maximize();
		
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
		Thread.sleep(1000);
		
// radio selected
		WebElement maleradio = d.findElement(By.xpath("//input[@value='2']"));
		
		//maleradio.click();
		
		boolean Result = maleradio.isSelected();
		System.out.println("Male radio is selected = "+Result);
		
// if (maleradio.isSelected()) {
//	System.out.println("gender is selected");
// }
		
		if (Result==true) 
		{
			System.out.println("gender is selected");
		}
		else {
			
			maleradio.click();
			boolean Result1 =maleradio.isSelected();
			System.out.println("male radio is selected = "+Result1);
			
			if (Result1==true) {
				System.out.println("gender is selected");
			
			}
			else {
				System.out.println("check for issues");
			}
		}
	d.close();	
	}

}
