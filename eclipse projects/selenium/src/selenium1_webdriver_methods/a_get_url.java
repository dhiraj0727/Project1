package selenium1_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_get_url {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
//maximize	
		d.manage().window().maximize();
		
		Thread.sleep(3000);
//Navigate to url
		d.navigate().to("https://mail.google.com/");
		Thread.sleep(3000);
		
		d.navigate().back();
		Thread.sleep(2000);
		
		d.navigate().forward();
		Thread.sleep(2000);
		
		d.navigate().refresh();
		Thread.sleep(2000);
		
		d.get("https://www.spotify.com/");
		Thread.sleep(2000);
		
		d.quit();
		
		
		
		d.close();
		
	}

}
