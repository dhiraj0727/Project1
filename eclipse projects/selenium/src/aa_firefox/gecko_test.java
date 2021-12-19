package aa_firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gecko_test {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\automation testing\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.youtube.com/");
		
		
	
	
	
	}

}
