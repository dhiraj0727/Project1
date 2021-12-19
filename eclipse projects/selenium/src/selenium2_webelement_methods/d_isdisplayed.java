package selenium2_webelement_methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_isdisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		d.manage().window().maximize();
		Thread.sleep(1000);
		
//	System.out.println(d.findElement(By.id("displayed-text")).isDisplayed());
		
		WebElement text1 = d.findElement(By.id("displayed-text"));
		Boolean result1 = text1.isDisplayed();
		System.out.println("element is displayed "+result1);
		Thread.sleep(2000);
// after hiding		
		d.findElement(By.id("hide-textbox")).click();
		Thread.sleep(3000);
		Boolean result2 = text1.isDisplayed();
		System.out.println("element is displayed "+result2);
	
// after showing		
		d.findElement(By.id("show-textbox")).click();
		Thread.sleep(3000);
		Boolean result3 = text1.isDisplayed();
		System.out.println("element is displayed "+result3);
		
	Thread.sleep(3000);
	d.close();
	}

}
