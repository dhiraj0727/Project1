package u_webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_ReadSingleRowFromTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		 d.get("file:///D://automation testing/webtable.html");	
	
		 List<WebElement> Row3 = d.findElements(By.xpath("//table[@id='1234']//tr[4]"));
		 for(WebElement w:Row3) 
		 {
			 System.out.println(w.getText());
		 }
 //reading only one element using relative xpath
		 
		 System.out.println(d.findElement(By.xpath("//table[@id='1234']//tr[4]//td[2]")).getText());
		
	
	
	}

}
