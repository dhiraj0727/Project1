package annotation_testng_study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation1_study {
 
	@BeforeClass
	public void beforeclass() {
		  
		  Reporter.log("before class is running",true);
	  }
  
  @BeforeMethod
  public void beformethod()
  {
	  Reporter.log("before method running",true);  
	  
  }
  
  @Test
  public void testmethod() {
	  
	  Reporter.log("tc is running",true);
	  
  }
  @Test 
  
  public void testmethod1()
  {
	  Reporter.log("tc1 is running",true);  
  }
  
  
  @AfterMethod
  
  public void aftermethod() {
	  
	  Reporter.log("after method is running",true);
  }
  

  @AfterClass
public void afterclass() {
	  
	  Reporter.log("after class is running",true);
  }
  
}
