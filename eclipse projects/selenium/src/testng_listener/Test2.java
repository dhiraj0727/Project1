package testng_listener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
 
	  @Test
	  public void TC3() 
	  {
		    
	  Reporter.log("TC3 running", true);
	  }
	  
	  @Test
	  public void TC4() 
	  {
		    
	  Reporter.log("TC4 running", true);
	  }
  
}
