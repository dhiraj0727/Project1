package selenium6_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class a_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://redbus.in/");
		Thread.sleep(2000);
		
		
		File source =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\redbus.png");
		
		FileHandler.copy(source, destination);
		
		d.close();
		
		
	}

}
