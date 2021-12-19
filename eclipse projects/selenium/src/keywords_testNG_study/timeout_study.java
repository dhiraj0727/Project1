package keywords_testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout_study {
  @Test
  public void tc1() throws InterruptedException {
	 
	  Reporter.log("tc1 is running", true);
  }
  
  @Test(timeOut = 180)
  public void tc2() throws InterruptedException {
	  Thread.sleep(1000);
	  Reporter.log("tc2 is running", true);
  }
  
  @Test
  public void tc3() {
	  Reporter.log("tc3 is running", true);
  }
  
  @Test
  public void tc4() {
	  Reporter.log("tc4 is running", true);
  }
 
}
