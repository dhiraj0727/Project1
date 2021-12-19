package keywords_testNG_study;

import org.testng.annotations.Test;

import org.testng.Reporter;

public class Priority_keyword_study {
  @Test
  
  public void TC1() {
	  Reporter.log("TC1 is running",true);
  }
  
  
  @Test(priority = 1)
  public void tc2()
  {
	  Reporter.log("tc2 is running",true);  
  }
  
  @Test(priority = -1)
  public void tc3()
  {
	  Reporter.log("tc3 is running",true);  
  }
  
  @Test  (priority = -5)
  public void tc4()
  {
	  Reporter.log("tc4 is running",true);  
  }
  
 
 

}
