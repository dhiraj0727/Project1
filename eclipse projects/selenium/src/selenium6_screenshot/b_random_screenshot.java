package selenium6_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class b_random_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.hotstar.com/");
		Thread.sleep(2000);
		
		 String random = RandomString.make(4);
		 
		File source = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\new"+random+".png");
		
		FileHandler.copy(source, dest);
		
		String random1= RandomString.make(3);
		Thread.sleep(2000);
		File source1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File Destination1= new File("D:\\hotstar"+random1+".png");
		FileHandler.copy(source1, Destination1);
		
		
		d.close();
	}

}
