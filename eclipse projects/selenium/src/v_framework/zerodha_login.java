package v_framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class zerodha_login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		d.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		d.findElement(By.id("userid")).sendKeys("YT2353");
		Thread.sleep(2000);
        d.findElement(By.id("password")).sendKeys("Pass@123");
   		Thread.sleep(2000);
   		d.findElement(By.xpath("//button[@type='submit']")).click();
   		Thread.sleep(2000);
   		d.findElement(By.id("pin")).sendKeys("092016");
   		Thread.sleep(2000);
   		d.findElement(By.xpath("//button[@type='submit']")).click();
   		Thread.sleep(2000);
		
   		
   		WebElement Actualtext = d.findElement(By.xpath("//span[text()='YT2353']"));
        String actualuserid = Actualtext.getText();
   		String Expectedtext = "YT2353";
        
        System.out.println("id is " + actualuserid);
        
        Assert.assertEquals(Expectedtext, actualuserid,"userid mismatched");
        Reporter.log("matched tc is passed",true);
        
       Actualtext.click();
       
       d.findElement(By.xpath("//span[@class='icon icon-exit']")).click();
  	 Reporter.log("logged out tc is passed",true);
  	 Thread.sleep(3000);
  	 d.close();
       
       
       
 //        if(Actualtext.equalsIgnoreCase(Expectedtext))
//        {
//     	  System.out.println("test case is passed");   
//        }
//        else
//       {
// 		System.out.println("test case is failed");
//       }
        
        
	}

}
