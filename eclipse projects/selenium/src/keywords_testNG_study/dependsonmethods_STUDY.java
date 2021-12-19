package keywords_testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethods_STUDY {
	
  @Test(dependsOnMethods = {"tc2"}) 
  public void tc1() {
	  Reporter.log("tc1 is running",true);
  }
  @Test()
  public void tc2() throws InterruptedException { 
	  
	  Thread.sleep(1000);
	  Reporter.log("tc2 is running",true);
  }
  @Test
  public void tc3() {							
	  Reporter.log("tc3 is running",true);
  }
  
}
