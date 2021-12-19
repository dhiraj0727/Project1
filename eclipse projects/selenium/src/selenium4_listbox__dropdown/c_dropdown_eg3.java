package selenium4_listbox__dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class c_dropdown_eg3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://techcanvass.com/Examples/multi-select.html");
//1.	Identify list box to be handled and store it in reference variable
		
		WebElement MultipleListBox = d.findElement(By.id("multiselect"));
		
//2.	Create an object of Select class which will accept WebElement as argument

		Select s= new Select(MultipleListBox);
		
//check if box is multiple select-able
		System.out.println(s.isMultiple());
		
//3.	By using one of the select class methods we can select values form list box like 
		
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByIndex(3);
		
//how to deselect all
		//sm.deselectAll();
		
		//how to deselect single value
		
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByValue("suzuki");
		Thread.sleep(2000);
		s.deselectByVisibleText("Opel");
		Thread.sleep(3000);
	
		d.close();
		
		
	}

}
