package testng_listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {

		  @Test
		  public void TC1() 
		  {
			    
		  Reporter.log("TC1 running", true);
		  }
		  
		  @Test
		  public void TC2() 
		  {
		  Reporter.log("TC2 running", true);
		  Assert.fail();
		  }

}
