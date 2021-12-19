package keywords_testNG_study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Reporter;


public class invocation_countstudy {
	 
	@BeforeMethod
	  public void beforeMethod() {
		  Reporter.log("before method is running",true);
	  }
	  
  @Test(invocationCount = 4)
  public void TC1() {
	  Reporter.log("TC1 is running",true);
  }
  
  @Test
  public void TC2() {
	  Reporter.log("TC2 is running",true);
  }


  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method is running",true);
  }
}


  