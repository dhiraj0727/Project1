package hard_assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hard_assert_sample3 {
  @Test
  public void tc1assertnull() {
	  
	  String s = null;
	  String s1 = "dsb";
	  
	  Assert.assertNull(s, "string is not null");
	  Reporter.log("tc is passed sring is empty",true);
	 
	  Assert.assertNull(s1, "string is not null");
	  Reporter.log("tc is passed sring is empty",true);
  }
  
  
  
  
}
