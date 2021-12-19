package selenium1_webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_set_size {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.spotify.com/");
		Thread.sleep(2000);
		
		d.manage().window().maximize();
		Thread.sleep(2000);
// to get default size and position
		
//		System.out.println( d.manage().window().getPosition());
//		System.out.println(d.manage().window().getSize());
//		Thread.sleep(1000);
		
// change size of browser
		Dimension dim = new Dimension(800, 500);
		d.manage().window().setSize(dim);
		Thread.sleep(2000);
		
// change position of browser
		Point p = new Point(100, 200);
		d.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		
		
		
		d.close();
		
		
	}

}
