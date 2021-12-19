package testng_listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {

		  @Test
		  public void TC1() 
		  {
			  Reporter.log("running TC1", true);
		  }
		  
		  @Test
		  public void TC2() 
		  {
			  
			  Reporter.log("running TC2", true);
			  Assert.fail();
		  }
		  @Test
		  public void TC3() 
		  {
			  Reporter.log("running TC3", true);
		  }
		  
		  @Test
		  public void TC4() 
		  {
			  Reporter.log("running TC4", true);
		  }
		  
		  @Test(dependsOnMethods = "TC2")
		  public void TC5() 
		  {
			  Reporter.log("running TC5", true);
		  }
  }

