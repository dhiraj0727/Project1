package hard_assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hard_assert_sample1 {
  @Test
  public void TC1AssertEquals() {
	  
	  String s1 ="velocity";
	  
	  String s2 = "velocity";
	  
 Assert.assertEquals(s1, s2,"Actual and Expected not matching !!");
	 
	  
	  Reporter.log("s1 and s2 are matching",true) ;
	  
  }
	
}

