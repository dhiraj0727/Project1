package selenium5_scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_scrolling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		JavascriptExecutor j = ((JavascriptExecutor)d);

// +ve x value--> right hand side, Y value +ve --> down 
// +ve x value--> right hand side, Y value -ve --> up 
// -ve x value--> left hand side, Y value +ve --> down 
// -ve x value--> left hand side, Y value -ve --> up 
		
				j.executeScript("window.scrollBy(80,900)");
				Thread.sleep(2000);
				
				j.executeScript("window.scrollBy(80,2000)");
				
				Thread.sleep(2000);
				j.executeScript("window.scrollBy(80,500)");
				Thread.sleep(2000);
				j.executeScript("window.scrollBy(80,-2000)");
	
	
	
	
	}

}
