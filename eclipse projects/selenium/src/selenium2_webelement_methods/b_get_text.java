package selenium2_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_get_text {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		Thread.sleep(1000);
		d.manage().window().maximize();
		
		String text = d.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText();
		System.out.println("text is " +text);
		
		System.out.println("-----------");
		
		System.out.println(d.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText());

// by link and partiallin ktext		
		
		d.findElement(By.linkText("Forgotten password?")).click();
		
		// d.findElement(By.partialLinkText("Forgotten")).click();
		
	}

}
