package selenium1_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_title {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();
// get title		
		String title=d.getTitle();
		System.out.println("title is" +title);
		
// get current url
		String current = d.getCurrentUrl();
		System.out.println("current url is " +current);
		
// check url
		String acturl = d.getCurrentUrl();
		String expurl = "https://www.spotify.com/";
System.out.println("-----------------");

// url testing matching or not

	if (acturl.equals(expurl)) {
		
		System.out.println("url is matching test is passed");
		
	}
	else {
		System.out.println("test is failed");
	}
		d.close();
		
		
	}

}
