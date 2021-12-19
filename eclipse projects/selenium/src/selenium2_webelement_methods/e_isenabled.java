package selenium2_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_isenabled {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();	
		
		d.get("https://www.hotstar.com/");
		Thread.sleep(1000);
		d.manage().window().maximize();
		
		d.findElement(By.className("signIn")).click();
		Thread.sleep(2000);
		
		 d.findElement(By.id("phoneNo")).sendKeys("9049802404");
		 
		 WebElement buttoncont= d.findElement(By.className("submit-button"));
		 Boolean result = buttoncont.isEnabled();
		 System.out.println("button is enabled "+result);
		 
		 if (result==true) {
			 System.out.println("continue button is enabled");
		}
		 else {
			 d.findElement(By.id("phoneNo")).sendKeys("9049802404");
			 if (result==true) {
				 System.out.println("continue button is enabled");

			}
			 else {
				System.out.println("check for error");
			}
			 
		}
	
	
	Thread.sleep(3000);
	d.close();
	
	}

}
