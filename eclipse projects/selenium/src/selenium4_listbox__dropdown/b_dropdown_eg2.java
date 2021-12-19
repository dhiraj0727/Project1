package selenium4_listbox__dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b_dropdown_eg2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		Thread.sleep(3000);
		
//step1		
		WebElement Day_list = d.findElement(By.name("birthday_day"));
//step2
		Select sd= new Select(Day_list);
		sd.selectByValue("11");
		Thread.sleep(3000);
		
		sd.selectByValue("22");
		Thread.sleep(3000);
		
		sd.selectByValue("30");
		Thread.sleep(1000);
		
//to check if that element is multiple select-able
		
		System.out.println("is multiple options are selected "+sd.isMultiple());	//will return true or false
				
		System.out.println(sd.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		d.close();
		
		
	}

}
