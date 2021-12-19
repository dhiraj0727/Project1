package selenium3_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		Thread.sleep(1000);
		d.manage().window().maximize();
		
// find element by xpath
		
		
// 1) Xpath by attribute
		
		//tagname[@attribute name = 'attribute value']
		
		//d.findElement(By.xpath("//input[@type='text']"));
		
		
		
// 2) Xpath by text
		//tagname[text() = 'text value']
	
		d.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
// 3) Xpath bycontains
		//tagname[contains(text(),'text value')]
		//tagname[contains(@attribute name = 'attribute value')]
		
		//d.findElement(By.xpath("//a[contains(text(),'Forgotten ')]"));
		
// 4) xpath by index
		//(tagname[@attribute name = 'attribute value'])[]
		
// 5) by id
		//d.findElement(By.id("show-textbox")).click();
		
// 6) by partial text
		
		// 	d.findElement(By.linkText("Forgotten password?")).click();
		
		// d.findElement(By.partialLinkText("Forgotten")).click();
		
	Thread.sleep(1000);
	d.close();
		
		
	}

}
