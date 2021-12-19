package selenium4_listbox__dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a_dropdown_eg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		
// identify list box to be handled and store it in reference variable
		
		WebElement day =d.findElement(By.id("day"));
		
// create an object of select class	which accept webwelement as argument
		
		Select s = new Select(day);
		
//	3.	By using one of the select class methods we can select values form list box like 
		
//		i. selectByVisibleText: selectByVisibleText(String arg0) 
//		ii. selectByIndex: selectByIndex(int arg0) 
//		iii. selectByValue: selectByValue(String arg0)
		
//	System.out.println(s.getOptions());

	 List<WebElement> days = s.getOptions();	// to get total days
	
	 
	 for (int i = 0; i <= days.size()-1; i++) {
		 
		 System.out.println(days.get(i).getText());
	}
	 
	 System.out.println("total days options are "+days.size());
	 
	 	Thread.sleep(1000);
	 	s.selectByVisibleText("7");
	 	
	 	Thread.sleep(1000);
	 	
//Step1
		WebElement Month = d.findElement(By.name("birthday_month"));
//Step2
		Select s1= new Select(Month);
//Step3
		//s1.selectByIndex(1);
		s1.selectByVisibleText("Feb");
		
		Thread.sleep(1000);
		
//1.		
		WebElement Year = d.findElement(By.xpath("//select[@aria-label='Year']"));		
//2.		
		Select s2= new Select(Year);
//3.	
		s2.selectByValue("1999");
		
		Thread.sleep(2000);
		
//		s2.deselectByValue("1999");// applicable for multi select options
//		
//		Thread.sleep(2000);
//		
//		s2.selectByValue("2021");
//	
		d.close();
		
		
	}

}
