package selenium5_scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_scrollinto_view {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		WebElement Ref = d.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		JavascriptExecutor j = ((JavascriptExecutor)d);
		
		j.executeScript("arguments[0].scrollIntoView(true);",Ref);
		
		//j.executeScript("arguments[0].scrollIntoView(true);", referenceElement);		
	}

}
