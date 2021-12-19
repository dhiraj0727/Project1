package selenium2_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_sendkeys_click_clear {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
// webdriver methods	
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		System.out.println(d.getCurrentUrl()); 
		System.out.println(d.getTitle());
		
		String acturl = d.getCurrentUrl();
		String cururl = "https://www.youtube.com/";
		
		if (acturl.equals(cururl)) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
		}
	
		
//clear
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("dhirajbhakare.2707@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(1000);
//sendkeys
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("dhirajbhakare.2707@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("dhiraj2707");
		Thread.sleep(1000);
//click
		d.findElement(By.xpath("//button[@name = 'login']")).click();
		Thread.sleep(10000);
		
		
		d.close();
	}
	
	

}
