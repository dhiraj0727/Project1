package tTestNG_xml_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample_parallel2 {
  @Test
  public void f() {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.hotstar.com/");
		
		Reporter.log("visited hotstar", true);

  }
}
